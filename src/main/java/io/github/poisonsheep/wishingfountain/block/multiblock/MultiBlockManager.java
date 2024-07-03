package io.github.poisonsheep.wishingfountain.block.multiblock;

import com.google.common.collect.Lists;

import java.util.List;

public final class MultiBlockManager {

    private MultiBlockManager() {
        MULTI_BLOCK_LIST = Lists.newArrayList();
    }

    public static void init() {
        MultiBlockManager manager = new MultiBlockManager();
        manager.add(new WFMultiBlock());
    }
    private static List<IMultiBlock> MULTI_BLOCK_LIST;

    public static List<IMultiBlock> getMultiBlockList() {
        return MULTI_BLOCK_LIST;
    }

    public void add(IMultiBlock multiBlock) {
        MULTI_BLOCK_LIST.add(multiBlock);
    }

}
