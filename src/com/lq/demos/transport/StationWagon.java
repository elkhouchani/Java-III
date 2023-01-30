package com.lq.demos.transport;

public class StationWagon extends Car {

	
	public StationWagon() {
		// TODO Auto-generated constructor stub
	}

	public StationWagon(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public StationWagon(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	public StationWagon(String name, int speed, int fuel, boolean running) {
		super(name, speed, fuel, running);
		// TODO Auto-generated constructor stub
	}
	
	public void setCurrentCargoLoad(int currentCargoLoad) {
		this.currentCargoLoad=currentCargoLoad;
	}
	private int cargoCapacity;
	private int currentCargoLoad;

	
	//-------------- OVERRIDING(Polymorphism) ------------
	
	@Override
	public void setSpeed(int newSpeed) {
		super.setSpeed(newSpeed - (currentCargoLoad/100));
	}
	
}
