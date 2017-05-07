package entity;

import java.util.ArrayList;


import library.SeedLibrary;
import main.Input;
import model.Item;

public class Shop {
	private ArrayList<Seed> itemList = new ArrayList<Seed>();
	
	public Shop(){
		itemList.add(SeedLibrary.getSeed("Morning Wood"));
		itemList.add(SeedLibrary.getSeed("Orange"));
	}
	
	public void visitShop(Player player){
		int input = 0;
		while(input!=4){
			System.out.println("(1)	View ItemList");
			System.out.println("(2)	Buy Item");
			System.out.println("(3)	Sell Item");
			System.out.println("(4)	Leave Shop");
			input = Input.getIntMax("", "Wrong input, try again",4);
			if(input==1){
				showItemList();
			}else if(input==2){
				buyItem(player);
			}
		}
	}
	
	public void showItemList(){
		System.out.println(itemList.size());
		for(int i=0; i<itemList.size(); i++){
			//System.out.print("index"+i);
//			System.out.println("size"+itemList.size());
			System.out.println("#"+(i+1)+" "+itemList.get(i).getName()+"\t\t"+itemList.get(i).getPrice());
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
