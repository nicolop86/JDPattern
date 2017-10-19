package jdp.builder.objects.wheel;

public class DunlopWheel extends Wheel {

	private static final String _name = "Dunlop Wheel";
	private static final String _code = "D01";
	private static final double _price = 89.5;
	private static final float[] _dimensions = new float[]{90f,25f};
	
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
