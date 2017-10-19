package jdp.builder.packing.pack;

import jdp.builder.packing.Packing;

public class CartonBox implements Packing {

	private static final String _carton = "Carton";
	@Override
	public String getMaterial() {
		return _carton;
	}

}
