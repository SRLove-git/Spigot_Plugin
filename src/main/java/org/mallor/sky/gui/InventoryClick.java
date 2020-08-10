package org.mallor.sky.gui;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryClick implements Listener {
    @EventHandler
    public void InventoryClick(InventoryClickEvent event){
    if (event.getView().getTitle().equalsIgnoreCase(ChatColor.YELLOW+"GUI"));
    event.setCancelled(true);


    }

}
