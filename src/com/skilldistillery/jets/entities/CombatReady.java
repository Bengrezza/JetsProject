package com.skilldistillery.jets.entities;

public interface CombatReady {

	default void fight() {
		System.out.println("Engaging in combat.");
	}

}