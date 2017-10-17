package jdp.factory;

import java.io.PrintStream;

public class Cards implements Game {
	
	private static String _cardsMessage = "Playing cards";

	public void playAGame(PrintStream outputStream) {
		outputStream.println(_cardsMessage);
		outputStream.flush();
	}
}
