package jdp.abstractFactory.abstractFactoryUtil;

import jdp.abstractFactory.game.GameFactory;
import jdp.abstractFactory.music.MusicFactory;

public class FactoryProducer {

	public static AbstractAmusementFactory getFactory(String amusement){
		switch(amusement.toUpperCase()){
		case("MUSIC"):
			return MusicFactory.getInstance();
		case("GAME"):
			return GameFactory.getInstance();
		default:
			System.err.println("No valid factory for code " + amusement.toUpperCase());
			System.exit(-1);
			return null;
		}
	}

}
