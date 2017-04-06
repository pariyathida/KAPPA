package Entity;

public class Seed {
	protected String name;
	protected double price;
	protected Plant plant;
	int amount;
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
	public void use(){
		System.out.println("Please select planting spot");
		int index = main.scan.nextInt();
		index--;
		Prompter.gardenBed.plantingSpot[index] = plant;
		amount--;
		if(amount==0){
			discard();
		}
		System.out.println(this.name+" planted");
	}
	public void discard(){
		int count=0;
		for(Item i : Prompter.player.inventory){
			if(i.getName().equals(this.name)){
				break;
			}
			count++;
		}
		Prompter.player.inventory.remove(count);
	}
}
