package jdp.builder.objects.wheel;

public class BridgestoneWheel extends Wheel {

	private static final String _name = "Bridgestone Wheel";
	private static final String _code = "B01";
	private static final double _price = 109.5;
	private static final float[] _dimensions = new float[]{95.2f,29.1f};
	
	@Override
	public String getName() {
		return _name;
	}

	@Override
	public String getCode() {
		return _code;
	}

	@Override
	public double getPrice() {
		return _price;
	}

	@Override
	public float[] getDimensions() {
		return _dimensions;
	}

}
