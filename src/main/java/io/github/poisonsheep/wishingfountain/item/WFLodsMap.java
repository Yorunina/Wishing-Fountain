package io.github.poisonsheep.wishingfountain.item;

import com.endertech.minecraft.mods.adlods.deposit.DepositGenResult;
import com.endertech.minecraft.mods.adlods.world.WorldDeposits;
import io.github.poisonsheep.wishingfountain.WishingFountain;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

import java.util.Optional;

public class WFLodsMap extends WFMapItem{

    @Override
    protected ItemStack search(ItemStack stack, ServerLevel worldIn, Player player, int slot) {
        String targetOre = stack.getOrCreateTag().getString(TARGET);
        if(targetOre.isEmpty()) {
            return ItemStack.EMPTY;
        }
        Optional<DepositGenResult> depositOpt = WorldDeposits.get(worldIn).generated().values()
                .parallelStream()
                .filter((dep) -> dep.name.equals(targetOre))
                .findAny();


        if(depositOpt.isEmpty()) {
            worldIn.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.GLASS_BREAK, SoundSource.PLAYERS, 1F, 1F);
            return ItemStack.EMPTY;
        } else {
            BlockPos found = depositOpt.get().pos;
            worldIn.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.BUCKET_FILL, SoundSource.PLAYERS, 1F, 1F);
            return createMap(worldIn, found, new ResourceLocation(WishingFountain.MODID, targetOre));
        }
    }

    public static void setTarget(ItemStack itemStack, String target) {
        itemStack.getOrCreateTag().putString(TARGET, target);
    }
}
