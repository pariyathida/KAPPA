package entity;

import model.Item;

public class Fruit {
	protected String name;
	//String type = "fruit";
	protected double price;
	int amount;
	/*public String getType() {
		return type;
	}*/
	public String getName() {
		return name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public void use(){
		
	}
	public void discard(){
		
	}
}
