package com.fire.flamewealth.utils;

import org.apache.logging.log4j.Level;

import com.fire.flamewealth.ModSettings;
import com.fire.flamecore.utils.LogHelper;

import cpw.mods.fml.common.FMLLog;

public class WealthLogHelper extends LogHelper {
	
	public static void log(Level logLevel, Object object)
	{
		FMLLog.log(ModSettings.MOD_NAME, logLevel, String.valueOf(object));
	}

}
