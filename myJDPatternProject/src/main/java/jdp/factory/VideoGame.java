package jdp.factory;

import java.io.PrintStream;

public class VideoGame implements Game {
	
	private static String _videoGameMessage = "Playing video game";

	public void playAGame(PrintStream outputStream) {
		outputStream.println(_videoGameMessage);
		outputStream.flush();
	}

}
