package com.codingdojo.zookeeper;

public class Mammal {
	protected int energyLevel = 100;
	
	public void energyLevel() {
		
	}
	public int displayEnergy() {
		System.out.println("Energy level is " + energyLevel);
		return energyLevel;
	}
}
