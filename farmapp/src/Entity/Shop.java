package entity;

import java.util.ArrayList;


import library.SeedLibrary;
import main.Input;
import main.Prompter;
import main.main;
import model.Item;

public class Shop {
	private ArrayList<Item> itemList = new ArrayList<Item>();
	SeedLibrary seedLibrary = new SeedLibrary();
	
	public Shop(){
		itemList.add(seedLibrary.getSeed("Morning Wood"));
	}
	
	public void visitShop(Player player){
		int input = 0;
		while(input!=4){
			System.out.println("(1)	View ItemList");
			System.out.println("(2)	Buy Item");
			System.out.println("(3)	Sell Item");
			System.out.println("(4)	Leave Shop");
			input = Input.getInt("", "Wrong input, try again");
			if(input==1){
				showItemList();
			}else if(input==2){
				buyItem(player);
			}
		}
	}
	
	public void showItemList(){
		//System.out.println(itemList.size());
		for(int i=0; i<itemList.size(); i++){
//			System.out.println("index"+i);
//			System.out.println("size"+itemList.size());
			Item item= itemList.get(i);
			System.out.println(item.getName());
		}

	}

	
	public void sell(int index, int amount){
		
	}
	
	public boolean buyItem(Player player){
		showItemList();
		System.out.println();
		int index = Input.getInt("Which item you want to buy?","Please enter a number");
		Item item = itemList.get(index-1);
		int amount = Input.getAmount("How many items do you want?", "Please enter a number", "The number can't be negative");
		if(player.addItemToInventory(item, amount)){
			System.out.println("Buying Success");
			return true;
		}else{
			System.out.println("Buying Failed");
			return false;
		}
	}
	
	public void reStock(){
		itemList.clear();
		
	}
}
