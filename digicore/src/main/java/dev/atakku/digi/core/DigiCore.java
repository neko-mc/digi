/*
 * Copyright (c) 2022 Atakku <https://atakku.dev>
 *
 * Licensed with GNU Lesser General Public License v3.0
 */

package dev.atakku.digi.core;

import net.fabricmc.api.ModInitializer;

public class DigiCore implements ModInitializer {
  public static final String MODID = "digicore";

  @Override
  public void onInitialize() {
    System.out.println("HELLO FROM " + MODID);
  }
}
