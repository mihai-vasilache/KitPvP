package ro.coderdojo.kitpvp;

import java.util.HashMap;
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
        this.getCommand("kit1").setExecutor(new Archer());
        this.getCommand("kit2").setExecutor(new Tank());
        this.getCommand("kit3").setExecutor(new SwordMan());
        this.getCommand("bal").setExecutor(new Bal());
        this.getCommand("shop").setExecutor(new Shop());
        this.getCommand("brew").setExecutor(new Brew());
        this.getCommand("add10Money").setExecutor(new AddMoney());
        this.getCommand("kit4").setExecutor(new Scout());
        this.getCommand("spawn").setExecutor(new Spawn());
    }

}
