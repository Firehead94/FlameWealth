package com.fire.flamewealth.utils;

import java.util.UUID;

import net.minecraft.item.ItemStack;

import com.fire.flamecore.ModSettings;
import com.fire.flamecore.utils.NBTUtils;

public class WealthNBTUtils extends NBTUtils {
	
	public static boolean hasUUID(ItemStack itemStack)
	{
		return ((hasTag(itemStack, ModSettings.NBT_TAG_UUID_M_SIG) && hasTag(itemStack, ModSettings.NBT_TAG_UUID_L_SIG)) ||
				(hasTag(itemStack, ModSettings.NBT_TAG_OWNER_UUID_M_SIG) && hasTag(itemStack, ModSettings.NBT_TAG_OWNER_UUID_L_SIG)));
	}
	
	public static void setUUID(ItemStack itemStack)
	{
		initNBTTagCompound(itemStack);
		
		if (!hasUUID(itemStack))
		{
			UUID itemUUID = UUID.randomUUID();
			setLong(itemStack, ModSettings.NBT_TAG_UUID_M_SIG, itemUUID.getMostSignificantBits());
			setLong(itemStack, ModSettings.NBT_TAG_UUID_L_SIG, itemUUID.getLeastSignificantBits());
		}
	}

}
