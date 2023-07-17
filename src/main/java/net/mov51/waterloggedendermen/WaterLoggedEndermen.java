package net.mov51.waterloggedendermen;

import net.mov51.waterloggedendermen.listeners.EntityTeleportEventListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class WaterLoggedEndermen extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new EntityTeleportEventListener(), this);
        this.getLogger().info("Endermen are now bound by the arcane laws of water");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
