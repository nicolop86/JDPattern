package jdp.factory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class MainFactoryDemo {

	public static void main(String[] args){
		PrintStream console = new PrintStream(System.out, true);
		File logFile = new File("game.log");
		PrintStream filePs = null;
		try{
			filePs = new PrintStream(logFile);
		} catch (FileNotFoundException e){
			System.err.println(e);
		}
		
		Game game1 = GameFactory.getGameInstance(0);
		game1.playAGame(console);
		
		Game game2 = GameFactory.getGameInstance(1);
		game2.playAGame(filePs);
		
		Game game3 = GameFactory.getGameInstance(2);
		game3.playAGame(filePs);
		
		Game game4 = GameFactory.getGameInstance(4);
		game4.playAGame(console);
	}
}