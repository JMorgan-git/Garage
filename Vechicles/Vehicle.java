package com.qa.example.garage.Vechicles;

public abstract class Vehicle {

	private int iD;
	private double cost;
	private String colour;
	private String Model;
	private int wheels;

	public Vehicle(int iD, double cost, String colour, String Model, int wheels) {
		this.iD = iD;
		this.cost = cost;
		this.colour = colour;
		this.Model = Model;
		this.wheels = wheels;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void setId(int iD) {
		this.iD = iD;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void setModel(String Model) {
		this.Model = Model;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public Double getCost() {
		return this.cost;
	}

	public int getId() {
		return this.iD;
	}

	public String getColour() {
		return this.colour;
	}

	public String getModel() {
		return this.Model;
	}

	public int getWheels() {
		return this.wheels;
	}

	public abstract double reciptIndiv();

}
