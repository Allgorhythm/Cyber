package com.allgorhythm.cyber.init;


import com.allgorhythm.cyber.Item.ItemCyber;
import com.allgorhythm.cyber.Item.ItemOctironIngot;
import com.allgorhythm.cyber.Item.ItemOctironNugget;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemCyber octironIngot = new ItemOctironIngot();
    public static final ItemCyber octironNugget = new ItemOctironNugget();

    public static void init()
    {
        GameRegistry.registerItem(octironIngot, "octironIngot");
        GameRegistry.registerItem(octironNugget, "octironNugget");
    }


}
