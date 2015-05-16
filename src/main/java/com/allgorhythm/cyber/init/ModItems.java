package com.allgorhythm.cyber.init;


import com.allgorhythm.cyber.Item.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemCyber octironIngot = new ItemOctironIngot();
    public static final ItemCyber octironNugget = new ItemOctironNugget();
    public static final ItemCyber cyberneticVoidCore = new ItemCyberneticVoidCore();
    public static final ItemCyber mobCoreBlaze = new ItemMobCoreBlaze();
    public static final ItemCyber mobCoreCreeper = new ItemMobCoreCreeper();
    public static final ItemCyber mobCoreEnderman = new ItemMobCoreEnderman();
    public static final ItemCyber mobCoreSkeleton = new ItemMobCoreSkeleton();
    public static final ItemCyber mobCoreSpark = new ItemMobCoreSpark();
    public static final ItemCyber mobCoreSpider = new ItemMobCoreSpider();
    public static final ItemCyber mobCoreWitherSkeleton = new ItemMobCoreWitherSkeleton();
    public static final ItemCyber mobCoreZombie = new ItemMobCoreZombie();
    public static final ItemCyber superchargedAirCore = new ItemSuperchargedAirCore();
    public static final ItemCyber superchargedEarthCore = new ItemSuperchargedEarthCore();
    public static final ItemCyber superchargedEnderCore = new ItemSuperchargedEnderCore();
    public static final ItemCyber superchargedFireCore = new ItemSuperchargedFireCore();
    public static final ItemCyber superchargedWaterCore = new ItemSuperchargedWaterCore();


    public static void init()
    {
        GameRegistry.registerItem(octironIngot, "octironIngot");
        GameRegistry.registerItem(octironNugget, "octironNugget");
        GameRegistry.registerItem(cyberneticVoidCore, "cyberneticVoidCore");
        GameRegistry.registerItem(mobCoreBlaze, "mobCoreBlaze");
        GameRegistry.registerItem(mobCoreCreeper, "mobCoreCreeper");
        GameRegistry.registerItem(mobCoreEnderman, "mobCoreEnderman");
        GameRegistry.registerItem(mobCoreSkeleton, "mobCoreSkeleton");
        GameRegistry.registerItem(mobCoreSpark, "mobCoreSpark");
        GameRegistry.registerItem(mobCoreSpider, "mobCoreSpider");
        GameRegistry.registerItem(mobCoreWitherSkeleton, "mobCoreWitherSkeleton");
        GameRegistry.registerItem(mobCoreZombie, "mobCoreZombie");
        GameRegistry.registerItem(superchargedAirCore, "superchargedAirCore");
        GameRegistry.registerItem(superchargedEarthCore, "superchargedEarthCore");
        GameRegistry.registerItem(superchargedEnderCore, "superchargedEnderCore");
        GameRegistry.registerItem(superchargedFireCore, "superchargedFireCore");
        GameRegistry.registerItem(superchargedWaterCore, "superchargedWaterCore");


    }


}
