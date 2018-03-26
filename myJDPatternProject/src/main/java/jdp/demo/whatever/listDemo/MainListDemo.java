package jdp.demo.whatever.listDemo;

import java.util.ArrayList;
import java.util.List;

public class MainListDemo {

	public static void main(String[] args) {
		List<Long> list1 = new ArrayList<>();
		list1.add((long) 0);
		list1.add((long) 2);
		list1.add((long) 4);
		list1.add((long) 8);
		System.out.println("First Run");
		for (Long long1 : list1) {
			System.out.println("Value: " + long1);
		}

		System.out.println("List 2");
		
		List<Long> list2 = new ArrayList<>();
//		list2.add((long) 0);
//		list2.add((long) 2);

		for (Long long2 : list2) {
			System.out.println("Value: " + long2);
		}
		
		list1.retainAll(list2);
		System.out.println("Intersection");
		System.out.println("Is list1 empty? " + list1.isEmpty());
		for (Long long1 : list1) {
			System.out.println("Value: " + long1);
		}
	}

}
