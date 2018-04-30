/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.coderdojo.kitpvp;

import java.util.HashMap;
import org.bukkit.Bukkit;
import org.bukkit.Material;
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
public class Shop implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        
        Player p  = (Player) sender;
        Inventory shop = Bukkit.getServer().createInventory(p, 36, "Shop") ;
        Inventory potions = Bukkit.getServer().createInventory(p, 36, "Potions") ; 
        ItemStack GApple = new ItemStack(Material.GOLDEN_APPLE) ;
        ItemStack Potion = new ItemStack(Material.POTION) ;
        shop.setItem(1, GApple);
        shop. setItem(3 , Potion);
        
        p.openInventory(shop);
        
        
        return false;

    }

}
