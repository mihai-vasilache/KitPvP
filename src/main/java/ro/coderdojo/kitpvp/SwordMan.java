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
public class SwordMan implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args) {
         ItemStack DChest = new ItemStack(Material.DIAMOND_CHESTPLATE , 1 );
        ItemStack DHelm = new ItemStack (Material.DIAMOND_HELMET , 1);
        ItemStack DLegs  = new ItemStack (Material.DIAMOND_LEGGINGS , 1);
        ItemStack DBoot = new ItemStack(Material.DIAMOND_BOOTS , 1);
        ItemStack DSword = new ItemStack(Material.DIAMOND_SWORD , 1 );
        ItemStack Steak  =new  ItemStack (Material.COOKED_BEEF , 64);
        DChest.addUnsafeEnchantment(Enchantment.DURABILITY, 100);
        DHelm.addUnsafeEnchantment(Enchantment.DURABILITY, 100);
        DLegs.addUnsafeEnchantment(Enchantment.DURABILITY , 100);
        DBoot.addUnsafeEnchantment(Enchantment.DURABILITY, 100);
        DSword.addUnsafeEnchantment(Enchantment.DURABILITY, 100);
        DChest.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
        DHelm.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);        
        DBoot.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
        DLegs.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
        DChest.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 2);
        DHelm.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 2);        
        DBoot.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 2);
        DLegs.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 2);
        DSword.addEnchantment(Enchantment.DAMAGE_ALL, 3);
        Player p = (Player) commandSender;
        p.getPlayer().getInventory().clear();
        p.getPlayer().getInventory().addItem(DSword, Steak);
        p.getPlayer().getInventory().setHelmet(DHelm);
        p.getPlayer().getInventory().setChestplate(DChest);
        p.getPlayer().getInventory().setLeggings(DLegs);
        p.getPlayer().getInventory().setBoots(DBoot);
        p.getPlayer().getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(20);
    return false;
    }

}
