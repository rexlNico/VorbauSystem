package de.rexlNico.Lobby.Methodes;

import java.io.File;
import java.util.List;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

public class vorbauApi {

	public static File file = new File("../Setings/rexlVorbau/config.yml");
	public static YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
	
	public static void fertig(Player p){
		List<String> playersfertig = cfg.getStringList("playersfertig");
		if(playersfertig.contains(p.getName())){
			p.sendMessage(Var.pr+"§cDu hast dein Plot schon als fertig makiert");
		}
	}
	
}
