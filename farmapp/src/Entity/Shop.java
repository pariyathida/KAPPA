package Entity;

import java.util.ArrayList;

import Seed.morningSeed;
import main.Prompter;
import model.Item;

public class Shop {
	private ArrayList<Item> itemList = new ArrayList<Item>();
	public Shop(){
		reStock();
	}
	public void sell(int index, int amount){
		
	}
	public void buy(int index, int amount){
		index--;
		boolean exist = false;
		String itemName;
		itemName = itemList.get(index).getName();
		for(Item i : Prompter.player.inventory){
			if(i.getName().equals(itemName)){
				exist = true;
				break;
			}
		}
		if(exist){
			for(Item i : Prompter.player.inventory){
				if(i.getName().equals(itemName)){
					i.setAmount(i.getAmount()+amount);
					break;
				}
			}
		}else{
			Item i = itemList.get(index);
			i.setAmount(amount);
			Prompter.player.inventory.add(i);
		}
	}
	public void reStock(){
		itemList.clear();
		
	}
}
