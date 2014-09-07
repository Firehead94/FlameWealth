package com.fire.flamewealth;

import com.fire.flamewealth.handler.ConfigHandler;
import com.fire.flamewealth.items.Items;
import com.fire.flamewealth.utils.WealthLogHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=ModSettings.MOD_ID, name=ModSettings.MOD_NAME, version=ModSettings.VERSION, guiFactory=ModSettings.GUI_FACTORY_LOC)
public class FlameWealth 
{
	@Mod.Instance(ModSettings.MOD_ID)
	public static FlameWealth instance;
	
	/*@SidedProxy(clientSide = ModSettings.CLIENT_PROXY, serverSide = ModSettings.SERVER_PROXY, modId = ModSettings.MOD_ID)
	public static IProxy proxy;
	*/
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e) 
	{ //NetworkHandlers, Configs, Items, Blocks
		WealthLogHelper.debug("start preInit");
		Items.init();
		ConfigHandler.init(e.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigHandler());
		WealthLogHelper.info("preInit Complete");

	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent e) 
	{ //GUIs, TileEntities, Crafting
		WealthLogHelper.debug("start init");
		WealthLogHelper.info("init Complete");
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e) 
	{ //Things after other mods
		WealthLogHelper.debug("start postInit");
		WealthLogHelper.info("postInit Complete");
	}

}
