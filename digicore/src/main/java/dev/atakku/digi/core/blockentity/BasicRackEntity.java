/*
 * Copyright (c) 2022 Atakku <https://atakku.dev>
 *
 * Licensed with GNU Lesser General Public License v3.0
 */

package dev.atakku.digi.core.blockentity;

import dev.atakku.digi.core.DigiCore;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

public class BasicRackEntity extends RackBlockEntity {
  public BasicRackEntity(BlockPos pos, BlockState state) {
    super(DigiCore.RACK_ENTITY, pos, state);
  }
}
