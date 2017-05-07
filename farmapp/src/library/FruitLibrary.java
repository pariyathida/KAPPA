package library;

import java.util.ArrayList;

import entity.Fruit;
import entity.Plant;

public class FruitLibrary {
	private static ArrayList<Fruit> fruits = new ArrayList<Fruit>();
	//Plant(name,health,water,sprout,maturity,lifeSpan)
	
	public FruitLibrary(){
		fruits.add(new Fruit("Morning Wood",50));
	}
	
	public static Fruit getFruit(String name){
		for(int i=0; i<fruits.size(); i++){
			if(fruits.get(i).getName()== name){
				return fruits.get(i);
			}
		}
		return null;
	}
}
