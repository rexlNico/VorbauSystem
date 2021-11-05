package de.rexlNico.Lobby.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.rexlNico.Lobby.Methodes.Var;

public class Vorbauen_CMD implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player){
			Player p = (Player)sender;
			if(args.length == 1){
				if(args[0].equalsIgnoreCase("fertig")){
					
				}else{
					
				}
			}
		}else{
			sender.sendMessage(Var.console);
		}
		return false;
	}

}

//                /vorbauen <fertig/accpet/deny> <Player>
