package com.allgorhythm.cyber;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Brandon on 5/9/2015.
 */

    @Mod(modid = "cyber", name = "Cyber()", version = "1.7.2-1.0")
    public class cyber
    {

        @Mod.Instance("cyber")
        public static cyber instance;

        @Mod.EventHandler
        public void preinit (FMLPreInitializationEvent event)
        {

        }

        @Mod.EventHandler
        public void  init (FMLInitializationEvent event)
        {

        }

        @Mod.EventHandler
        public void postinit (FMLPostInitializationEvent event)
        {

        }
    }


