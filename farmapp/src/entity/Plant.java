<<<<<<< HEAD
package entity;

import java.util.ArrayList;

import library.FruitLibrary;
import model.Plantable;

public class Plant implements Plantable {
	protected String name;
	protected int age;
	protected int maxHealth; //max health gauge
	protected int healthGauge;
	protected int maxWater;  //max water gauge
	protected int waterGauge;
	protected int sprout;	//cannot produce fruit yet
	protected int maturity; //produce fruit
	protected int lifeSpan; //exceed means dead
	protected String state = "seedling";
	protected Fruit fruit = null;
	protected boolean isFertilized = false;
	
	public Plant(String name, int health, int water, int sprout, int maturity, int lifeSpan){
		this.name = name;
		this.maxHealth = health;
		this.healthGauge = health;
		this.maxWater = water;
		this.waterGauge = water;
		this.sprout = sprout;
		this.maturity = maturity;
		this.lifeSpan = lifeSpan;
	}

	public String getState() {
		return state;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getAge(){
		return age;
	}
	
	public int getHealth(){
		return maxHealth;
	}
	
	public int getHealthGauge(){
		return healthGauge;
	}
	
	public int getWater(){
		return maxWater;
	}
	
	public int getWaterGauge(){
		return waterGauge;
	}
	
	public int getSprout(){
		return sprout;
	}
	
	public int getMaturity(){
		return maturity;
	}
	
	public int getLifeSpan(){
		return lifeSpan;
	}
	
	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}
	
	public Fruit getFruit() {
		return fruit;
	}
	
	private void increaseWaterGauge(){
		if(waterGauge<maxWater){
			waterGauge++;
		}
	}
	private void decreaseWaterGauge(){
		if(waterGauge>0){
			waterGauge--;
		}
	}
	private void increaseHealthGauge(){
		if(healthGauge<maxHealth){
			healthGauge++;
		}
	}
	private void decreaseHealthGauge(){
		if(healthGauge>0){
			healthGauge--;
		}
	}
	
	public void isWatered(){
		increaseWaterGauge();
	}
	
	public void getInfo(){		
		System.out.print("\tAge : " + this.state + " ("
				+ this.age + "/" + this.lifeSpan + " Days)");
		System.out.println();
		System.out.print("\tHealth : ");
		for (int j = 0; j < this.healthGauge; j++) {
			System.out.print("<3 ");
		}
		System.out.println("(" + this.healthGauge + "/"
				+ this.maxHealth + ")");
		System.out.print("\tWater : ");
		for (int j = 0; j < this.waterGauge; j++) {
			System.out.print("<3 ");
		}
		System.out.println("(" + this.waterGauge + "/"
				+ this.maxWater + ")");
		System.out.print("\tFruit :");
		if (this.fruit == null) {
			System.out.println("empty");
		} else {
				System.out.print(" " + fruit.getAmount() + " " + fruit.getName());
		}
		System.out.println();
	}

	public void increaseAge() {
		age++;

		//update the state of plant
		if (age > sprout) {
			state = "sprout";
		}
		if (age > maturity) {
			state = "mature";
		}
		if (age > lifeSpan) {
			state = "dead";
			System.out.println("Oh no! Your " + name + " has rot.");
		}
		
		//produce fruits
		//only mature state can produce fruit
		if (state.equals("mature")){ 
			int numberOfFruit=1;
			if(fruit==null){
				fruit = FruitLibrary.getFruit(name);
			}	
			if(healthGauge == maxHealth){
				numberOfFruit++;
			}
			if(waterGauge == maxWater){
				numberOfFruit++;
			}
			if(isFertilized){
				numberOfFruit++;
			}
			fruit.addAmount(numberOfFruit);
			System.out.println("Yay! Your " + name + " has produced " + numberOfFruit +" fruit(s).");
		}
		
		//update water and health gauge
		if(waterGauge == maxWater){
			increaseHealthGauge();
		}
		decreaseWaterGauge();
		if (waterGauge == 0) {
			decreaseHealthGauge();
		}
		
		//if health gauge is 0, plant is dead and all fruits are gone.
		if (healthGauge == 0) {
			state = "dead";
			System.out.println("Oh no! Your " + name + " has rot.");
			if(fruit!=null){
				fruit=null;
				System.out.println("Oh no! Your " + name + "'s fruit has rot");
			}
		}
	}
	
	public Fruit isHarvested(){
		if(fruit!=null){
			Fruit f = fruit;
			fruit = null;
			return f;
		}else{
			return null;
		}
	}
}
=======
package entity;

import java.util.ArrayList;

import library.FruitLibrary;
import model.Plantable;

public class Plant implements Plantable {
	protected String name;
	protected int age;
	protected int maxHealth; //max health gauge
	protected int healthGauge;
	protected int maxWater;  //max water gauge
	protected int waterGauge;
	protected int sprout;	//cannot produce fruit yet
	protected int maturity; //produce fruit
	protected int lifeSpan; //exceed means dead
	protected String state = "seedling";
	protected Fruit fruit = null;
	protected boolean isFertilized = false;
	
	public Plant(String name, int health, int water, int sprout, int maturity, int lifeSpan){
		this.name = name;
		this.maxHealth = health;
		this.healthGauge = health;
		this.maxWater = water;
		this.waterGauge = water;
		this.sprout = sprout;
		this.maturity = maturity;
		this.lifeSpan = lifeSpan;
	}
	

	public String getState() {
		return state;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getAge(){
		return age;
	}
	
	public int getHealth(){
		return maxHealth;
	}
	
	public int getHealthGauge(){
		return healthGauge;
	}
	
	public int getWater(){
		return maxWater;
	}
	
	public int getWaterGauge(){
		return waterGauge;
	}
	
	public int getSprout(){
		return sprout;
	}
	
	public int getMaturity(){
		return maturity;
	}
	
	public int getLifeSpan(){
		return lifeSpan;
	}
	
	private void increaseWaterGauge(){
		if(waterGauge<maxWater){
			waterGauge++;
		}
	}
	private void decreaseWaterGauge(){
		if(waterGauge>0){
			waterGauge--;
		}
	}
	private void increaseHealthGauge(){
		if(healthGauge<maxHealth){
			healthGauge++;
		}
	}
	private void decreaseHealthGauge(){
		if(healthGauge>0){
			healthGauge--;
		}
	}
	
	public void isWatered(){
		increaseWaterGauge();
	}
	
	public void getInfo(){		
		System.out.print("\tAge : " + this.state + " ("
				+ this.age + "/" + this.lifeSpan + " Days)");
		System.out.println();
		System.out.print("\tHealth : ");
		for (int j = 0; j < this.healthGauge; j++) {
			System.out.print("<3 ");
		}
		System.out.println("(" + this.healthGauge + "/"
				+ this.maxHealth + ")");
		System.out.print("\tWater : ");
		for (int j = 0; j < this.waterGauge; j++) {
			System.out.print("<3 ");
		}
		System.out.println("(" + this.waterGauge + "/"
				+ this.maxWater + ")");
		System.out.print("\tFruit :");
		if (this.fruit == null) {
			System.out.println("empty");
		} else {
				System.out.print(" " + fruit.getAmount() + " " + fruit.getName());
		}
		System.out.println();
	}

	public void increaseAge() {
		age++;

		//update the state of plant
		if (age > sprout) {
			state = "sprout";
		}
		if (age > maturity) {
			state = "mature";
		}
		if (age > lifeSpan) {
			state = "dead";
			System.out.println("Oh no! Your " + name + " has rot.");
		}
		
		//produce fruits
		//only mature state can produce fruit
		if (state.equals("mature")){ 
			int numberOfFruit=1;
			if(fruit==null){
				fruit = FruitLibrary.getFruit(name);
			}	
			if(healthGauge == maxHealth){
				numberOfFruit++;
			}
			if(waterGauge == maxWater){
				numberOfFruit++;
			}
			if(isFertilized){
				numberOfFruit++;
			}
			fruit.addAmount(numberOfFruit);
			System.out.println("Yay! Your " + name + " has produced " + numberOfFruit +" fruit(s).");
		}
		
		//update water and health gauge
		if(waterGauge == maxWater){
			increaseHealthGauge();
		}
		decreaseWaterGauge();
		if (waterGauge == 0) {
			decreaseHealthGauge();
		}
		
		//if health gauge is 0, plant is dead and all fruits are gone.
		if (healthGauge == 0) {
			state = "dead";
			System.out.println("Oh no! Your " + name + " has rot.");
			if(fruit!=null){
				fruit=null;
				System.out.println("Oh no! Your " + name + "'s fruit has rot");
			}
		}
	}
	
	public Fruit isHarvested(){
		if(fruit!=null){
			Fruit f = fruit;
			fruit = null;
			return f;
		}else{
			return null;
		}
	}
}
>>>>>>> origin/master
