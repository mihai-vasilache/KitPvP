package ro.coderdojo.kitpvp;

import java.util.HashMap;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDamageByBlockEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerItemDamageEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public final class EventsListener implements Listener {
    
    public static HashMap<String, Integer> bal = new HashMap();
<<<<<<< Updated upstream
    
=======
    public static Boolean b = false;

>>>>>>> Stashed changes
    @EventHandler
    public void onLogin(PlayerJoinEvent event) {
        
        Player p = event.getPlayer();
        String name = p.getName();
        bal.put(name, 10);
<<<<<<< Updated upstream
        
=======
        p.setGameMode(GameMode.ADVENTURE);

>>>>>>> Stashed changes
    }
    
    @EventHandler
    public void onPlayerDamage(EntityDamageEvent e) {
        
        Entity n = (Entity) e;
        Player p = (Player) e;
        
        if (p.getPlayer().getHealth() <= 4) {
            p.getPlayer().getInventory().clear();
            
        }
        
    }
    
    @EventHandler
    public void fallDamageEvent(EntityDamageByBlockEvent e) {
        e.setCancelled(true);
    }
    
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
<<<<<<< Updated upstream
        Player p = (Player) event.getEntity();
        String killerName = p.getPlayer().getKiller().getName();
        String killedName = p.getPlayer().getName();
        bal.put(killerName, bal.get(killerName) + 5);
        bal.put(killedName, bal.get(killedName) - 2);
        p.getPlayer().getInventory().clear();
        
=======
        
            Player p = event.getEntity();
            String killerName = p.getPlayer().getKiller().getName();
            String killedName = p.getPlayer().getName();
            bal.put(killerName, bal.get(killerName) + 5);
            bal.put(killedName, bal.get(killedName) - 2);

        

    }

    @EventHandler
    public void onPlayerRespawn(PlayerRespawnEvent e) {
    
        
        if(b== true)
        {
        b = false;
        }   
    
    }

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent e) {
        Player p = e.getPlayer();

        if (b == false && p.getPlayer().getLocation().getY() >= 155) {
            p.getPlayer().setInvulnerable(true);
            b = true;
        }
        if (b == true && p.getPlayer().getLocation().getY() <= 78) {
            p.getPlayer().setInvulnerable(false);

        }
        if(b==false && p.getPlayer().getLocation().getY() <= 55)
        {
         p.getPlayer().setInvulnerable(true);
         b=true;
        }
>>>>>>> Stashed changes
    }
    
    @EventHandler
    public void inventoryClick(InventoryClickEvent e) {
        ItemStack SplashStrenght = new ItemStack(Material.POTION, 1, (short) 16489);
        Player p = (Player) e.getWhoClicked();
        ItemStack Strenght = new ItemStack(Material.RAW_BEEF);
        Inventory Potions = Bukkit.getServer().createInventory(p, 36, "Potions");
        ItemStack GApple = new ItemStack(Material.GOLDEN_APPLE);
        Potions.setItem(1, Strenght);
        if (e.getInventory().getTitle().equals("Shop")) {
            e.setCancelled(true);
            
            if (e.getCurrentItem().getType().equals(Material.POTION)) {
                e.setCancelled(true);
                p.openInventory(Potions);
                if (e.getCurrentItem().getType().equals(Material.RAW_BEEF)) {
                    e.setCancelled(true);
                    if (bal.get(p.getPlayer().getName()) >= 50) {
<<<<<<< Updated upstream
                        
=======

>>>>>>> Stashed changes
                        bal.put(p.getPlayer().getName(), bal.get(p.getPlayer().getName()) - 50);
                        p.getPlayer().getInventory().addItem(SplashStrenght);
                    } else {
                        p.closeInventory();
                        p.sendMessage("NO MONEY!!");
                    }
                }
            }
<<<<<<< Updated upstream
            
        }
    }
    /* @EventHandler
    public void blockBreak(BlockBreakEvent e){
    e.setCancelled(true);
    
    }*/
    
=======

        }
    }

>>>>>>> Stashed changes
}
