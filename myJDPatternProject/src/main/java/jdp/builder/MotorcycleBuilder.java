package jdp.builder;

import jdp.builder.objects.brake.AirBreak;
import jdp.builder.objects.brake.BremboBrake;
import jdp.builder.objects.wheel.BridgestoneWheel;
import jdp.builder.objects.wheel.DunlopWheel;

public class MotorcycleBuilder {
	
	public Motorcycle getSportMotorBike(){
		Motorcycle sports = new Motorcycle();
		sports.addComponent(new BremboBrake());
		sports.addComponent(new DunlopWheel());
		return sports;
	}
	
	public Motorcycle getVoyageMotorBike(){
		Motorcycle voyage = new Motorcycle();
		voyage.addComponent(new AirBreak());
		voyage.addComponent(new BridgestoneWheel());
		return voyage;
	}
	
	public Motorcycle getWhateverMotorBike(){
		Motorcycle whatever = new Motorcycle();
		whatever.addComponent(new AirBreak());
		whatever.addComponent(new DunlopWheel());
		return whatever;
	}

}
