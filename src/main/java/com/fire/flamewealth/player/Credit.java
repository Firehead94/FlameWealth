package com.fire.flamewealth.player;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

import com.fire.flamewealth.ModSettings;
import com.fire.flamewealth.network.CreditPacket;
import com.fire.flamewealth.network.PacketHandler;
import com.fire.flamewealth.utils.WealthLogHelper;

import cpw.mods.fml.relauncher.Side;

public class Credit implements IExtendedEntityProperties {
	
	private double credit;
	public static final String IDENTIFIER = "fc_credit";
	private EntityPlayer player;
	
	public Credit()
	{
		//this.credit = ModSettings.CREDIT;
	}
	
	public Credit(EntityPlayer player)
	{
		loadNBTData(player.getEntityData());
		
	}
	
	public static Credit getCredit(Entity player)
	{
		return (Credit)player.getExtendedProperties(IDENTIFIER);
	}

	@Override
	public void saveNBTData(NBTTagCompound compound) {
		compound.setDouble(ModSettings.NBT_TAG_CREDITS, credit);
		WealthLogHelper.info(compound.getDouble(ModSettings.NBT_TAG_CREDITS) + "| Save");
	}

	@Override
	public void loadNBTData(NBTTagCompound compound) {
		credit = compound.getDouble(ModSettings.NBT_TAG_CREDITS);
		WealthLogHelper.info(credit + "| Load");
		if (Side.CLIENT != null)
			PacketHandler.INSTANCE.sendTo(new CreditPacket("Testing"), (EntityPlayerMP)player);
	}

	@Override
	public void init(Entity entity, World world) {
		// TODO Auto-generated method stub
		
	}
	
	public void addCredit(double val)
	{
		credit += val;
	}
	
	public void removeCredit(double val)
	{
		if (credit >= val)
			credit -= val;
	}

}
