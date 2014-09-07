package com.fire.flamewealth.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.fire.flamewealth.ModSettings;
import com.fire.flamewealth.items.Items;

public class CreativeTabGeneral {
	
	public static final CreativeTabs FW_TAB = new CreativeTabs(ModSettings.MOD_ID)
	{
		@Override
		public Item getTabIconItem()
		{
			return Items.coin; //Return Item for its Icon
		}
		
	};

}
