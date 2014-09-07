package com.fire.flamewealth.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import com.fire.flamewealth.ModSettings;
import com.fire.flamewealth.handler.ConfigHandler;

import cpw.mods.fml.client.config.GuiConfig;

public class WealthConfigGui extends GuiConfig {

	public WealthConfigGui(GuiScreen guiScreen) {
		super(guiScreen,
                new ConfigElement(ConfigHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                ModSettings.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigHandler.configuration.toString()));

	}

}
