package ro.coderdojo.kitpvp;

import java.util.HashMap;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerJoinEvent;�wuꏜIy�-N�1���     ��MQ�Z��BLTE   $     �   ��������V�`�H�� E������,@a�eS��K�cM�@�����fF���S�__�@�"�ŏl��餑�AA+	D��V���2����wK��8��e��(�	>6vJ�W���϶�'޳��}�L5���F��ALĎ��,��N_�@�kr�}��^Y>�[(���F��entHandler
    public void onLogin(PlayerJoinEvent event) {

        Player p = event.getPlayer();
        String name = p.getName();
        bal.put(name, 10);

    }

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        Player p = (Player) event;
        String killerName = p.getPlayer().getKiller().getName();
        String killedName = p.getPlayer().getName();
        bal.put(killerName, bal.get(killerName) + 5);
        bal.put(killedName, bal.get(killedName) - 2);

    }

    @EventHandler
    public void inventoryClick(InventoryClickEvent e) {
        ItemStack Ghast = new ItemStack(Material.GHAST_TEAR , 1);
        Player p = (Player) e.getWhoClicked();
        Inventory Potions = Bukkit.getServer().createInventory(p, 36, "Potions");
        ItemStack GApple = new ItemStack(Material.GOLDEN_APPLE);
        Potions.setItem(1, Ghast);
        if (e.getInventory().getTitle().equals("Shop")) {
            e.setCancelled(true);
            if (e.getCurrentItem() == null || e.getCurrentItem().ge=�DT�G�����fP�     ��X�\�BLTE   $     �   ���&¸ 	��+��E������,@��paS�T�az#�[)nsJr��<f��b��?�d�ԫw�N_H��B@b�g�~�<�£W����*-'n�K�a~9|$�{��ͮ���r�0�G��#nNx.�˙��1p�M��ζKW����Gq�����%6�Y�ȮsetCancelled(true);
            if (e.getCurrentItem().getType().equals(Material.GHAST_TEAR)) {
            if(bal.get(p.getName()) >= 30){
            bal.put(p.getName(), bal.get(p.getName()) - 30);
            p.getInventory().addItem(Ghast);
            p.sendMessage("Now you can go to /brew to brew your potions");
            }
            else{
            p.sendMessage("You don't have money to buy this");
            p.closeInventory();
            }
            
            }
        }
    }
}
