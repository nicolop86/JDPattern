package jdp.builder.packing.pack;

import jdp.builder.packing.Packing;

public class PlasticWrapper implements Packing {

	private static final String _plastic = "Plastic";
	@Override
	public String getMaterial() {
		return _plastic;
	}

}
