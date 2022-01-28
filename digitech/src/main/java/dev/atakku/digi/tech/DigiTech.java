/*
 * Copyright (c) 2022 Atakku <https://atakku.dev>
 *
 * Licensed with GNU Lesser General Public License v3.0
 */

package dev.atakku.digi.tech;

import net.fabricmc.api.ModInitializer;

public class DigiTech implements ModInitializer {
  public static final String MODID = "digitech";

  @Override
  public void onInitialize() {
    System.out.println("HELLO FROM " + MODID);
  }
}
