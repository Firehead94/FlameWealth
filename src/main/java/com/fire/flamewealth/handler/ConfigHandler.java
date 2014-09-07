package com.fire.flamewealth.handler;

import java.io.File;

import com.fire.flamecore.ModSettings;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

public class ConfigHandler 
{
	public static Configuration configuration;
	
	public static void init(File configFile) 
	{
		if (configuration == null)
		{
			configuration = new Configuration(configFile);
			loadConfiguration();
		}
	}
	
	
	@SubscribeEvent
	public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
	{
		if (event.modID.equalsIgnoreCase(ModSettings.MOD_ID))
		{
			// Resync
			loadConfiguration();
		}
	}
	
	private static void loadConfiguration() 
	{
		if (configuration.hasChanged())
		{
			configuration.save();
		}
		
	}
}
