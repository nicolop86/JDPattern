package jdp.abstractFactory.music;

import java.io.PrintStream;

public class RockMusic implements Music {
	
	private final static String _rockMusicMessage = "Listening to rock music!";

	public void playSomeMusic(PrintStream ps) {
		ps.println(_rockMusicMessage);
	}

}
