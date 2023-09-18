package xyz.x.xplugins.listeners;

import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import xyz.x.xplugins.commands.XPluginsCommand;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class BuildListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        event.getPlayer().performCommand("spawn");
        event.setJoinMessage("");
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        event.setQuitMessage("");
    }

    @EventHandler
    public void onPlace(BlockPlaceEvent event) {
        if(!XPluginsCommand.buildMode.getOrDefault(event.getPlayer(), false)) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onBreak(BlockBreakEvent event) {
        if(!XPluginsCommand.buildMode.getOrDefault(event.getPlayer(), false)) {
            event.setCancelled(true);
        }
    }

}
