package xyz.x.xplugins.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import xyz.x.xplugins.XPlugins;
import xyz.x.xplugins.utils.Position;

public class SetSpawnCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		if(arg0.hasPermission("xplugins.setspawn")) {
			Position.saveLocation("Spawn", ((Player)arg0).getLocation());
			arg0.sendMessage(XPlugins.prefix+"Du hast den Spawn gesetzt.");
			
		} else {
			arg0.sendMessage(XPlugins.prefix + "Du hast dazu keine Rechte.");
		}
		return false;
	}

}
