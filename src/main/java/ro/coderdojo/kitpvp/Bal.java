/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.coderdojo.kitpvp;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import static ro.coderdojo.kitpvp.EventsListener.bal;

/**
 *
 * @author MathZone
 */
public class Bal implements CommandExecutor{
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args){
      
            Player p = (Player) commandSender ;
            String name = p.getPlayer().getName();
            int bala = bal.get(name);
            p.sendMessage("You have " + bala + " money , you get 5 per kill , and loose 2 per death. ");
        return false;
    }
    }       