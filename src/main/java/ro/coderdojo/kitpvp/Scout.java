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
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

/**
 *
 * @author MathZone
 */
public class Scout implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args) {

        ItemStack GChest = new ItemStack(Material.GOLD_CHESTPLATE);
        ItemStack GBoot = new ItemStack(Material.GOLD_BOOTS);
        ItemStack GLegs = new ItemStack(Material.GOLD_LEGGINGS);
        ItemStack GHelm = new ItemStack(Material.GOLD_HELMET);
        ItemStack ISword = new ItemStack(Material.IRON_SWORD);
        ISword.addUnsafeEnchantment(Enchantment.DURABILITY, 100);
        
        return false;
    }
}
