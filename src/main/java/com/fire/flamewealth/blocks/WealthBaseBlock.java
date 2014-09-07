package com.fire.flamewealth.blocks;

import net.minecraft.block.material.Material;

import com.fire.flamecore.blocks.BaseBlock;
import com.fire.flamewealth.creativetab.CreativeTabGeneral;

public class WealthBaseBlock extends BaseBlock {
	
	public WealthBaseBlock() {
		super(Material.rock);
		setCreativeTab(CreativeTabGeneral.FW_TAB);
	}
	
	public WealthBaseBlock(Material mat) {
		super(mat);
		setCreativeTab(CreativeTabGeneral.FW_TAB);
	}

}
