package jdp.builder.objects.brake;

import jdp.builder.objects.Component;
import jdp.builder.packing.Packing;
import jdp.builder.packing.pack.PlasticWrapper;

public abstract class Brake implements Component {

	private final static Packing _plastic = new PlasticWrapper();
	
	@Override
	public Packing getPacking(){
		return _plastic;
	}

	@Override
	public abstract String getName();

	@Override
	public abstract String getCode();

	@Override
	public abstract double getPrice();

	@Override
	public abstract float[] getDimensions();

}
