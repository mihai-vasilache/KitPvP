/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.coderdojo.kitpvp;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 *
 * @author MathZone
 */
public class Tank  implements CommandExecutor{
     
 @Override
 public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args) {
     ItemStack DHelm = new ItemStack(Material.DIAMOND_HELMET , 1);
     ItemStack DChest = new ItemStack(Material.DIAMOND_CHESTPLATE , 1); 
     ItemStack DLegs = new ItemStack(Material.DIAMOND_LEGGINGS , 1 );
     ItemStack DBoot = new ItemStack(Material.DIAMOND_BOOTS , 1);
     ItemStack DSword = new ItemStack(Material.DIAMOND_SWORD ,1 );
     ItemStack Shield = new ItemStack(Material.SHIELD , 1);
     Player p = (Player) commandSender ;
     
     
             
             
     
     
     
     
 return false;    
}
}