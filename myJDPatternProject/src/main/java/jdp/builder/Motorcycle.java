package jdp.builder;

import java.util.ArrayList;
import java.util.List;

import jdp.builder.objects.Component;

public class Motorcycle {
	public List<Component> components = new ArrayList<Component>();
	
	 public void addComponent(Component component){
	      components.add(component);
	   }

	   public float getCost(){
	      float cost = 0.0f;
	      
	      for (Component comp : components) {
	         cost += comp.getPrice();
	      }		
	      return cost;
	   }

	   public void showItems(){
	   
	      for (Component comp : components) {
	         System.out.print("Component : " + comp.getName());
	         System.out.print(", Packing : " + comp.getPacking().getMaterial());
	         System.out.print(", Price : " + comp.getPrice());
	         System.out.print(", Code : " + comp.getCode());
	         System.out.print(", Dimensions : ");
	         for(int i=0; i<comp.getDimensions().length; i++){
	        	 System.out.print(comp.getDimensions()[i] + " cm ");
	         }
	      }		
	   }

}
