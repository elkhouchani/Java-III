package com.lq.demos.transport;

public class StationWagon extends Cargo {

	
	public StationWagon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StationWagon(String name) {
		super(name);
	}

	public StationWagon(int a) {
		super(a);
	}

	public StationWagon(String name, int speed, int fuel, boolean running) {
		super(name, speed, fuel, running);
	}
	
	

	
	//-------------- OVERRIDING(Polymorphism) ------------

}
