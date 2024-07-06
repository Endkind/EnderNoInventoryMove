package net.endkind.endernoinventorymove.Listener;

import net.endkind.endernoinventorymove.EnderNoInventoryMove;

public class ListenerManager {
    public ListenerManager(EnderNoInventoryMove plugin) {
        plugin.getServer().getPluginManager().registerEvents(new InventoryClickListener(), plugin);
    }
}
