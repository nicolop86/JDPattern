package jdp.singleton;

public class SingleObject {
	
	private static int magicNumber;
	private static SingleObject _instanceSO = new SingleObject();
	
	private SingleObject() {
		setMagicNumber(0);
	}
	
	private SingleObject(int magicNumber) {
		setMagicNumber(magicNumber);
	}

	public static SingleObject getInstanceOfSO() {
		return _instanceSO;
	}
	
	public static SingleObject getInstanceOfSO(int magicNumber) {
		setMagicNumber(magicNumber);
		return _instanceSO;
	}
	
	public int getMagicNumber() {
		return magicNumber;
	}

	public static void setMagicNumber(int magicNumber) {
		SingleObject.magicNumber=magicNumber;
	}

}
