<<<<<<< HEAD
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
			}else if(input==3){
				player.sellItem();
			}
		}
	}
	
	public void showItemList(){
		for(int i=0; i<itemList.size(); i++){
			System.out.println("#"+(i+1)+" "+itemList.get(i).getName()+"\t\t"+itemList.get(i).getPrice());
		}

	}
	
	public boolean buyItem(Player player){
		showItemList();
		int index = Input.getInt("Which item you want to buy?","Please enter a number");
		Item item = itemList.get(index-1);
		int amount = Input.getAmount("How many items do you want?", "Please enter a number", "The number can't be negative");
		double price = item.getPrice()*amount;
		if(player.getMoney()>=price){
			player.buyItem(item, amount, price);
			System.out.println("Buying Success");
			System.out.println(player.getName()+", you have "+player.getMoney()+"$ left.");
			return true;
		}else{
			System.out.println("Buying Failed, not enough money");
			return false;
		}
	}
	
	public void reStock(){
		itemList.clear();
	}
=======
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
			}else if(input==3){
				player.sellItem();
			}
		}
	}
	
	public void showItemList(){
		for(int i=0; i<itemList.size(); i++){
			System.out.println("#"+(i+1)+" "+itemList.get(i).getName()+"\t\t"+itemList.get(i).getPrice());
		}

	}
	
	public boolean buyItem(Player player){
		showItemList();
		int index = Input.getInt("Which item you want to buy?","Please enter a number");
		Item item = itemList.get(index-1);
		int amount = Input.getAmount("How many items do you want?", "Please enter a number", "The number can't be negative");
		double price = item.getPrice()*amount;
		if(player.getMoney()>=price){
			player.buyItem(item, amount, price);
			System.out.println("Buying Success");
			System.out.println(player.getName()+", you have "+player.getMoney()+"$ left.");
			return true;
		}else{
			System.out.println("Buying Failed, not enough money");
			return false;
		}
	}
	
	public void reStock(){
		itemList.clear();
		
	}
>>>>>>> origin/master
}