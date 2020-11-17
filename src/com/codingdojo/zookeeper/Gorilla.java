package com.codingdojo.zookeeper;

public class Gorilla extends Mammal {
	public void throwSomething() {
		System.out.println("Gorilla has thrown an item!");
		energyLevel -= 5;
	}
	public void eatBananas() {
		System.out.println("Gorilla loves bananas! totally satisfied :)");
		energyLevel += 10;
	}
	public void climb() {
		System.out.println("Gorilla has climbed a tree and may need more bananas");
		energyLevel -= 10;
	}
}
