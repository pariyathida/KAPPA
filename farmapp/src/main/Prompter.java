package main;

import java.util.ArrayList;

import entity.Fruit;
import entity.GardenBed;
import entity.Plant;
import entity.Player;
import entity.Seed;
import entity.Shop;
import library.FruitLibrary;
import library.PlantLibrary;
import library.SeedLibrary;
import model.Item;


public class Prompter {
	public static int dayCount = 0;
	public static Player player;
	public static GardenBed gardenBed;
	public static Shop shop;
	
	

	public Prompter() {
		new SeedLibrary();
		new PlantLibrary();
		new FruitLibrary();
		player = new Player();
		gardenBed = new GardenBed();
		shop = new Shop();
	}

	public void Prompt() {
		int input;
		boolean greet = true;
		while (true) {
			if (dayCount == 0 && greet) {
				System.out.println("Welcome to the gardening game! Please choose an action");
			} else {
				System.out.println("Please choose an action");
			}
			System.out.println("(1)	View Plants");
			System.out.println("(2)	Plant Seed");
			System.out.println("(3)	Water Plant");
			System.out.println("(4)	Harvest Plant");
			System.out.println("(5)	View Inventory");
			System.out.println("(6)	Visit Shop");
			System.out.println("(7)	Sleep 1 Day");
			
			input = Input.getIntMax("","Wrong input, try again",7);
			
			
			if (input == 1) {
				
				for (int i = 0; i < gardenBed.size(); i++) {
					Plant p = gardenBed.getPlant(i);
					if (p == null) {
						System.out.println("#" + (i + 1) + " : empty");
					} else {
						System.out.println("#" + (i + 1) + " : " + p.getName() + " tree");
						p.getInfo();
					}
				}
			} else if (input == 2) {
				ArrayList<Item> seeds = player.getSeeds();
				if (seeds.isEmpty()) {
					System.out.println("Seed is required");
				} else {
					System.out.println("Displaying Seeds in your inventory. Select a seed to plant");
					int count = 0;
					for (Item i : seeds) {
						count++;
						System.out.println("#" + count + " : "+ i.getAmount() + " of " + i.getName());
					}
					int inputInteger = Input.getIntMax("","",seeds.size());
					//plant into garden bed
					String seedName = seeds.get(inputInteger-1).getName();
					Plant p = PlantLibrary.getPlant(seedName);
					if(gardenBed.plant(p)){
						System.out.println("Planting Success!");
						player.useSeed(seedName);
					}else{
						System.out.println("Gardenbed is full.");
					}
					
				}

			} else if (input == 3) {
				System.out.println("Select plant to water");
				for (int i = 0; i < gardenBed.size(); i++) {
					Plant p = gardenBed.getPlant(i);
					if (p == null) {
						System.out.println("#" + (i + 1) + " : empty");
					} else {
						System.out.println("#" + (i + 1) + " : " + p.getName() + " tree");
						p.getInfo();
					}
				}
				int inputInteger = Input.getIntMax("","",gardenBed.size());
				if(gardenBed.getPlant(inputInteger-1)==null){
					System.out.println("No plant to water.");
				}else{
					gardenBed.getPlant(inputInteger-1).isWatered();
				}
				

			} else if (input == 4) {
				
			} else if (input == 5) {
				player.showInventory();
			} else if (input == 6) {
				System.out.println("visit shop");
				shop.visitShop(player);
			} else if (input == 7) {
				boolean checkGardenEmpty = true;
				System.out.println("Goodnight");
				for (int i=0; i<gardenBed.size(); i++) {
					if (gardenBed.getPlant(i)!=null) {
						checkGardenEmpty = false;
					}
				}
				if (!checkGardenEmpty) {
					System.out.println("Good morning your plants have aged 1 day!");
					gardenBed.increaseDay();
				} else {
					System.out.println("Good morning");
				}
			}
			greet = false;
		}
	}
}
