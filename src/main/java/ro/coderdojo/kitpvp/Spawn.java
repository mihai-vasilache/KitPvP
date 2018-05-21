/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.coderdojo.kitpvp;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.WorldCreator;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 *
 * @author MathZone
 */
public class Spawn implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender cs, Command cmnd, String string, String[] strings) {
        Player p = (Player) cs;
<<<<<<< Updated upstream
        Location l = null;
        l.setX(214);
        l.setY(157);
        l.setZ(248);
        p.getPlayer().teleport(l);
=======
        World world = Bukkit.getServer().createWorld(new WorldCreator("world"));

        Location l = new Location(world, 214, 157, 248);
        p.getPlayer().teleport(l);
        p.getPlayer().setInvulnerable(true);
        EventsListener.b = false;
>>>>>>> Stashed changes
        return false;
    }

}
