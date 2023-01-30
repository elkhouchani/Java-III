package com.lq.demos.tranport;

import static java.lang.Math.min;

import java.time.LocalDate;
import java.time.Period;

public class Car {
	//Default Constructor
	public Car(){};
	//Parameterized Constructor
	public Car(int a){
			setSpeed(a);		
		};
	//Parameterized Constructor
	public Car(String name,int speed, int fuel, boolean running){
		setName(name);
		setSpeed(speed);
		setGasoline(fuel);
		setEngineState(running);
	};
	//Copy Constructor
	public Car(String name){
		this(name,0,0,false);
	};
	
	private static final int MAX_SPEED=90;
//	----- name -------
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		name = newName;
	}
	
//	----- gasoline -------
	private int gasoline;
	public int getGasoline() {
		return gasoline;
	}
	public void setGasoline(int gasoline) {
		this.gasoline = gasoline;
	}
	
//	----- speed -------
	private int speed;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int newSpeed) {
		//speed=newSpeed;
//		speed = newSpeed <= MAX_SPEED ? newSpeed : MAX_SPEED;
//		speed= Math.min(newSpeed,MAX_SPEED);
		speed= min(newSpeed,MAX_SPEED);

	}
	
//	----- engineState -------
	private boolean engineState;
	public boolean isEngineState() {
		return engineState;
	}
	public void setEngineState(boolean engineState) {
		this.engineState = engineState;
	}
	// ** OVERLOADING ** THE setEngineState method
	public void setEngineState(boolean engineState, int newSpeed) {
		this.engineState=engineState;
		speed=newSpeed;
	}	
	
	public void setEngineState() {
		this.engineState = true;
	}
// ------------ Varargs -------------------
	
	public void varargsMethod(int ... a) {
		System.out.println("The length is "+a.length);
	}
	
//---------------------------------------------------
	
		private LocalDate manufactured;
		public LocalDate getManufactured() {
			return manufactured;
		}
		public void setManufactured(LocalDate manufactured) {
			this.manufactured = manufactured;
		}
		 public int getAge() {
			 return Period.between(getManufactured(), LocalDate.now()).getYears();
		 }
		
// ----------------- Main ---------------------------------------
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car();
		car1.setName("Ford");
		car1.setSpeed(180);
		car1.setGasoline(10);
		car1.setEngineState(true);
		System.out.printf("The car's name is %s, its speed is %d, its gasoline is set to %d and its engine state is %b\n",car1.getName(),car1.getSpeed(),car1.getGasoline(),car1.isEngineState());

		car1.setEngineState(false,50);
		System.out.printf("The car's name is %s, its speed is %d, its gasoline is set to %d and its engine state is %b\n",car1.getName(),car1.getSpeed(),car1.getGasoline(),car1.isEngineState());

		car1.setEngineState();
		System.out.printf("The car's name is %s, its speed is %d, its gasoline is set to %d and its engine state is %b\n",car1.getName(),car1.getSpeed(),car1.getGasoline(),car1.isEngineState());
		
		car1.varargsMethod(12,14,6);
		car1.varargsMethod();
		
		//Testing constructor with one parameter
		car1= new Car(47);
		System.out.println(car1.getSpeed());
		
		//Testing constructor with multy parameters
		car1= new Car("Maserati",66,77,true);
		System.out.println(car1.getName()+" "+car1.getGasoline()+" "+car1.getSpeed()+" "+car1.isEngineState());
		
		//Testing a copy constructor 
		car1= new Car("Bugatti");
		System.out.println(car1.getName()+" "+car1.getGasoline()+" "+car1.getSpeed()+" "+car1.isEngineState());
		
	}

}
