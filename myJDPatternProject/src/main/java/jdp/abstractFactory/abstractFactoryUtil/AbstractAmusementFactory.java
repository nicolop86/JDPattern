package jdp.abstractFactory.abstractFactoryUtil;

import jdp.abstractFactory.game.Game;
import jdp.abstractFactory.music.Music;

public abstract class AbstractAmusementFactory {

	public abstract Game getGame(String gameCode);
	public abstract Music getMusic(String music);
	
}
