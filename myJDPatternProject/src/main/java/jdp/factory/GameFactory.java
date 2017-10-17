package jdp.factory;

public class GameFactory {

	private final static GameFactory _instance = new GameFactory();

	private GameFactory(){
	}
	
	public static Game getGameInstance(int gameCode){
		return _instance.getGame(gameCode);
	}

	private Game getGame(int gameCode){
		switch(gameCode){
		case 0:
			return new VideoGame();
		case 1:
			return new Risiko();
		case 2:
			return new Cards();
		default:
			System.err.println("No valid game code entry");
			System.exit(-1);
			return null;
		}
	}

}
