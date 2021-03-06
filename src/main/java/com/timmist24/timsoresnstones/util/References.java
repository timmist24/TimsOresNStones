package com.timmist24.timsoresnstones.util;

import com.timmist24.timsoresnstones.texturing.Color;

import java.io.File;

public class References {
    public static final String MODID = "tosm";
    public static final String  NAME = "Tim's ore n stone mod";
    public static final String VERSION = "1.12.2-0.0";
    public static final String ACCEPTED_VERSIONS = "[1.12.2]";
    public static final String CLIENT_PROXY_CLASS = "com.timmist24.timsoresnstones.proxy.ClientProxy";
    public static final String COMMON_PROXY_CLASS = "com.timmist24.timsoresnstones.proxy.CommonProxy";

    public static final String NESTING_DIRECTORY_PATH= System.getProperty("user.dir").substring(0,System.getProperty("user.dir").lastIndexOf(File.separator))+"\\src\\main";
//    private static final String[] components = {"Ingot", "Nugget", "Gear", "Rod", "plate"};
//    public static final List<String> GEMS_EXTRAS = new ArrayList<String>(Arrays.asList("raw", "unpure", "cut", "gem"));

    public static final int MB_IN_TINY_DUST = 2;
    public static final int MB_SMALL_DUST = 16;
    public static final int MB_IN_DUST_OR_INGOT = 144;
    public static final int MAZIMUM_MINERAL = (MB_IN_DUST_OR_INGOT/2)*3;
    public static final Color DEFAULT_COLOR = new Color("b7410e"); // looks like iron
}
