package com.skilldistillery.jets.entities;

public interface CargoCarrier {

	default void loadCargo() {
		System.out.println(("Loading cargo onto:"));
	}

}