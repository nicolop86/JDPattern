package jdp.prototype;

import java.io.PrintStream;

public class Jaguar extends Car {
	
	private static final String _model = "Jaguar J19";
	private static final int _volume = 2100;

	public Jaguar(){
		super();
		setModel(_model);
		setVolume(_volume);
	}
	
	@Override
	public void run(PrintStream ps) {
		ps.println("Model: " + getModel() + " - volume: " + getVolume());
	}

}
