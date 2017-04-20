package model;

import java.util.ArrayList;

import Entity.Fruit;

public interface Plantable {
	String name = "";
	int age = 0;
	
	//State
	String state = "";
	int lifeSpan = 5; //max age -> plant die
	int maturity = 2; //producing age
	int sprout = 1; //being a seed
	
	//Gauge
	int maxHealth = 3;
	int healthGauge = 3;
	int maxWater = 5;
	int waterGauge = 5;
	
	ArrayList<Fruit> product = new ArrayList<Fruit>();
	boolean isFertilized = false;
	
	String getState();
	void increaseAge();
}
