package xyz.x.xplugins.utils;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;

public class ConfigHandler {

	private static final File locationFile = new File("config/xplugins/locations.yml");
	private static final YamlConfiguration locationYML = YamlConfiguration.loadConfiguration(locationFile);
	public static YamlConfiguration getLocationConfig() {
		return locationYML;
	}
	public static void saveLocationConfig() {
		try {
			getLocationConfig().save(locationFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
