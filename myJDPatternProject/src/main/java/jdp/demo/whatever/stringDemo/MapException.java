package jdp.demo.whatever.stringDemo;

public class MapException extends Exception {
	private static final long serialVersionUID = 1L;

	public MapException() {
		super();
	}
	
	public MapException(String s) {
		super(s);
	}
	
	public MapException(String s, Throwable cause){
		super(s, cause);
	}
}
