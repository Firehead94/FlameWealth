package com.fire.flamewealth.items;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.fire.flamewealth.ModSettings;
import com.fire.flamewealth.utils.Colors;
import com.fire.flamewealth.utils.WealthLogHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class WealthCoinItem extends WealthBaseItem 
{
	public WealthCoinItem() 
	{
		super();
		this.setHasSubtypes(true);
		
	}
	
	public static List<ItemStack> getCoins() 
	{
		List<ItemStack> coinStack = new ArrayList<ItemStack>();
		
		for (int i = 0; i < 5; i++)
		{
			coinStack.add(new ItemStack(Items.coin, 1, i));
		}
		
		return coinStack;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public int getColorFromItemStack(ItemStack itemStack, int rp)
	{
		switch(itemStack.getItemDamage())
		{
		case 0:
			return Colors.COPPER.rgb;
		case 1:
			return Colors.IRON.rgb;
		case 2:
			return Colors.GOLD.rgb;
		case 3:
			return Colors.EMERALD.rgb;
		case 4:
			return Colors.DIAMOND.rgb;
		default:
			return 16777215;//Colors.WHITE.rgb;
		}
	}
	
	@Override
	public String getUnlocalizedName()
	{
		return String.format("item.%s%s", ModSettings.MOD_ID.toLowerCase() + ":", ItemSettings.Coins.NAME);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemStack)
	{
		return String.format("item.%s%s.%s", ModSettings.MOD_ID.toLowerCase() + ":", ItemSettings.Coins.NAME, Colors.values()[itemStack.getItemDamage()].getName().toLowerCase());
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item item, CreativeTabs ct, List list)
	{
		for (int i = 0; i < 5; i++)
		{
			list.add(new ItemStack(this, 1, i));
		}
	}

}
