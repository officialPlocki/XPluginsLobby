package xyz.x.xplugins.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import xyz.x.xplugins.XPlugins;

import java.util.HashMap;
import java.util.Map;

public class XPluginsCommand implements CommandExecutor {

    public static Map<Player, Boolean> buildMode = new HashMap<>();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if(player.hasPermission("xplugins.command")) {
            if(args.length != 1) {
                player.sendMessage(XPlugins.prefix + "Die aktuell installiere Version von §c§lX§b§lPlugins §7ist §b" + XPlugins.version + "§7.");
                return true;
            } else {
                if(args[0].equalsIgnoreCase("build")) {
                    if(buildMode.getOrDefault(player, false)) {
                        player.sendMessage(XPlugins.prefix + "Dein Baumodus wurde §cdeaktiviert§7.");
                        buildMode.put(player, false);
                        return true;
                    } else {
                        player.sendMessage(XPlugins.prefix + "Dein Baumodus wurde §aaktiviert§7.");
                        buildMode.put(player, true);
                        return true;
                    }
                } else if(args[0].equalsIgnoreCase("help")) {
                    player.sendMessage(XPlugins.prefix + "Bitte verwende §e/xplugins §b<§abuild§b,§aversion§b>");
                    return true;
                } else if(args[0].equalsIgnoreCase("version")) {
                    player.sendMessage(XPlugins.prefix + "Die aktuell installiere Version von §c§lX§b§lPlugins §7ist §b" + XPlugins.version + "§7.");
                    return true;
                } else {
                    player.sendMessage(XPlugins.prefix + "Bitte verwende §e/xplugins §b<§abuild§b,§aversion§b,§ahelp§b>");
                    return true;
                }
            }
        } else {
            player.sendMessage(XPlugins.prefix + "Die aktuell installiere Version von §c§lX§b§lPlugins §7ist §b" + XPlugins.version + "§7.");
            return false;
        }
    }

}
