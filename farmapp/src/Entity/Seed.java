package Entity;

import model.Item;

public class Seed implements Item{
	protected String name;
	protected double price;
	protected Plant plant;
	int amount;
	
	public Seed(String name){}
	
	String type = "seed";

	public String getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public void use() {
		// TODO Auto-generated method stub
		
	}

	public void discard() {
		// TODO Auto-generated method stub
		
	}

	/*public void use() {
		String index;
		do {
			System.out.println("Please select planting spot");
			index = main.scan.next();
			Player.isInteger(index);
		} while (Player.isInteger(index) == false);
		int index2 = Integer.parseInt(index);
		index2--;
		Prompter.gardenBed.plantingSpot[index2] = plant;
		amount--;
		if (amount == 0) {
			discard();
		}
		System.out.println(this.name + " planted");
	}

	public void discard() {
		int count = 0;
		for (Item i : Prompter.player.inventory) {
			if (i.getName().equals(this.name)) {
				break;
			}
			count++;
		}
		Prompter.player.inventory.remove(count);
	}*/
}
