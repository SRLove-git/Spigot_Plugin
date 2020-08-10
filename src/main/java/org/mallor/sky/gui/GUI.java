package org.mallor.sky.gui;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
public class GUI implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player =(Player)commandSender;
        Inventory GUI =Bukkit.createInventory(null,27, ChatColor.YELLOW+"GUI");


        ItemStack item = new ItemStack(Material.BED,1);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.setDisplayName("恭喜你获取了一个床");
        item.setItemMeta(itemMeta);


        GUI.setItem(10,item);
        player.openInventory(GUI);
        return false;
    }
}

