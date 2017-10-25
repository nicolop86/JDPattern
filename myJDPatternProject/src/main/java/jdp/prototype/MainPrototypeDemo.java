package jdp.prototype;

public class MainPrototypeDemo {

	public static void main(String[] args) {
	      CarCache.loadCache();

	      Car clonedCar1 = (Car) CarCache.getCar(0);
	      clonedCar1.run(System.out);

	      Car clonedCar2 = (Car) CarCache.getCar(1);
	      clonedCar2.run(System.out);		

	      Car clonedCar3 = (Car) CarCache.getCar(2);
	      clonedCar3.run(System.out);
	      
	   }
	
}
