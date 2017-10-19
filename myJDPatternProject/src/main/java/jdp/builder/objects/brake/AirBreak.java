package jdp.builder.objects.brake;

public class AirBreak extends Brake {
	
	private static final String _name = "Air Brake 01";
	private static final String _code = "ABR01";
	private static final double _price = 151.5;
	private static final float[] _dimensions = new float[]{20,9.3f,8.1f};

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
