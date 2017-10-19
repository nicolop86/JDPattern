package jdp.builder;

public class MainBuilderDemo {

	public static void main(String[] args) {
		MotorcycleBuilder mbuilder = new MotorcycleBuilder();
		
		System.out.println("Building new motorbikes");
		System.out.println("Sport motorbike");
		Motorcycle sport = mbuilder.getSportMotorBike();
		sport.showItems();
		System.out.println("");
		System.out.println("Costs " + sport.getCost() + " $");
		System.out.println("Voyage motorbike");
		Motorcycle voyage = mbuilder.getVoyageMotorBike();
		voyage.showItems();
		System.out.println("");
		System.out.println("Costs " + voyage.getCost() + " $");
		System.out.println("Whatever motorbike");
		Motorcycle whatever = mbuilder.getWhateverMotorBike();
		whatever.showItems();
		System.out.println("");
		System.out.println("Costs " + whatever.getCost() + " $");
	}

}
