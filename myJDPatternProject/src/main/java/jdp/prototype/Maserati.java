package jdp.prototype;

import java.io.PrintStream;

public class Maserati extends Car{

	private static final String _model = "Maserati M23";
	private static final int _volume = 3400;
	
	public Maserati(){
		super();
		setModel(_model);
		setVolume(_volume);
	}
	
	@Override
	public void run(PrintStream ps) {
		ps.println("Model: " + getModel() + " - volume: " + getVolume());
	}
	
}
