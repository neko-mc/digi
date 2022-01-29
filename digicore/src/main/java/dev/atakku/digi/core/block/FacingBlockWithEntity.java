/*
 * Copyright (c) 2022 Atakku <https://atakku.dev>
 *
 * Licensed with GNU Lesser General Public License v3.0
 */

package dev.atakku.digi.core.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;

abstract class FacingBlockWithEntity extends BlockWithEntity {
  public static final DirectionProperty FACING = Properties.FACING;

  protected FacingBlockWithEntity(AbstractBlock.Settings settings) {
      super(settings);
  }

  @Override
  public BlockState rotate(BlockState state, BlockRotation rotation) {
      return (BlockState)state.with(FACING, rotation.rotate(state.get(FACING)));
  }

  @Override
  public BlockState mirror(BlockState state, BlockMirror mirror) {
      return state.rotate(mirror.getRotation(state.get(FACING)));
  }
}
