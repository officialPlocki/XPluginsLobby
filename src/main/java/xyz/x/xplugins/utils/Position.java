package xyz.x.xplugins.utils;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;

public class Position {
	
	public static Location getLocation(String locationName) {
		double x = ConfigHandler.getLocationConfig().getDouble(locationName+".X");
		double y = ConfigHandler.getLocationConfig().getDouble(locationName+".Y");
		double z = ConfigHandler.getLocationConfig().getDouble(locationName+".Z");
		float yaw = (float) ConfigHandler.getLocationConfig().getDouble(locationName+".Yaw");
		float pitch = (float) ConfigHandler.getLocationConfig().getDouble(locationName+".Pitch");
		World world = Bukkit.getWorld(ConfigHandler.getLocationConfig().getString(locationName+".World"));
		return new Location(world, x, y, z, yaw, pitch);
	}
	
	public static void saveLocation(String locationName, Location location) {
		String world = location.getWorld().getName().toString();
		double x = location.getX();
		double y = location.getY();
		double z = location.getZ();
		float yaw = location.getYaw();
		float pitch = location.getPitch();
		ConfigHandler.getLocationConfig().set(locationName+".X", x);
		ConfigHandler.getLocationConfig().set(locationName+".Y", y);
		ConfigHandler.getLocationConfig().set(locationName+".Z", z);
		ConfigHandler.getLocationConfig().set(locationName+".World", world);
		ConfigHandler.getLocationConfig().set(locationName+".Yaw", yaw);
		ConfigHandler.getLocationConfig().set(locationName+".Pitch", pitch);
		ConfigHandler.saveLocationConfig();
	}
	
}
