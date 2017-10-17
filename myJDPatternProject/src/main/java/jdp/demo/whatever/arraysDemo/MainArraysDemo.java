package jdp.demo.whatever.arraysDemo;

import java.util.ArrayList;

public class MainArraysDemo {

	public static void main(String[] args) {
		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("hi");
		stringList.add("baby");
		stringList.add("good bye");
		
		for(String element : stringList){
			System.out.println(element);
		}
		/*Generate IndexOutOfBoundsException*/
		System.out.println(stringList.get(stringList.size()));
	}

}