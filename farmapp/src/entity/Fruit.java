package entity;

import model.Item;

public class Fruit implements Item{
	private String name;
	private double price;
	private int amount=0;
	private String type = "fruit";
	
	public Fruit(String name){
		this.name = name;
	}
	
	public Fruit(String name, double price){
		this.name = name;
		this.price = price;
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
	
	public boolean addAmount(int amount) {
		this.amount += amount;
		return true;
	}
	
	public void discard(){
		
	}

	public boolean use() {
		// TODO Auto-generated method stub
		return false;
	}

	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}

	public boolean setAmount(int i) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean deductAmount(int amount) {
		// TODO Auto-generated method stub
		this.amount-=amount;
		return true;
	}
}
