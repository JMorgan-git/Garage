package com.qa.example.garage.Vechicles;

public class Lorry extends Vehicle {

	public Lorry(int id, double cost, String colour, String Model, int wheels) {
		super(id, cost, colour, Model, wheels);
	}

	@Override
	public double reciptIndiv() {
		double mod = this.getCost() * this.getWheels();
		return mod;
	}
}
