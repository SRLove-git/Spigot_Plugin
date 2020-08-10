package org.mallor.sky.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class cmd implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String cmd;
        cmd = command.getName();
        if(cmd.equalsIgnoreCase("cmd")) {
                if (sender instanceof Player) {
                    sender.sendMessage("Hello World");
                } else {
                    sender.sendMessage("你必须是一个玩家");
                }

                return true;
        }
            return true;
    }
}
