<<<<<<< HEAD
package entity;

import model.Item;

public class PlantFood implements Item{
	private String name;
	private double price;
	private int amount=0;
	private String type = "plantFood";
	
	public PlantFood(String name, double price){
		this.name = name;
		this.price = price;
	}
	
	public String getType() {
		return type;
	}

	public String getName() {
		return name;
	}
	
	public double getPrice(){
		return price;
	}

	public int getAmount() {
		return amount;
	}

	public boolean setAmount(int amount) {
		this.amount = amount;
		return true;
	}
	
	public boolean addAmount(int amount) {
		// TODO Auto-generated method stub
		this.amount+=amount;
		return true;
	}	

	public boolean use() {
		// TODO Auto-generated method stub
		if(amount>0){
			amount--;
			return true;
		}
		return false;
	}
	
	public boolean deductAmount(int amount) {
		// TODO Auto-generated method stub
		this.amount-=amount;
		return true;
	}
}
=======
package entity;

import model.Item;

public class PlantFood implements Item{
	private String name;
	private double price;
	private int amount=0;
	private String type = "plantFood";
	
	public PlantFood(String name, double price){
		this.name = name;
		this.price = price;
	}
	
	public String getType() {
		return type;
	}

	public String getName() {
		return name;
	}
	
	public double getPrice(){
		return price;
	}

	public int getAmount() {
		return amount;
	}

	public boolean setAmount(int amount) {
		this.amount = amount;
		return true;
	}
	
	public boolean addAmount(int amount) {
		// TODO Auto-generated method stub
		this.amount+=amount;
		return true;
	}	

	public boolean use() {
		// TODO Auto-generated method stub
		if(amount>0){
			amount--;
			return true;
		}
		return false;
	}
	
	public boolean deductAmount(int amount) {
		// TODO Auto-generated method stub
		this.amount-=amount;
		return true;
	}
}
>>>>>>> origin/master
