/*
 * Copyright (c) 2022 Atakku <https://atakku.dev>
 *
 * Licensed with GNU Lesser General Public License v3.0
 */

package dev.atakku.digi.core.util;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DigiRegistry {
  private String mod_id;

  public DigiRegistry(String mod_id) {
    this.mod_id = mod_id;
  }

  public Item item(Item item, String name) {
    return Registry.register(Registry.ITEM, new Identifier(mod_id, name), item);
  }

  public Block block(Block block, String name) {
    return Registry.register(Registry.BLOCK, new Identifier(mod_id, name), block);
  }

  public <T extends BlockEntity> BlockEntityType<T> blockEntity(BlockEntityType<T> bet, String name) {
    return Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(mod_id, name), bet);
  }

  public <T extends BlockEntity> BlockEntityType<T> blockEntity(FabricBlockEntityTypeBuilder.Factory<T> factory,
      Block block, String name) {
    return blockEntity(FabricBlockEntityTypeBuilder.create(factory, block).build(null), name);
  }
}