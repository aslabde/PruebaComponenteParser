package tools;

import java.util.HashMap;

import business.Player;
import business.RealLeague;

public interface PlayersParser {
	
	HashMap<Integer,Player> parsePlayers (RealLeague rl);
}
