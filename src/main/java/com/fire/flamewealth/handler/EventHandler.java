package com.fire.flamewealth.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.entity.player.BonemealEvent;

import com.fire.flamewealth.player.Credit;
import com.fire.flamewealth.utils.WealthLogHelper;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class EventHandler {
	
	@SubscribeEvent
	public void EntityConstructing(EntityConstructing event)
	{
		if (event.entity instanceof EntityPlayer)
		{
			event.entity.registerExtendedProperties(Credit.IDENTIFIER, new Credit((EntityPlayer)event.entity));
		}
	}
	
	@SubscribeEvent
	public void BonemealEvent(BonemealEvent event)
	{
		if (event.entity instanceof EntityPlayer)
		{
			Credit credit = Credit.getCredit(event.entity);
			credit.addCredit(100);
			WealthLogHelper.info("Added Credit to Player " + event.entityPlayer.getDisplayName());
		}
	}

}
