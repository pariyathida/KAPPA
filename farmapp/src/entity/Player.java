package entity;

import java.util.ArrayList;
import main.Input;
import model.Item;

public class Player {
	private String name;
	private double money;
	private ArrayList<Item> inventory = new ArrayList<Item>();

	public Player() {
		System.out.println("Welcome. Please enter your name");
		name = Input.getString("","Please enter your name");
		System.out.println("Please enter starting money");
		money = Input.getDouble("", "Please input number");
	}
	
	public Player(String name,double money){
		this.name = name;
		this.money = money;
	}
	
	public String getName(){
		return name;
	}
	
	public double getMoney(){
		return money;
	}

	public ArrayList<Item> getInventory() {
		return inventory;
	}
	
	public boolean sellItem(){
		if(inventory.size()==0){
			System.out.println("You have no item to sell.");
		}else{
			showInventory();
			int index = Input.getInt("Which item you want to sell?","Please enter a number");
			Item item = inventory.get(index-1);
			int amount = Input.getIntMax("How many item you want to sell\n", "that number is not available, try again.", item.getAmount());
			item.deductAmount(amount);
			double price = (item.getPrice()*amount);
			money+=price;
			System.out.println("You have earned "+price+"$.");
			System.out.println("Now you have "+money+"$.");
			if(item.getAmount()==0){
				inventory.remove(index-1);
			}
		}
		return true;
	}
	
	public ArrayList<Item> getSeeds(){
		ArrayList<Item> seeds = new ArrayList<Item>();
		for (Item i : this.inventory) {
			if (i.getType() == "seed") {
				seeds.add(i);
			}
		}
		return seeds;
	}
	
	public void showInventory(){
		if(inventory.size()==0){
			System.out.println("Your inventory is empty.");
		}else{
		int count = 0;
			for (Item i : inventory) {
				count++;
				System.out.println("#" + count + " : "+ i.getAmount() + " of " + i.getName()+" "+i.getType());
			}
		}
	}
	
	public boolean buyItem(Item item, int amount,double price){
		addItemToInventory(item,amount);
		money-=price;
		return true;
	}
	
	public boolean addItemToInventory(Item item, int amount){
		for(int i=0; i<inventory.size(); i++){
			if(inventory.get(i).getName()==item.getName() && inventory.get(i).getType()==item.getType()){
				//There is the same type of item already in the inventory
				inventory.get(i).addAmount(amount);
				return true;
			}
		}
		//If the player never has this type of item
		item.setAmount(amount);
		inventory.add(item);
		return true;
	}
	
	public boolean useItem(int index) {
		return true;
	}

	public boolean discardItem(int index) {
		return true;
	}
	
	public boolean useSeed(String name){
		for(int i=0; i<inventory.size(); i++){
			if(inventory.get(i).getName()==name){
				if(inventory.get(i).getAmount()>0){
					inventory.get(i).use();
					if(inventory.get(i).getAmount()==0){
						inventory.remove(i);
					}
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean harvestPlant(GardenBed gardenBed){
		boolean harvestSomething = false;
		for(int i=0; i<gardenBed.size(); i++){
			if(gardenBed.getPlant(i)!=null){
				Fruit f = gardenBed.getPlant(i).isHarvested();
				if(f!=null){
					addItemToInventory(f,f.getAmount());
					System.out.println("You got "+f.getAmount()+" of "+f.getName());
					harvestSomething = true;
				}
			}
		}
		if(!harvestSomething){
			System.out.println("You have nothing to harvest.");
		}
		return true;
	}
}