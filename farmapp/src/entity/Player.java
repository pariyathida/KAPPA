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
	
	public String getName(){
		return name;
	}
	
	public double getMoney(){
		return money;
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
		int count = 0;
		for (Item i : inventory) {
			count++;
			System.out.println("#" + count + " : "+ i.getAmount() + " of " + i.getName()+" "+i.getType());
		}
	}
	
	public boolean addItemToInventory(Item item, int amount){
		for(int i=0; i<inventory.size(); i++){
			if(inventory.get(i).getName()==item.getName()){
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
				inventory.get(i).use();
				return true;
			}
		}
		return false;
	}
	
	public boolean harvestPlant(GardenBed gardenBed){
		for(int i=0; i<gardenBed.size(); i++){
			if(gardenBed.getPlant(i)!=null){
				Fruit f = gardenBed.getPlant(i).isHarvested();
				if(f!=null){
					addItemToInventory(f,f.getAmount());
				}
			}
		}
		return true;
	}
}
