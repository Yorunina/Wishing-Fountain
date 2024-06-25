package io.github.poisonsheep.wishingfountain.util;

import com.google.common.collect.Lists;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.NbtUtils;

import java.util.List;

public final class PosListData {
    private final List<BlockPos> data = Lists.newArrayList();

    public ListTag serialize() {
        ListTag nbt = new ListTag();
        for (BlockPos pos : data) {
            nbt.add(NbtUtils.writeBlockPos(pos));
        }
        return nbt;
    }

    public void deserialize(ListTag nbt) {
        data.clear();
        for (int i = 0; i < nbt.size(); i++) {
            data.add(NbtUtils.readBlockPos(nbt.getCompound(i)));
        }
    }

    public List<BlockPos> getData() {
        return data;
    }

    public void add(BlockPos pos) {
        this.data.add(pos);
    }
}
