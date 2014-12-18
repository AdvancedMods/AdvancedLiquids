package com.zandor300.advancedliquids;

import com.zandor300.advancedliquids.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Zandor300 on 18-12-2014.
 */

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, modLanguage = "java", canBeDeactivated = false)
public class AdvancedLiquids {

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		//ModItems.init();
	}

	@Mod.EventHandler
	public void Init(FMLInitializationEvent event) {

	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
