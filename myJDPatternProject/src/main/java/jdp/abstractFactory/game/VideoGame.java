package jdp.abstractFactory.game;

import java.io.PrintStream;

public class VideoGame implements Game {

	private static String _videoGameMessage = "Playing video game";
	
	public void playAGame(PrintStream ps) {
		ps.println(_videoGameMessage);
	}

}
