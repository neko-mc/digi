/*
 * Copyright (c) 2022 Atakku <https://atakku.dev>
 *
 * Licensed with GNU Lesser General Public License v3.0
 */

package dev.atakku.digi.core.block;

import dev.atakku.digi.core.blockentity.BasicRackEntity;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class BasicRack extends RackBlock {
  public BasicRack() {
    super(Settings.of(Material.STONE).nonOpaque());
  }

  @Override
  public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
    return new BasicRackEntity(pos, state);
  }
}
