package ro.coderdojo.kitpvp;

import java.util.logging.Level;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.PluginManager;
import ro.coderdojo.kitpvp.FlyCommand;
import ro.coderdojo.kitpvp.EventsListener;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
		//Register Event Listeners
                
		getServer().getPluginManager().registerEvents(new EventsListener(), this);
		
		//Register Command Executors
		this.getCommand("fly").setExecutor(new FlyCommand());
                this.getCommand("archer").setExecutor(new Archer()) ; 
                this.getCommand("tank").setExecutor(new Tank());
    }

}
