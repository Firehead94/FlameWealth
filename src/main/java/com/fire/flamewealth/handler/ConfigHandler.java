package com.fire.flamewealth.handler;

import java.io.File;



import com.fire.flamewealth.ModSettings;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

public class ConfigHandler 
{
	public static Configuration configuration;
	public static double DEFAULT_CREDIT = 100;
	
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
		ModSettings.CREDIT = configuration.getInt("Credit", Configuration.CATEGORY_GENERAL, (int)DEFAULT_CREDIT, 0, 1000, "Hey Comment");
		
		if (configuration.hasChanged())
		{
			configuration.save();
		}
		
	}
}
