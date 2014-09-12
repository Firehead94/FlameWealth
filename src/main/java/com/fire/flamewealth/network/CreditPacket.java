package com.fire.flamewealth.network;

import io.netty.buffer.ByteBuf;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;

public class CreditPacket implements IMessage, IMessageHandler<CreditPacket, IMessage> {
	
	private String msg;
	
	public CreditPacket() 
	{
	}
	
	public CreditPacket(String text)
	{
		msg = text;
	}
	
	@Override
	public void toBytes(ByteBuf buf)
	{
		ByteBufUtils.writeUTF8String(buf, msg);
	}
	
	@Override
	public void fromBytes(ByteBuf buf)
	{
		msg = ByteBufUtils.readUTF8String(buf);
	}
	
	@Override
	public IMessage onMessage(CreditPacket message, MessageContext ctx)
	{
		System.out.println(String.format("Received %s from %s", message.msg, ctx.getServerHandler().playerEntity.getDisplayName()));
		return null;
	}

}
