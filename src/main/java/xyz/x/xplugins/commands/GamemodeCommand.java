package xyz.x.xplugins.commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import xyz.x.xplugins.XPlugins;

public class GamemodeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player)sender;

        if(player.hasPermission("xplugins.gamemode")) {
            if(args.length==0) {
                player.sendMessage(XPlugins.prefix+"Bitte verwende §e/gm <0, 1, 3> (Spieler)");
            } else if(args.length==1){
                if(args[0].equalsIgnoreCase("0")) {
                    if(player.hasPermission("core.gamemode.survival")) {
                        player.setGameMode(GameMode.SURVIVAL);
                        player.sendMessage(XPlugins.prefix+"Dein Spielmodus wurde geändert.");
                    } else {
                        player.sendMessage(XPlugins.prefix + "Du hast dazu keine Rechte.");
                    }
                } else if(args[0].equalsIgnoreCase("1")) {
                    if(player.hasPermission("core.gamemode.creative")) {
                        player.setGameMode(GameMode.CREATIVE);
                        player.sendMessage(XPlugins.prefix+"Dein Spielmodus wurde geändert.");
                    } else {
                        player.sendMessage(XPlugins.prefix + "Du hast dazu keine Rechte.");
                    }
                } else if(args[0].equalsIgnoreCase("3")) {
                    if(player.hasPermission("core.gamemode.spectator")) {
                        player.setGameMode(GameMode.SPECTATOR);
                        player.sendMessage(XPlugins.prefix+"Dein Spielmodus wurde geändert.");
                    } else {
                        player.sendMessage(XPlugins.prefix + "Du hast dazu keine Rechte.");
                    }
                } else {
                    player.sendMessage(XPlugins.prefix+"Bitte verwende §e/gm <0, 1, 3> (Spieler)");
                }
            } else if(args.length==2) {
                if(Bukkit.getPlayer(args[1]).isOnline()) {
                    if(player.hasPermission("xplugins.gamemode.other")) {
                        Player t = Bukkit.getPlayer(args[1]);
                        if(args[0].equalsIgnoreCase("0")) {
                            if(player.hasPermission("core.gamemode.survival")) {
                                t.setGameMode(GameMode.SURVIVAL);
                                player.sendMessage(XPlugins.prefix+"Der Spielmodus wurde geändert.");
                            } else {
                                player.sendMessage(XPlugins.prefix + "Du hast dazu keine Rechte.");
                            }
                        } else if(args[0].equalsIgnoreCase("1")) {
                            if(player.hasPermission("core.gamemode.creative")) {
                                t.setGameMode(GameMode.CREATIVE);
                                player.sendMessage(XPlugins.prefix+"Der Spielmodus wurde geändert.");
                            } else {
                                player.sendMessage(XPlugins.prefix + "Du hast dazu keine Rechte.");
                            }
                        } else if(args[0].equalsIgnoreCase("3")) {
                            if(player.hasPermission("core.gamemode.spectator")) {
                                t.setGameMode(GameMode.SPECTATOR);
                                player.sendMessage(XPlugins.prefix+"Der Spielmodus wurde geändert.");
                            } else {
                                player.sendMessage(XPlugins.prefix + "Du hast dazu keine Rechte.");
                            }
                        } else {
                            player.sendMessage(XPlugins.prefix+"Bitte verwende §e/gm <0, 1, 3> (Spieler)");
                        }
                    } else {
                        player.sendMessage(XPlugins.prefix + "Du hast dazu keine Rechte.");
                    }
                } else {
                    player.sendMessage(XPlugins.prefix+"Der Spieler ist nicht online.");
                }
            } else {
                player.sendMessage(XPlugins.prefix+"Bitte verwende §e/gm <0, 1, 3> (Spieler)");
            }
        } else {
            player.sendMessage(XPlugins.prefix + "Du hast dazu keine Rechte.");
        }

        return false;
    }


}
