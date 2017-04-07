package Entity;

import java.util.ArrayList;
import java.util.InputMismatchException;

import Seed.morningSeed;

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
