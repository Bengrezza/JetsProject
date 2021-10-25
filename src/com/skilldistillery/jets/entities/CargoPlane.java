package com.skilldistillery.jets.entities;

public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane(String model, String type, double speed, int range, long price) {
		super(model, type, speed, range, price);
	}

}