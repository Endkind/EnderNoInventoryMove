package net.endkind.endernoinventorymove;

import net.endkind.endernoinventorymove.Listener.ListenerManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class EnderNoInventoryMove extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Enabling EnderNoInventoryMove");

        new ListenerManager(this);

        getLogger().info("EnderNoInventoryMove is enabled");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Disabling EnderNoInventoryMove");
        getLogger().info("EnderNoInventoryMove is disabled");
    }
}
