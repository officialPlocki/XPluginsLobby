package xyz.x.xplugins;

import org.bukkit.Bukkit;
import xyz.x.xplugins.commands.GamemodeCommand;
import xyz.x.xplugins.commands.SetSpawnCommand;
import xyz.x.xplugins.commands.SpawnCommand;
import xyz.x.xplugins.commands.XPluginsCommand;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.x.xplugins.listeners.BuildListener;

public final class XPlugins extends JavaPlugin {

    public static String prefix = "§c§lX§b§lPlugins §8» §7";
    public static String version = "v1.0-Beta";

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("xplugins").setExecutor(new XPluginsCommand());
        getCommand("gamemode").setExecutor(new GamemodeCommand());
        getCommand("gm").setExecutor(new GamemodeCommand());
        getCommand("setspawn").setExecutor(new SetSpawnCommand());
        getCommand("spawn").setExecutor(new SpawnCommand());
        Bukkit.getPluginManager().registerEvents(new BuildListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
