package jdp.demo.whatever.stringDemo;

public class MainStringDemo {

	public static void main(String[] args) {
		String name = "legance\\agay";
		System.out.println(name);
		
		if(name.contains("\\")){
			String[] split = name.split("\\\\");
			for(int i=0; i<split.length; i++){
				System.out.println(split[i]);
			}
		} else {
			System.out.println("False condition");
		}
	}

}
