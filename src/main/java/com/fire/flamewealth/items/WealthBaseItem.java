package com.fire.flamewealth.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;

import com.fire.flamecore.items.BaseItem;
import com.fire.flamewealth.ModSettings;
import com.fire.flamewealth.creativetab.CreativeTabGeneral;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class WealthBaseItem extends BaseItem {
	
	public WealthBaseItem() {
		super();
		setCreativeTab(CreativeTabGeneral.FW_TAB);
	}
	
	@Override
	public String getUnlocalizedName()
	{
		return String.format("item.%s%s", ModSettings.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName("super")));
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemstack)
	{
		return String.format("item.%s%s", ModSettings.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName("super")));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalName)
	{
		return unlocalName.substring(unlocalName.indexOf(".") + 1);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1)); 
	}

}
