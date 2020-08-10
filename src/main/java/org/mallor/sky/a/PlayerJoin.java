package org.mallor.sky.a;


import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener{
    @EventHandler
    public void PlayerJoin(PlayerJoinEvent Event){
    String player = Event.getPlayer().getName();
    Event.setJoinMessage(ChatColor.RED+"欢迎"+player+"加入了游戏");
    }

}
