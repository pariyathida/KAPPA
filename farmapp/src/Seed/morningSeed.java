package Seed;

import Entity.Item;
import Entity.Seed;
import Plant.morningWood;

public class morningSeed extends Seed implements Item{
	public morningSeed(){
		name = "morning seed";
		price = 50.0;
		plant = new morningWood();
	}
}
