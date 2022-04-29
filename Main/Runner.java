package com.qa.example.garage.Main;

import com.qa.example.garage.Garage.Garage;
import com.qa.example.garage.Vechicles.Car;
import com.qa.example.garage.Vechicles.Lorry;
import com.qa.example.garage.Vechicles.Motorbike;

public class Runner {

	public static void main(String[] args) {

		Car car1 = new Car(1, 50.65, "red", "Vauxhall", 4);
		Motorbike motobike1 = new Motorbike(2, 90.70, "blue", "Harley", 2);
		Lorry lorry1 = new Lorry(3, 250.80, "grey", "Oil rigg", 6);

//Add vehicles
		Garage Gar = new Garage();
		Gar.addV(car1);
		Gar.addV(motobike1);
		Gar.addV(lorry1);

//make recipt and bills
		Gar.calReciptIndiv();
		Gar.reciptTot();

//remove and add
		Gar.removeV(car1);
		Gar.addV(lorry1);

//make new recipt and bills with new outcome
		Gar.calReciptIndiv();
		Gar.reciptTot();

//empty everything
		Gar.emptyAll();

	}

}
