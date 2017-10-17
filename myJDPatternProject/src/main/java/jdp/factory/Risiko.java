package jdp.factory;

import java.io.PrintStream;

public class Risiko implements Game {
	
	private static String _risikoMessage = "Playing Risiko";

	public void playAGame(PrintStream outputStream) {
		outputStream.println(_risikoMessage);
		outputStream.flush();
	}

}
