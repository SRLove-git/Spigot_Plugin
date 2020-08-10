package org.mallor.sky;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.mallor.sky.a.PlayerJoin;
import org.mallor.sky.commands.cmd;
import org.mallor.sky.gui.GUI;
import org.mallor.sky.gui.InventoryClick;

public class A extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.getPluginCommand("cmd").setExecutor(new cmd());
        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        getCommand("GUI").setExecutor(new GUI());
        getServer().getPluginManager().registerEvents(new InventoryClick(),this);
        saveDefaultConfig();
        getLogger().info(getConfig().getString("name"));
        getLogger().info(getConfig().getString("author"));
        getLogger().info(getConfig().getString("a.b.c"));
        getConfig().set("name","SKY");
        saveConfig();
        reloadConfig();
        System.out.println("插件SKY已经成功启动");
    }

    @Override
    public void onDisable() {
        System.out.println("插件SKY已经成功关闭");
    }

}
