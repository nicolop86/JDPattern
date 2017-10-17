package jdp.abstractFactory.music;

import java.io.PrintStream;

public class JazzMusic implements Music {

	private final static String _jazzMusicMessage = "Listening to jazz music!";
	
	public void playSomeMusic(PrintStream ps) {
		ps.println(_jazzMusicMessage);
	}

}
