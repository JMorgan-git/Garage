package com.qa.example.garage.Vechicles;

public class Car extends Vehicle {

	public Car(int iD, double cost, String colour, String Model, int wheels) {
		super(iD, cost, colour, Model, wheels);
	}

	@Override
	public double reciptIndiv() {
		double mod = this.getCost() * this.getWheels();
		return mod;
	}

}
