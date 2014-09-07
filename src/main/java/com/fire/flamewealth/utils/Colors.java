package com.fire.flamewealth.utils;

public enum Colors {
	
	COPPER("#a5632f"),
	IRON("#bbbdba"),
	GOLD("#f1d73c"),
	EMERALD("#3fd566"),
	DIAMOND("#24cbc3"),
	
	BLACK("1E1B1B"),
	RED("B3312C"),
	GREEN("3B511A"),
	BROWN("5320730"),
	BLUE("51301A"),
	PURPLE("7B2FBE"),
	CYAN("287697"),
	LIGHTGRAY("ABABAB"),
	GRAY("434343"),
	PINK("D88198"),
	LIME("41CD34"),
	YELLOW("DECF2A"),
	LIGHTBLUE("6689D3"),
	MAGENTA("C354CD"),
	ORANGE("EB8844"),
	WHITE("F0F0F0");
	
	
	public final String hex;
	public final int rgb;
	
	Colors(String rgb)
	{
		hex = rgb;
		this.rgb = getRGBFromHex(hex);
	}
	
	public int getRGBInt(int r, int g, int b)
	{
		return (r*256*256) + (g*256) + b;
	}
	
	public int getRGBFromHex(String hex)
	{
        int r = Integer.valueOf( hex.substring( 1, 3 ), 16 );
        int g =Integer.valueOf( hex.substring( 3, 5 ), 16 );
        int b = Integer.valueOf( hex.substring( 5, 7 ), 16 );
        return getRGBInt(r, g, b);
	}
	
	public String getName()
	{
		return this.name();
	}
	
	

}
