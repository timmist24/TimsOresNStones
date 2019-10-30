package com.timmist24.timsoresnstones.init;

import com.timmist24.timsoresnstones.items.ItemTosm;
import com.timmist24.timsoresnstones.items.materials.Dust;
import com.timmist24.timsoresnstones.items.materials.ore.OrePiece;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import scala.Char;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ModItems {
    private static final List<String> MINERAL_TITLES = new ArrayList<String>();
    public static final List<Item> ITEMS = new ArrayList<>();

    //public static final Item.ToolMaterial TOOL_MATERIAL_NONE = EnumHelper.addToolMaterial();
        static {
        Collection<Block> blocks = GameRegistry.findRegistry(Block.class).getValuesCollection();
        for (Block block: blocks){
            String blockName = block.getUnlocalizedName();
            if(blockName.contains("ore")) {
                List<IBlockState> lise = block.getBlockState().getValidStates();
                for(IBlockState state: lise){
                    String title = state.toString();
                    Matcher matcher = Pattern.compile("[^0]*([A-Z][^0]+)").matcher(title);
                    String mineralTitle;
                    if(matcher.matches()){
                        mineralTitle = matcher.group(1);
                    }
                    else {
                        mineralTitle = title;
                    }
                    if(!MINERAL_TITLES.contains(mineralTitle)){
                        MINERAL_TITLES.add(mineralTitle);
                    }
                }
            }
        }

        for (String title: MINERAL_TITLES){
            new ItemTosm("test"+title);
        }
    }


    public static final Item STONE_PIECE = new ItemTosm("stone_piece");
    public static final Item ORE = new OrePiece("ore");
    public static final Item DUST = new Dust("dust");
}
