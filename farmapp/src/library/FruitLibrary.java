<<<<<<< HEAD
package library;

import java.util.ArrayList;

import entity.Fruit;
import entity.Plant;

public class FruitLibrary {
	private static ArrayList<Fruit> fruits = new ArrayList<Fruit>();
	//Plant(name,health,water,sprout,maturity,lifeSpan)
	
	public FruitLibrary(){
		fruits.add(new Fruit("Morning Wood",50));
		fruits.add(new Fruit("Orange",30));
	}
	
	public static Fruit getFruit(String name){
		for(int i=0; i<fruits.size(); i++){
			Fruit f = fruits.get(i);
			if(f.getName()== name){
				return new Fruit(f.getName(),f.getPrice());
			}
		}
		return null;
	}
}
=======
package library;

import java.util.ArrayList;

import entity.Fruit;
import entity.Plant;

public class FruitLibrary {
	private static ArrayList<Fruit> fruits = new ArrayList<Fruit>();
	//Plant(name,health,water,sprout,maturity,lifeSpan)
	
	public FruitLibrary(){
		fruits.add(new Fruit("Morning Wood",50));
		fruits.add(new Fruit("Orange",30));
	}
	
	public static Fruit getFruit(String name){
		for(int i=0; i<fruits.size(); i++){
			Fruit f = fruits.get(i);
			if(f.getName()== name){
				return new Fruit(f.getName(),f.getPrice());
			}
		}
		return null;
	}
}
>>>>>>> origin/master
