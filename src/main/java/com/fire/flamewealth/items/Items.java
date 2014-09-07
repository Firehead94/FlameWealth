package com.fire.flamewealth.items;

import cpw.mods.fml.common.registry.GameRegistry;

public class Items {
	
	public static final WealthBaseItem coin = new WealthCoinItem();
	
	public static void init()
	{
		GameRegistry.registerItem(coin, ItemSettings.Coins.NAME);
	}

}
