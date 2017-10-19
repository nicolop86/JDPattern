package jdp.builder.objects.wheel;

import jdp.builder.objects.Component;
import jdp.builder.packing.Packing;
import jdp.builder.packing.pack.CartonBox;

public abstract class Wheel implements Component {
	
	private static final Packing _carton = new CartonBox();
	
	@Override
	public Packing getPacking(){
		return _carton;
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
