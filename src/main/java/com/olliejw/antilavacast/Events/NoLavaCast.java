package com.olliejw.antilavacast.Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockFormEvent;

public class NoLavaCast implements Listener {
    @EventHandler
    public void StoneForm(BlockFormEvent e) {
        e.setCancelled(true);
    }
}
