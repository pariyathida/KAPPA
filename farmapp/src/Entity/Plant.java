package entity;

import java.util.ArrayList;

import Fruit.largeMorningFruit;
import Fruit.smallMorningFruit;
import model.Plantable;

public class Plant implements Plantable {
	protected String name;
	protected int age;
	protected int health;
	protected int healthGauge;
	protected int water;
	protected int waterGauge;
	protected int sprout;
	protected int maturity;
	protected int lifeSpan;
	protected String state = "seedling";
	protected ArrayList<Fruit> product = new ArrayList<Fruit>();
	protected boolean isFertilized = false;
	
	
	public Plant(String name, int health, int water, int sprout, int maturity, int lifeSpan){
		this.name = name;
		this.health = health;
		this.healthGauge = health;
		this.water = water;
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
		return health;
	}
	
	public int getHealthGauge(){
		return healthGauge;
	}
	
	public int getWater(){
		return water;
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
	
	public void getInfo(){
		System.out.print("\tAge : " + this.state + " ("
				+ this.age + "/" + this.lifeSpan + " Days)");
		System.out.println();
		System.out.print("\tHealth : ");
		for (int j = 0; j < this.healthGauge; j++) {
			System.out.print("<3 ");
		}
		System.out.println("(" + this.healthGauge + "/"
				+ this.health + ")");
		System.out.print("\tWater : ");
		for (int j = 0; j < this.waterGauge; j++) {
			System.out.print("<3 ");
		}
		System.out.println("(" + this.waterGauge + "/"
				+ this.water + ")");
		System.out.print("\tFruit :");
		if (this.product.isEmpty()) {
			System.out.println("empty");
		} else {
			for (Fruit f : this.product) {
				System.out.print(" " + f.amount + " " + f.name);
			}
		}
		System.out.println();
	}

	public void increaseAge() {
		age++;
		if (isFertilized) {
			sprout--;
			maturity--;
		}
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
		if (waterGauge > 0) {
			waterGauge--;
		}
		if (waterGauge == 0) {
			healthGauge--;
		}
		if (healthGauge == 0) {
			state = "dead";
			System.out.println("Oh no! Your " + name + " has rot.");
		}
		
		
		/*
		if (healthGauge == 0) {
			product.clear();
			System.out.println("Oh no! Your " + name + " fruit has rot");
		} else if (state.equals("mature")) {
			if (water == waterGauge && health == healthGauge) {
				boolean exist = false;
				Fruit f = new largeMorningFruit();
				for (Fruit fr : product) {
					if (fr.getName().equals(f.getName())) {
						fr.setAmount(fr.getAmount() + 1);
						exist = true;
						break;
					}
				}
				if (!exist) {
					f.setAmount(1);
					product.add(f);
				}
				System.out.println("Yay! Your " + name + " has produced " + f.getName());
			} else {
				boolean exist = false;
				Fruit f = new smallMorningFruit();
				for (Fruit fr : product) {
					if (fr.getName().equals(f.getName())) {
						fr.setAmount(fr.getAmount() + 1);
						exist = true;
						break;
					}
				}
				if (!exist) {
					f.setAmount(1);
					product.add(f);
				}
				System.out.println("Yay! Your " + name + " has produced " + f.getName());
			}
		}*/
	}
}
