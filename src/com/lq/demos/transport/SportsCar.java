package com.lq.demos.transport;

public class SportsCar extends Car {
	
//	Constructors from super class(Car)
	
	public SportsCar() {}	
	
	public SportsCar(String name) {
		super(name);
	}
	
	public SportsCar(int speed) {
		super(speed);
	}
	
	public SportsCar(String name,int speed, int fuel, boolean running){
		super(name,speed,fuel,running);
	}
	
	
//	Methods from super class
	@Override
	// Override = Same signature
	public void setSpeed(int newSpeed) {
		super.setSpeed((int)(newSpeed*1.10));
	}
	
}
