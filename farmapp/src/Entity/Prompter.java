package Entity;

import java.util.ArrayList;


public class Prompter {
	public static int dayCount = 0;
	public static Player player;
	public static GardenBed gardenBed;
	public static Shop shop;
	

	public Prompter() {
		player = new Player();
		gardenBed = new GardenBed();
		shop = new Shop();
		shop.buy(1, 1);
	}

	public void Prompt() {
		char input;
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
			input = main.scan.next().charAt(0);
			if (input == '1') {
				for (int i = 0; i < gardenBed.plantingSpot.length; i++) {
					if (gardenBed.plantingSpot[i] == null) {
						System.out.println("#" + (i + 1) + " : empty");
					} else {
						System.out.println("#" + (i + 1) + " : " + gardenBed.plantingSpot[i].name + " tree");
						System.out.print("\tAge : " + gardenBed.plantingSpot[i].state + " ("
								+ gardenBed.plantingSpot[i].age + "/" + gardenBed.plantingSpot[i].lifeSpan + " Days)");
						System.out.println();
						System.out.print("\tHealth : ");
						for (int j = 0; j < gardenBed.plantingSpot[i].healthGauge; j++) {
							System.out.print("<3 ");
						}
						System.out.println("(" + gardenBed.plantingSpot[i].healthGauge + "/"
								+ gardenBed.plantingSpot[i].health + ")");
						System.out.print("\tWater : ");
						for (int j = 0; j < gardenBed.plantingSpot[i].waterGauge; j++) {
							System.out.print("<3 ");
						}
						System.out.println("(" + gardenBed.plantingSpot[i].waterGauge + "/"
								+ gardenBed.plantingSpot[i].water + ")");
						System.out.print("\tFruit :");
						if (gardenBed.plantingSpot[i].product.isEmpty()) {
							System.out.println("empty");
						} else {
							for (Fruit f : gardenBed.plantingSpot[i].product) {
								System.out.print(" " + f.amount + " " + f.name);
							}
						}
						System.out.println();
					}
				}
			} else if (input == '2') {
				ArrayList<Item> seed = new ArrayList<>();
				for (Item i : player.inventory) {
					if (i.getType() == "seed") {
						seed.add(i);
					}
				}
				if (seed.isEmpty()) {
					System.out.println("Seed is required");
				} else {
					System.out.println("Displaying Seeds in your inventory. Select a seed to plant");
					int count = 0;
					for (Item i : seed) {
						count++;
						System.out.println("#" + count + " : " + i.getName());
					}
					input = main.scan.next().charAt(0);
					int inputInteger = Character.getNumericValue(input);
					seed.get(inputInteger - 1).use();
				}

			} else if (input == '3') {

			} else if (input == '4') {

			} else if (input == '5') {

			} else if (input == '6') {

			} else if (input == '7') {
				boolean checkGardenEmpty = true;
				System.out.println("Goodnight");
				for (Plant p : gardenBed.plantingSpot) {
					if (p != null) {
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
