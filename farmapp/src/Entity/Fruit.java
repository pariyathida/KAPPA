package entity;

public class Fruit {
	protected String name;
	protected double price;
	private int amount=0;
	
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
	
	public void use(){
		
	}
	public void discard(){
		
	}
}
