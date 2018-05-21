/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.coderdojo.kitpvp;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.WorldCreator;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

/**
 *
 * @author MathZone
 */
public class Brew implements CommandExecutor {

    public static int counter = 0;

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        /*Player p = (Player) sender;
        ItemStack BlazePow = new ItemStack(Material.BLAZE_POWDER , 64);
        ItemStack Water = new ItemStack(Material.POTION ,1  , (short) 16489);
        Inventory brewer = Bukkit.getServer().createInventory(p, InventoryType.BREWING, "Don't close");
        brewer.setItem(4, BlazePow );
        brewer.setItem(0 , Water);
        brewer.setItem(1 , Water);
        brewer.setItem(2 , Water);
        p.openInventory(brewer);
        p.closeInventory();
        p.sendMessage("WIP");*/
        counter++;
        
        World world = Bukkit.getServer().createWorld(new WorldCreator("world"));
        Location lctn = new Location(world, 220, 51, 210);
        
        
        Player p = (Player) sender;
        if (counter <= 1) {
            p.getPlayer().teleport(lctn);
            p.getPlayer().setInvulnerable(true);
            EventsListener.b = false;
        }
        else {
            p.getPlayer().sendMessage("Sorry , brewing is busy , wait for someone to leave");
                    
        }

        return false;
    }

}
