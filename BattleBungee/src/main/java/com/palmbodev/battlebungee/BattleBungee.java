package com.palmbodev.battlebungee;

import net.md_5.bungee.api.plugin.Plugin;

public class BattleBungee extends Plugin {

    private static BattleBungee battleBungee;

    public void onEnable() {
        battleBungee = this;
    }

    public void onDisable() {
        battleBungee = null;
    }

    public static BattleBungee get() {
        return battleBungee;
    }

}
