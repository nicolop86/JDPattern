package jdp.abstractFactory.game;

import jdp.abstractFactory.abstractFactoryUtil.AbstractAmusementFactory;
import jdp.abstractFactory.music.Music;

public class GameFactory extends AbstractAmusementFactory {

	private final static GameFactory gameFactory = new GameFactory();
	
	public static GameFactory getInstance(){
		return gameFactory;
	}
	
	@Override
	public Game getGame(String gameCode) {
		return gameFactory._getGame(gameCode);
	}

	private Game _getGame(String gameCode){
		switch(gameCode){
		case("Videogame"):
			return new VideoGame();
		case("Basket"):
			return new Basket();
		default:
			System.err.println("No valid game for code " + gameCode);
			System.exit(-1);
			return null;
		}
	}
	
	@Override
	public Music getMusic(String music) {
		return null;
	}

}
