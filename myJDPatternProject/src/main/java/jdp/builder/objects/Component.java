package jdp.builder.objects;

import jdp.builder.packing.Packing;

public interface Component {
	
	public Packing getPacking();
	public String getName();
	public String getCode();
	public double getPrice();
	public float[] getDimensions();
	
}
