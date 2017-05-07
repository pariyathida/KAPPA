package library;

import java.util.ArrayList;

import entity.Plant;
import entity.Seed;

public class PlantLibrary {
	private static ArrayList<Plant> plants = new ArrayList<Plant>();
	//Plant(name,health,water,sprout,maturity,lifeSpan)
	
	public PlantLibrary(){
		plants.add(new Plant("Morning Wood",3,2,1,2,5));
		plants.add(new Plant("Orange",3,2,1,2,5));
	}
	
	public static Plant getPlant(String name){
		for(int i=0; i<plants.size(); i++){
			Plant p = plants.get(i);
			if(p.getName()== name){
				return new Plant(p.getName(),p.getHealth(),p.getWater(),p.getSprout(),p.getMaturity(),p.getLifeSpan());
			}
		}
		return null;
	}
}
