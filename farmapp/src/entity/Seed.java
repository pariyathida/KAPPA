<<<<<<< HEAD
package entity;

import model.Item;

public class Seed implements Item{
	private String name;
	private double price;
	private int amount=0;
	private String type = "seed";
	
	public Seed(String name){
		this.name = name;
	}
	
	public Seed(String name, double price){
		this.name = name;
		this.setPrice(price);
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

	public void setPrice(double price) {
		this.price = price;
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

public class Seed implements Item{
	private String name;
	private double price;
	private int amount=0;
	private String type = "seed";
	
	public Seed(String name){
		this.name = name;
	}
	
	public Seed(String name, double price){
		this.name = name;
		this.setPrice(price);
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

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean deductAmount(int amount) {
		// TODO Auto-generated method stub
		this.amount-=amount;
		return true;
	}

}
>>>>>>> origin/master
