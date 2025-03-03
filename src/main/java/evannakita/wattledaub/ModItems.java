package evannakita.wattledaub;

import evannakita.wattledaub.item.DaubItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item CLAY_DAUB_BALL = new DaubItem(new Item.Settings());
    public static final Item COARSE_CLAY_DAUB_BALL = new DaubItem(new Item.Settings());
    public static final Item MUD_DAUB_BALL = new DaubItem(new Item.Settings());
    public static final Item PACKED_MUD_DAUB_BALL = new DaubItem(new Item.Settings());
    public static final Item SAND_DAUB_BALL = new DaubItem(new Item.Settings());

    public static final Item SCATTERED_CLAY_DAUB = new BlockItem(ModBlocks.SCATTERED_CLAY_DAUB, new Item.Settings());
    public static final Item COVERED_CLAY_DAUB = new BlockItem(ModBlocks.COVERED_CLAY_DAUB, new Item.Settings());
    public static final Item CLAY_DAUB = new BlockItem(ModBlocks.CLAY_DAUB, new Item.Settings());
    public static final Item SCATTERED_COARSE_CLAY_DAUB = new BlockItem(ModBlocks.SCATTERED_COARSE_CLAY_DAUB, new Item.Settings());
    public static final Item COARSE_CLAY_DAUB = new BlockItem(ModBlocks.COARSE_CLAY_DAUB, new Item.Settings());
    public static final Item COVERED_COARSE_CLAY_DAUB = new BlockItem(ModBlocks.COVERED_COARSE_CLAY_DAUB, new Item.Settings());
    public static final Item SCATTERED_MUD_DAUB = new BlockItem(ModBlocks.SCATTERED_MUD_DAUB, new Item.Settings());
    public static final Item COVERED_MUD_DAUB = new BlockItem(ModBlocks.COVERED_MUD_DAUB, new Item.Settings());
    public static final Item MUD_DAUB = new BlockItem(ModBlocks.MUD_DAUB, new Item.Settings());
    public static final Item SCATTERED_PACKED_MUD_DAUB = new BlockItem(ModBlocks.SCATTERED_PACKED_MUD_DAUB, new Item.Settings());
    public static final Item COVERED_PACKED_MUD_DAUB = new BlockItem(ModBlocks.COVERED_PACKED_MUD_DAUB, new Item.Settings());
    public static final Item PACKED_MUD_DAUB = new BlockItem(ModBlocks.PACKED_MUD_DAUB, new Item.Settings());
    public static final Item SCATTERED_SAND_DAUB = new BlockItem(ModBlocks.SCATTERED_SAND_DAUB, new Item.Settings());
    public static final Item COVERED_SAND_DAUB = new BlockItem(ModBlocks.COVERED_SAND_DAUB, new Item.Settings());
    public static final Item SAND_DAUB = new BlockItem(ModBlocks.SAND_DAUB, new Item.Settings());
    public static final Item WATTLE = new BlockItem(ModBlocks.WATTLE, new Item.Settings());

    public static Item register(String id, Item item) {
        return (Item)Registry.register(Registries.ITEM, new Identifier(WattleAndDaub.MOD_ID, id), item);
    }

}
