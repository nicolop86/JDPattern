package jdp.builder.objects.brake;

public class BremboBrake extends Brake {

	private static final String _name = "Brembo Brake 01";
	private static final String _code = "BBR01";
	private static final double _price = 189.2;
	private static final float[] _dimensions = new float[]{15,7.3f,7.3f};

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
