package jdp.abstractFactory.music;

import jdp.abstractFactory.abstractFactoryUtil.AbstractAmusementFactory;
import jdp.abstractFactory.game.Game;

public class MusicFactory extends AbstractAmusementFactory{

	private final static MusicFactory mf = new MusicFactory();
	
	public static MusicFactory getInstance(){
		return mf;
	}
	
	@Override
	public Music getMusic(String music){
		return mf._getMusic(music);
	}
	
	private Music _getMusic(String music){
		switch(music){
		case("Rock"):
			return new RockMusic();
		case("Jazz"):
			return new JazzMusic();
		default:
			System.err.println("No music available for code " + music);
			System.exit(-1);
			return null;
		}
	}

	@Override
	public Game getGame(String gameCode) {
		return null;
	}
}
