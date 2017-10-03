package jdp.singleton;

public class MainSingletonDemo {
	
	   public static void main(String[] args) {

	      //illegal construct
	      //Compile Time Error: The constructor SingleObject() is not visible
	      //SingleObject object = new SingleObject(55);

	      //Get the only object available
	      SingleObject singleObj = SingleObject.getInstanceOfSO(55);

	      //show the message
	      System.out.println("Magic number is: " + singleObj.getMagicNumber());
	   }

}
