package evannakita.wattledaub;

import evannakita.wattledaub.block.DaubBlock;
import evannakita.wattledaub.block.WattleBlock;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block SCATTERED_CLAY_DAUB = new DaubBlock(
        Settings.create()
            .mapColor(MapColor.DIRT_BROWN)
            .sounds(BlockSoundGroup.MUD)
            .strength(1.0F, 3.0F)
    );

    public static final Block COVERED_CLAY_DAUB = new DaubBlock(
        Settings.create()
            .mapColor(MapColor.DIRT_BROWN)
            .sounds(BlockSoundGroup.MUD)
            .strength(1.0F, 3.0F)
    );

    public static final Block CLAY_DAUB = new DaubBlock(
        Settings.create()
            .mapColor(MapColor.DIRT_BROWN)
            .sounds(BlockSoundGroup.MUD)
            .strength(1.0F, 3.0F)
    );

    public static final Block SCATTERED_COARSE_CLAY_DAUB = new DaubBlock(
        Settings.create()
            .mapColor(MapColor.DIRT_BROWN)
            .sounds(BlockSoundGroup.MUD)
            .strength(1.0F, 3.0F)
    );

    public static final Block COVERED_COARSE_CLAY_DAUB = new DaubBlock(
        Settings.create()
            .mapColor(MapColor.DIRT_BROWN)
            .sounds(BlockSoundGroup.MUD)
            .strength(1.0F, 3.0F)
    );

    public static final Block COARSE_CLAY_DAUB = new DaubBlock(
        Settings.create()
            .mapColor(MapColor.DIRT_BROWN)
            .sounds(BlockSoundGroup.MUD)
            .strength(1.0F, 3.0F)
    );

    public static final Block SCATTERED_MUD_DAUB = new DaubBlock(
        Settings.create()
            .mapColor(MapColor.DIRT_BROWN)
            .sounds(BlockSoundGroup.MUD)
            .strength(1.0F, 3.0F)
    );

    public static final Block COVERED_MUD_DAUB = new DaubBlock(
        Settings.create()
            .mapColor(MapColor.DIRT_BROWN)
            .sounds(BlockSoundGroup.MUD)
            .strength(1.0F, 3.0F)
    );

    public static final Block MUD_DAUB = new DaubBlock(
        Settings.create()
            .mapColor(MapColor.DIRT_BROWN)
            .sounds(BlockSoundGroup.MUD)
            .strength(1.0F, 3.0F)
    );

    public static final Block SCATTERED_PACKED_MUD_DAUB = new DaubBlock(
        Settings.create()
            .mapColor(MapColor.DIRT_BROWN)
            .sounds(BlockSoundGroup.MUD)
            .strength(1.0F, 3.0F)
    );

    public static final Block COVERED_PACKED_MUD_DAUB = new DaubBlock(
        Settings.create()
            .mapColor(MapColor.DIRT_BROWN)
            .sounds(BlockSoundGroup.MUD)
            .strength(1.0F, 3.0F)
    );

    public static final Block PACKED_MUD_DAUB = new DaubBlock(
        Settings.create()
            .mapColor(MapColor.DIRT_BROWN)
            .sounds(BlockSoundGroup.MUD)
            .strength(1.0F, 3.0F)
    );

    public static final Block SCATTERED_SAND_DAUB = new DaubBlock(
        Settings.create()
            .mapColor(MapColor.PALE_YELLOW)
            .sounds(BlockSoundGroup.MUD)
            .strength(1.0F, 3.0F)
    );

    public static final Block COVERED_SAND_DAUB = new DaubBlock(
        Settings.create()
            .mapColor(MapColor.PALE_YELLOW)
            .sounds(BlockSoundGroup.MUD)
            .strength(1.0F, 3.0F)
    );

    public static final Block SAND_DAUB = new DaubBlock(
        Settings.create()
            .mapColor(MapColor.PALE_YELLOW)
            .sounds(BlockSoundGroup.MUD)
            .strength(1.0F, 3.0F)
    );

    public static final Block WATTLE = new WattleBlock(
        Settings.create()
            .mapColor(MapColor.OAK_TAN)
            .breakInstantly()
            .sounds(BlockSoundGroup.BAMBOO)
            .strength(1.0F)
            .burnable()
    );

    public static Block register(String id, Block block) {
        return (Block)Registry.register(Registries.BLOCK, Identifier.of(WattleAndDaub.MOD_ID, id), block);
    }
}