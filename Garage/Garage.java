package com.qa.example.garage.Garage;

import java.util.ArrayList;

import com.qa.example.garage.Vechicles.Vehicle;

public class Garage {

	private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

	public void addV(Vehicle vehicle) {
		this.vehicles.add(vehicle);
	}

	public void removeV(Vehicle vehicle) {
		this.vehicles.remove(vehicle);
	}

	public void emptyAll() {
		this.vehicles.clear();
	}

	public void calReciptIndiv() {
		for (Vehicle vehicle : this.vehicles) {
			System.out.println("=".repeat(40) + "\r\n");
			System.out.println(
					"Your vehicle : " + vehicle.getId() + " " + vehicle.getModel() + " " + vehicle.getColour());
			System.out.println("vehicle cost : " + vehicle.reciptIndiv());
		}
	}

	public void reciptTot() {
		double total = 0;
		for (Vehicle vehicles : this.vehicles) {
			total += vehicles.reciptIndiv();
		}

		System.out.println("=".repeat(40));
		System.out.println("Your total bill is : ");
		System.out.println(total);
		System.out.println("=".repeat(40));
	}

}
