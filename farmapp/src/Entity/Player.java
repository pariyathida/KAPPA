package Entity;

import java.util.ArrayList;

import Seed.morningSeed;

public class Player {
	String name;
	double money;
	ArrayList<Item> inventory = new ArrayList<>();
	public Player(){
		System.out.println("Welcome. Please enter your name");
		String name = main.scan.next();
		System.out.println("Please enter starting money");
		double money = main.scan.nextDouble();
		this.name = name;
		this.money = money;
	}
	public boolean useItem(int index){
		return true;
	}
	public boolean discardItem(int index){
		return true;
	}
}
