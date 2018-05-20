/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.coderdojo.kitpvp;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 *
 * @author MathZone
 */
public class Archer implements CommandExecutor {
    
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args) {
        
        ItemStack Bow = new ItemStack(Material.BOW, 1);
        ItemStack Arrow = new ItemStack(Material.ARROW, 64);
        ItemStack IChest = new ItemStack(Material.IRON_CHESTPLATE, 1);
        ItemStack IBoot = new ItemStack(Material.IRON_BOOTS, 1);
        ItemStack ILegs = new ItemStack(Material.IRON_LEGGINGS, 1);
        ItemStack IHelmet = new ItemStack(Material.IRON_HELMET, 1);
        ItemStack Steak  =new  ItemStack (Material.COOKED_BEEF , 64);
        IHelmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        IChest.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        ILegs.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        IBoot.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        IHelmet.addUnsafeEnchantment(Enchantment.DURABILITY , 100 );
        IChest.addUnsafeEnchantment(Enchantment.DURABILITY,  100);
        ILegs.addUnsafeEnchantment(Enchantment.DURABILITY, 100);
        IBoot.addUnsafeEnchantment(Enchantment.DURABILITY, 100);
        Bow.addUnsafeEnchantment(Enchantment.DURABILITY, 100);
        Bow.addEnchantment(Enchantment.ARROW_INFINITE, 1);
        Bow.addEnchantment(Enchantment.ARROW_DAMAGE, 4);
        
        Player p = (Player) commandSender;
        p.getPlayer().getInventory().clear();
        p.getPlayer().getInventory().addItem(Bow, Arrow, Steak);
        p.getPlayer().getInventory().setChestplate(IChest);
        p.getPlayer().getInventory().setLeggings(ILegs);
        p.getPlayer().getInventory().setBoots(IBoot);
        p.getPlayer().getInventory().setHelmet(IHelmet);
        p.getPlayer().getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(20);
        
        return false;
    }
    
}
