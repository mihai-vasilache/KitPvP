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
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

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
        ItemStack DSword = new ItemStack(Material.STONE_AXE);
        ItemStack Steak = new ItemStack(Material.COOKED_BEEF, 64);
        PotionEffect eff = new PotionEffect(PotionEffectType.SPEED , 1000000, 10);
        Player p = (Player) commandSender;

        GHelm.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        GChest.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        GLegs.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        GBoot.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        GHelm.addUnsafeEnchantment(Enchantment.DURABILITY, 100);
        GChest.addUnsafeEnchantment(Enchantment.DURABILITY, 100);
        GLegs.addUnsafeEnchantment(Enchantment.DURABILITY, 100);
        GBoot.addUnsafeEnchantment(Enchantment.DURABILITY, 100);
        DSword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 200);
        DSword.setDurability(Short.valueOf("128"));
        p.getPlayer().getInventory().clear();
        p.getPlayer().getInventory().addItem(DSword, Steak);
        p.getPlayer().getInventory().setChestplate(GChest);
        p.getPlayer().getInventory().setLeggings(GLegs);
        p.getPlayer().getInventory().setBoots(GBoot);
        p.getPlayer().getInventory().setHelmet(GHelm);
        p.getPlayer().getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(5);
        p.getPlayer().getActivePotionEffects().add(eff);
        return false;
    }
}
