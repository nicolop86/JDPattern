package jdp.prototype;

import java.util.Hashtable;

public class CarCache {

	private static Hashtable<Integer, Car> carMap  = new Hashtable<Integer, Car>();

	public static Car getCar (int id){
		Car cachedCar = carMap.get(Integer.valueOf(id));
		return (Car) cachedCar.clone();
	}
	
	public static void loadCache() {
	      Ferrari f = new Ferrari();
	      f.setId(0);
	      carMap.put(f.getId(), f);

	      Maserati m = new Maserati();
	      m.setId(1);
	      carMap.put(m.getId(), m);

	      Jaguar j = new Jaguar();
	      j.setId(2);
	      carMap.put(j.getId(), j);
	   }
}
