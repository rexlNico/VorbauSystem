package de.rexlNico.Lobby.Main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

	public static Main plugin;
	private PluginManager pm = Bukkit.getPluginManager();
	
	@Override
	public void onEnable() {
		plugin = this;
		register();
		Bukkit.getConsoleSender().sendMessage("§erexlLobby §aAktiviert");
		
	}
	
	@Override
	public void onDisable() {
		
	}
	
	public static Main getPlugin() {
		return plugin;
	}
	
	public void register(){
		
		
	}
	
	
}
