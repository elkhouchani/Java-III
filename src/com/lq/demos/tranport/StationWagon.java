package com.lq.demos.tranport;

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
	
	public void setCargoLoad(int currentCargoLoad) {
		this.currentCargoLoad=currentCargoLoad;
	}
	private int cargoCapacity;
	private int currentCargoLoad;
	
	
}
