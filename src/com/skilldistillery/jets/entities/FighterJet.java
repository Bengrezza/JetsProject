package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet(String model, String type, double speed, int range, long price) {
		super(model, type, speed, range, price);
	}

}