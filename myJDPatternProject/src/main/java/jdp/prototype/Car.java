package jdp.prototype;

import java.io.PrintStream;

public abstract class Car implements Cloneable {
	
	private String model;
	private int volume;
	private int id;
	
	public abstract void run(PrintStream ps);
	
	protected void setModel(String model){
		this.model=model;
	}
	
	protected String getModel(){
		return this.model;
	}
	
	protected void setVolume(int volume){
		this.volume=volume;
	}
	
	protected int getVolume(){
		return this.volume;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Object clone() {
	      Object clone = null;
	      
	      try {
	         clone = super.clone();
	         
	      } catch (CloneNotSupportedException e) {
	         e.printStackTrace();
	      }
	      
	      return clone;
	   }

}
