package io.github.poisonsheep.wishingfountain.item;

import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import net.minecraft.core.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.chunk.ChunkStatus;
import net.minecraft.world.level.levelgen.structure.BuiltinStructures;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructureCheckResult;
import net.minecraft.world.level.levelgen.structure.StructureStart;
import net.minecraft.world.level.levelgen.structure.placement.StructurePlacement;

import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WFStructureMap extends WFMapItem{

    @Override
    protected ItemStack search(ItemStack stack, ServerLevel worldIn, Player player, int slot) {
        ResourceLocation target = getTarget(stack);
        if(target == null) {
            return ItemStack.EMPTY;
        }
        int centerX = stack.getOrCreateTag().getInt(SOURCE_X);
        int centerZ = stack.getOrCreateTag().getInt(SOURCE_Z);
        BlockPos centerPos = new BlockPos(centerX, 64, centerZ);
        Map<StructurePlacement, Structure> placementToStructuresMap = new Object2ObjectArrayMap<>();
        Structure structure = getStructureForKey(worldIn, getTarget(stack));
        for(StructurePlacement structureplacement : worldIn.getChunkSource().getGeneratorState().getPlacementsForStructure(getHolderForStructure(worldIn, structure))) {
            placementToStructuresMap.put(structureplacement, structure);
        }
        InteractionResultHolder<BlockPos> result = null;
        System.out.println(placementToStructuresMap.entrySet().size());
        for (Map.Entry<StructurePlacement, Structure> entry : placementToStructuresMap.entrySet()) {
            StructurePlacement placement = entry.getKey();
            result = concurrentSearch(worldIn, stack, centerPos, placement, entry.getValue());
        }
        if(result == null || result.getResult() == InteractionResult.FAIL) {
            worldIn.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.GLASS_BREAK, SoundSource.PLAYERS, 1F, 1F);
            return ItemStack.EMPTY;
        } else if(result.getResult() == InteractionResult.PASS) {
            return stack;
        } else {
            BlockPos found = result.getObject();
            worldIn.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.BOTTLE_EMPTY, SoundSource.PLAYERS, 1F, 1F);
            return createMap(worldIn, found, target, stack);
        }
    }

    protected ResourceLocation getTarget(ItemStack stack) {
        String tagStructure = stack.getOrCreateTag().getString(TARGET);
        if(tagStructure.isEmpty()) {
            return BuiltinStructures.END_CITY.location();
        }
        return new ResourceLocation(tagStructure);
    }

    private InteractionResultHolder<BlockPos> concurrentSearch(ServerLevel worldIn, ItemStack stack, BlockPos pos, StructurePlacement placement, Structure structure) {
        Key key = new Key(GlobalPos.of(worldIn.dimension(), pos), structure, placement);
        if(COMPUTING.contains(key)) {
            return InteractionResultHolder.pass(BlockPos.ZERO);
        } else if(RESULTS.containsKey(key)) {
            var ret = RESULTS.get(key);
            if(ret.getResult() == InteractionResult.PASS) {
                return InteractionResultHolder.fail(BlockPos.ZERO);
            }
            return ret;
        } else {
            ItemStack dummy = stack.copy();
            EXECUTORS.submit(() -> {
                COMPUTING.add(key);
                RESULTS.put(key, iterativeSearch(worldIn, dummy, pos, placement, structure));
                COMPUTING.remove(key);
            });
            return InteractionResultHolder.pass(BlockPos.ZERO);
        }
    }

    private InteractionResultHolder<BlockPos> iterativeSearch(ServerLevel worldIn, ItemStack stack, BlockPos pos, StructurePlacement placement, Structure structure) {
        for(int i = 0; i < Integer.MAX_VALUE; i++) {
            BlockPos blockPos = nextPos(stack, 16);
            System.out.println(blockPos);
            if(blockPos == null) {
                return InteractionResultHolder.fail(BlockPos.ZERO);
            }
            //将绝对坐标转化为区块坐标
            int chunkX = blockPos.getX() >> 4;
            int chunkY = blockPos.getZ() >> 4;
            ChunkPos chunkPos = new ChunkPos(chunkX, chunkY);
            BlockPos currentPos = new BlockPos(SectionPos.sectionToBlockCoord(chunkPos.x, 8), 0, SectionPos.sectionToBlockCoord(chunkPos.z, 8));
            BlockPos structurePos = getStructureGeneratingAt(worldIn, chunkPos, structure, placement);
            if(structurePos != null) {
                double newDist = pos.distSqr(currentPos);
                double oldDist = stack.getOrCreateTag().getDouble(DISTANCE);
                if(newDist < oldDist) {
                    stack.getOrCreateTag().putDouble(DISTANCE, newDist);
                    return InteractionResultHolder.sidedSuccess(structurePos, worldIn.isClientSide);
                }
            }
        }
        return InteractionResultHolder.pass(BlockPos.ZERO);
    }

    private BlockPos getStructureGeneratingAt(ServerLevel worldIn, ChunkPos chunkPos, Structure structure, StructurePlacement placement) {
        StructureCheckResult result = worldIn.structureManager().checkStructurePresence(chunkPos, structure, false);
        if (result != StructureCheckResult.START_NOT_PRESENT) {
            if (result == StructureCheckResult.START_PRESENT) {
                return placement.getLocatePos(chunkPos);
            }
            ChunkAccess chunkAccess = worldIn.getChunk(chunkPos.x, chunkPos.z, ChunkStatus.STRUCTURE_STARTS);
            StructureStart structureStart = worldIn.structureManager().getStartForStructure(SectionPos.bottomOf(chunkAccess), structure, chunkAccess);
            if (structureStart != null && structureStart.isValid()) {
                return placement.getLocatePos(structureStart.getChunkPos());
            }
        }return null;
    }

    public static Structure getStructureForKey(ServerLevel level, ResourceLocation key) {
        return getStructureRegistry(level).get(key);
    }

    private static Registry<Structure> getStructureRegistry(ServerLevel level) {
        return level.registryAccess().registryOrThrow(Registries.STRUCTURE);
    }

    public static Holder<Structure> getHolderForStructure(ServerLevel level, Structure structure) {
        Optional<ResourceKey<Structure>> optional = getStructureRegistry(level).getResourceKey(structure);
        return optional.map(structureResourceKey -> getStructureRegistry(level).getHolderOrThrow(structureResourceKey)).orElse(null);
    }

    public static void setTarget(ItemStack itemStack, String target) {
        itemStack.getOrCreateTag().putString(TARGET, target);
    }

    private record Key(GlobalPos pos,Structure structure, StructurePlacement placement) {}
    private static final Set<Key> COMPUTING = ConcurrentHashMap.newKeySet();
    private static final Map<Key, InteractionResultHolder<BlockPos>> RESULTS = new ConcurrentHashMap<>();
    protected static final ExecutorService EXECUTORS = Executors.newCachedThreadPool();
}
