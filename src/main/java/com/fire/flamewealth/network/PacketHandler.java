package com.fire.flamewealth.network;

import com.fire.flamewealth.ModSettings;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;

public class PacketHandler 
{
	public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(ModSettings.FIRECHANNEL);
	
	public static void init()
	{
		INSTANCE.registerMessage(CreditPacket.class, CreditPacket.class, 0, Side.CLIENT);
	}
}
