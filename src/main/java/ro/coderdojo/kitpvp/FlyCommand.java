package ro.coderdojo.kitpvp;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class FlyCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args) {
		Player player = (Player) commandSender;
		if (command.getName().equalsIgnoreCase("/fly")) {
			if(args.length == 0) {
			    player.setAllowFlight(!player.getAllowFlight());
			} else if(args.length == 1) {
				if(args[0].equalsIgnoreCase("on")) {
					player.setAllowFlight(true);
				} else if(args[0].equalsIgnoreCase("off")) {
					player.setAllowFlight(false);
				} else {
					// Obviously, the next line could be ignored
					// and return false; could be used if you set the usage message
					player.sendMessage("usage: /fly [on:off]");
					return true;
				}
			}
			player.sendMessage("Fly has been "+(player.getAllowFlight() ? "enabled" : "disabled"));
		}
		return false;
	}
}
