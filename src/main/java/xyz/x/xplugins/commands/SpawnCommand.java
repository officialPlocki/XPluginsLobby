package xyz.x.xplugins.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import xyz.x.xplugins.XPlugins;
import xyz.x.xplugins.utils.Position;

public class SpawnCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		((Player)arg0).teleport(Position.getLocation("Spawn"));
		arg0.sendMessage(XPlugins.prefix+"Du wurdest zum Spawn teleportiert.");
		return false;
	}

}
