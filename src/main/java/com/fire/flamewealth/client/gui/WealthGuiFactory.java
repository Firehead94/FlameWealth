package com.fire.flamewealth.client.gui;

import java.util.Set;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;

import com.fire.flamecore.client.gui.ConfigGuiConfig;
import com.fire.flamecore.client.gui.GuiFactory;

import cpw.mods.fml.client.IModGuiFactory;
import cpw.mods.fml.client.IModGuiFactory.RuntimeOptionCategoryElement;
import cpw.mods.fml.client.IModGuiFactory.RuntimeOptionGuiHandler;


public class WealthGuiFactory implements IModGuiFactory 
{

	@Override
	public void initialize(Minecraft minecraftInstance) 
	{
				
	}

	@Override
	public Class<? extends GuiScreen> mainConfigGuiClass() 
	{
		return WealthConfigGui.class;
	}

	@Override
	public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() 
	{
		return null;
	}

	@Override
	public RuntimeOptionGuiHandler getHandlerFor(RuntimeOptionCategoryElement element) 
	{
		return null;
	}
	

}