package com.olliejw.antilavacast;

import com.olliejw.antilavacast.Events.NoLavaCast;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiLavaCast extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new NoLavaCast(), this);
    }
}
