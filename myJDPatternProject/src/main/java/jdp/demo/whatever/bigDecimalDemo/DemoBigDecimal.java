package jdp.demo.whatever.bigDecimalDemo;

import java.math.BigDecimal;

public class DemoBigDecimal {

	public static void main(String[] args) {
		String num = "80.0";
		
		BigDecimal n = new BigDecimal(num);
		BigDecimal n1 = new BigDecimal(80.1);
		
		System.out.println(n);
		System.out.println(n1.compareTo(n)<0);
	}

}