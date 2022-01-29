/*
 * Copyright (c) 2022 Atakku <https://atakku.dev>
 *
 * Licensed with GNU Lesser General Public License v3.0
 */

package dev.atakku.digi.core;

import dev.atakku.digi.core.block.BasicRack;
import dev.atakku.digi.core.blockentity.BasicRackEntity;
import dev.atakku.digi.core.util.DigiRegistry;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class DigiCore implements ModInitializer {
  public static final String MOD_ID = "digicore";
  public static final DigiRegistry REGISTRY = new DigiRegistry(MOD_ID);

  public static final Block RACK_BLOCK = REGISTRY.block(new BasicRack(), "rack");
  public static final Item RACK_ITEM = REGISTRY.item(new BlockItem(RACK_BLOCK, new Item.Settings().fireproof()), "rack");
  public static final BlockEntityType<BasicRackEntity> RACK_ENTITY = REGISTRY.blockEntity(BasicRackEntity::new, RACK_BLOCK, "rack");

  @Override
  public void onInitialize() {
    System.out.println("Initializing DigiCore");
  }
}
