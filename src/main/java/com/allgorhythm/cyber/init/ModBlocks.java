package com.allgorhythm.cyber.init;

import com.allgorhythm.cyber.block.BlockCyber;
import com.allgorhythm.cyber.block.BlockOctironBlock;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
    public static final BlockCyber octironBlock = new BlockOctironBlock();

    public static void init()
    {
        GameRegistry.registerBlock(octironBlock, "octironBlock");
    }
}
