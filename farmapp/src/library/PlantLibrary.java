package library;

import java.util.ArrayList;

import Entity.Plant;


public class PlantLibrary {
	private ArrayList<Plant> plants = new ArrayList<Plant>();
	//Plant(name,health,water,sprout,maturity,lifeSpan)
	
	public PlantLibrary(){
		plants.add(new Plant("Morning Wood",3,2,1,2,5));
	}
	
	public Plant getPlant(String name){
		for(int i=0; i<plants.size(); i++){
			if(plants.get(i).getName()== name){
				return plants.get(i);
			}
		}
		return null;
	}
}
