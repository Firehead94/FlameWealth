package com.fire.flamewealth.utils;

import java.util.UUID;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import com.fire.flamecore.ModSettings;
import com.fire.flamecore.utils.ItemUtils;
import com.fire.flamecore.utils.NBTUtils;

public class WealthItemUtils extends ItemUtils {
	
	public static void setOwner(ItemStack itemStack, EntityPlayer eP)
	{
		NBTUtils.setString(itemStack, ModSettings.NBT_TAG_OWNER, eP.getDisplayName());
		NBTUtils.setLong(itemStack, ModSettings.NBT_TAG_OWNER_UUID_M_SIG, eP.getUniqueID().getMostSignificantBits());
		NBTUtils.setLong(itemStack, ModSettings.NBT_TAG_OWNER_UUID_L_SIG, eP.getUniqueID().getLeastSignificantBits());
	}
	
	public static UUID getOwnerUUID(ItemStack itemStack)
	{
		if (NBTUtils.hasTag(itemStack, ModSettings.NBT_TAG_OWNER_UUID_M_SIG) && NBTUtils.hasTag(itemStack, ModSettings.NBT_TAG_OWNER_UUID_L_SIG))
		{
			return new UUID(NBTUtils.getLong(itemStack, ModSettings.NBT_TAG_OWNER_UUID_M_SIG), NBTUtils.getLong(itemStack, ModSettings.NBT_TAG_OWNER_UUID_L_SIG));
		}
		
		return null;
	}

}
