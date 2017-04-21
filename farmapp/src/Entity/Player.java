package Entity;

import java.util.ArrayList;
import java.util.InputMismatchException;

import Seed.morningSeed;
import main.main;
import model.Item;

public class Player {
	String name;
	String money;
	ArrayList<Item> inventory = new ArrayList<Item>();

	public Player() {
		System.out.println("Welcome. Please enter your name");
		name = main.scan.next();
		do {
			System.out.println("Please enter starting money");
			money = main.scan.next();
			if (isNumeric(money) == true) {
				this.name = name;
				this.money = money;
			} else {
				System.out.println("Please input number");
			}
		} while (isNumeric(money) == false);
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
	
	public boolean addItemToInventory(Item item, int amount){
		boolean notAdded = true;
		for(int i=0; i<inventory.size(); i++){
			if(inventory.get(i).getName()==item.getName()){
				//There is the same type of item already in the inventory
				inventory.get(i).addAmount(amount);
				notAdded = false;
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

	public static boolean isNumeric(String str) {
		try {
			double d = Double.parseDouble(str);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}
	
	public static boolean isInteger(String str) {
		try {
			int d = Integer.parseInt(str);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}
}
