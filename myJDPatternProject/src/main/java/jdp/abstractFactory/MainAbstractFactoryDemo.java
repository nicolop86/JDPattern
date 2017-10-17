package jdp.abstractFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import jdp.abstractFactory.abstractFactoryUtil.AbstractAmusementFactory;
import jdp.abstractFactory.abstractFactoryUtil.FactoryProducer;
import jdp.abstractFactory.game.Game;
import jdp.abstractFactory.music.Music;

public class MainAbstractFactoryDemo {

	public static void main(String[] args) {
		
		/*Music*/
		AbstractAmusementFactory musicFactory = FactoryProducer.getFactory("MUSIC");
		Music aKindOfMusic = musicFactory.getMusic("Jazz");
		aKindOfMusic.playSomeMusic(System.out);
		Music anotherKindOfMusic = musicFactory.getMusic("Rock");
		anotherKindOfMusic.playSomeMusic(System.out);
		
		/*Rock*/
		File logFile = new File("gameAbstractFactory.log");
		PrintStream filePs = null;
		
		try{
			filePs = new PrintStream(logFile);
		} catch (FileNotFoundException e){
			System.err.println(e);
		}
		
		AbstractAmusementFactory gameFactory = FactoryProducer.getFactory("GAME");
		Game aGame = gameFactory.getGame("Videogame");		
		aGame.playAGame(filePs);
		Game anotherGame = gameFactory.getGame("Basket");
		anotherGame.playAGame(filePs);
		
		/*This is going to fail*/
		Music stillAnotherKindOfMusic = gameFactory.getMusic("Jazz");
		try{
			stillAnotherKindOfMusic.playSomeMusic(System.out);
		} catch(Exception e){
			e.printStackTrace(System.err);
		}
	}

}