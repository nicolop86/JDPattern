package jdp.abstractFactory.game;

import java.io.PrintStream;

public class Basket implements Game {

	private final static String _basketMessage = "Playing basketball";
	
	public void playAGame(PrintStream ps) {
		ps.println(_basketMessage);
	}

}
