package com.lq.demos.transport;

public class Cargo extends Car {

	private int currentCargoLoad;
	private int cargoCapacity;

	public Cargo() {
		super();
	}

	public Cargo(int a) {
		super(a);
	}

	@Override
	public void setSpeed(int newSpeed) {
		super.setSpeed(newSpeed - (getCurrentCargoLoad()/100));
	}

	public int getCurrentCargoLoad() {
		return currentCargoLoad;
	}

	public void setCurrentCargoLoad(int currentCargoLoad) {
		this.currentCargoLoad=currentCargoLoad;
	}

	public Cargo(String name, int speed, int fuel, boolean running) {
		super(name, speed, fuel, running);
	}

	public Cargo(String name) {
		super(name);
	}

}