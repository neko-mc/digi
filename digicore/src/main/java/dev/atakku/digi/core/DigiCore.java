/*
 * Copyright (c) 2022 Atakku <https://atakku.dev>
 *
 * Licensed with GNU Lesser General Public License v3.0
 */

package dev.atakku.digi.core;

import dev.atakku.digi.core.util.DigiRegistry;
import net.fabricmc.api.ModInitializer;

public class DigiCore implements ModInitializer {
  public static final String MOD_ID = "digicore";
  public static final DigiRegistry REGISTRY = new DigiRegistry(MOD_ID);

  @Override
  public void onInitialize() {
    System.out.println("Initializing DigiCore");
  }
}
