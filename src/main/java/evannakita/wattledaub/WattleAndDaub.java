package evannakita.wattledaub;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WattleAndDaub implements ModInitializer {
	public static final String MOD_ID = "wattledaub";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");

		ModBlocks.register("scattered_clay_daub", ModBlocks.SCATTERED_CLAY_DAUB);
		ModItems.register("scattered_clay_daub", ModItems.SCATTERED_CLAY_DAUB);
		ModBlocks.register("covered_clay_daub", ModBlocks.COVERED_CLAY_DAUB);
		ModItems.register("covered_clay_daub", ModItems.COVERED_CLAY_DAUB);
		ModBlocks.register("clay_daub", ModBlocks.CLAY_DAUB);
		ModItems.register("clay_daub", ModItems.CLAY_DAUB);
		ModBlocks.register("scattered_coarse_clay_daub", ModBlocks.SCATTERED_COARSE_CLAY_DAUB);
		ModItems.register("scattered_coarse_clay_daub", ModItems.SCATTERED_COARSE_CLAY_DAUB);
		ModBlocks.register("covered_coarse_clay_daub", ModBlocks.COVERED_COARSE_CLAY_DAUB);
		ModItems.register("covered_coarse_clay_daub", ModItems.COVERED_COARSE_CLAY_DAUB);
		ModBlocks.register("coarse_clay_daub", ModBlocks.COARSE_CLAY_DAUB);
		ModItems.register("coarse_clay_daub", ModItems.COARSE_CLAY_DAUB);
		ModBlocks.register("scattered_mud_daub", ModBlocks.SCATTERED_MUD_DAUB);
		ModItems.register("scattered_mud_daub", ModItems.SCATTERED_MUD_DAUB);
		ModBlocks.register("covered_mud_daub", ModBlocks.COVERED_MUD_DAUB);
		ModItems.register("covered_mud_daub", ModItems.COVERED_MUD_DAUB);
		ModBlocks.register("mud_daub", ModBlocks.MUD_DAUB);
		ModItems.register("mud_daub", ModItems.MUD_DAUB);
		ModBlocks.register("scattered_packed_mud_daub", ModBlocks.SCATTERED_PACKED_MUD_DAUB);
		ModItems.register("scattered_packed_mud_daub", ModItems.SCATTERED_PACKED_MUD_DAUB);
		ModBlocks.register("covered_packed_mud_daub", ModBlocks.COVERED_PACKED_MUD_DAUB);
		ModItems.register("covered_packed_mud_daub", ModItems.COVERED_PACKED_MUD_DAUB);
		ModBlocks.register("packed_mud_daub", ModBlocks.PACKED_MUD_DAUB);
		ModItems.register("packed_mud_daub", ModItems.PACKED_MUD_DAUB);
		ModBlocks.register("scattered_sand_daub", ModBlocks.SCATTERED_SAND_DAUB);
		ModItems.register("scattered_sand_daub", ModItems.SCATTERED_SAND_DAUB);
		ModBlocks.register("covered_sand_daub", ModBlocks.COVERED_SAND_DAUB);
		ModItems.register("covered_sand_daub", ModItems.COVERED_SAND_DAUB);
		ModBlocks.register("sand_daub", ModBlocks.SAND_DAUB);
		ModItems.register("sand_daub", ModItems.SAND_DAUB);
		ModBlocks.register("wattle", ModBlocks.WATTLE);
		ModItems.register("wattle", ModItems.WATTLE);

		ModItems.register("clay_daub_ball", ModItems.CLAY_DAUB_BALL);
		ModItems.register("coarse_clay_daub_ball", ModItems.COARSE_CLAY_DAUB_BALL);
		ModItems.register("mud_daub_ball", ModItems.MUD_DAUB_BALL);
		ModItems.register("packed_mud_daub_ball", ModItems.PACKED_MUD_DAUB_BALL);
		ModItems.register("sand_daub_ball", ModItems.SAND_DAUB_BALL);

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
			content.addAfter(Items.WARPED_BUTTON,
				ModBlocks.WATTLE.asItem(),
				ModBlocks.SCATTERED_CLAY_DAUB.asItem(),
				ModBlocks.COVERED_CLAY_DAUB.asItem(),
				ModBlocks.CLAY_DAUB.asItem(),
				ModBlocks.SCATTERED_COARSE_CLAY_DAUB.asItem(),
				ModBlocks.COVERED_COARSE_CLAY_DAUB.asItem(),
				ModBlocks.COARSE_CLAY_DAUB.asItem(),
				ModBlocks.SCATTERED_SAND_DAUB.asItem(),
				ModBlocks.COVERED_SAND_DAUB.asItem(),
				ModBlocks.SAND_DAUB.asItem(),
				ModBlocks.SCATTERED_MUD_DAUB.asItem(),
				ModBlocks.COVERED_MUD_DAUB.asItem(),
				ModBlocks.MUD_DAUB.asItem(),
				ModBlocks.SCATTERED_PACKED_MUD_DAUB.asItem(),
				ModBlocks.COVERED_PACKED_MUD_DAUB.asItem(),
				ModBlocks.PACKED_MUD_DAUB.asItem()
			);
		});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
			content.addAfter(Items.CLAY_BALL,
				ModItems.CLAY_DAUB_BALL,
				ModItems.COARSE_CLAY_DAUB_BALL,
				ModItems.SAND_DAUB_BALL,
				ModItems.MUD_DAUB_BALL,
				ModItems.PACKED_MUD_DAUB_BALL
			);
		});

	}
}