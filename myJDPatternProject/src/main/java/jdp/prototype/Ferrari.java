package jdp.prototype;

import java.io.PrintStream;

public class Ferrari extends Car {

	private static final String _model = "Ferrari F14T";
	private static final int _volume = 2599;
	
	public Ferrari(){
		super();
		setModel(_model);
		setVolume(_volume);
	}
	
	@Override
	public void run(PrintStream ps) {
		ps.println("Model: " + getModel() + " - volume: " + getVolume());
	}

}
