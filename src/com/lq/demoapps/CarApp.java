package com.lq.demoapps;

import java.time.LocalDate;

import com.lq.demos.transport.Car;
import com.lq.demos.transport.SportsCar;
import com.lq.demos.transport.StationWagon;

public class CarApp {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setName("Super Car");
		car1.setSpeed(100);
		car1.setGasoline(20);
		car1.setManufactured(LocalDate.of(1960, 05, 17));
		
//		Car car2 = new Car("Car2",250,20,true);
//		car2.setManufactured(LocalDate.of(1967, 04, 02));
		
		Car car2 = new SportsCar("Sport Car",250,20,true);
		car2.setManufactured(LocalDate.of(1967, 04, 02));
		
		//Car wagonCar = new StationWagon("Wagon");
		StationWagon wagonCar = new StationWagon("Wagon Car");
		wagonCar.setManufactured(LocalDate.of(1990, 04, 02));
		wagonCar.setSpeed(30);
		wagonCar.setCurrentCargoLoad(500);
		
		for(Car c: new Car[] {car1,car2,wagonCar}) {
			System.out.printf("%s is %d years old and is traveling at %d mph%n",c.getName(),c.getAge(),c.getSpeed());
		}
	}

}
