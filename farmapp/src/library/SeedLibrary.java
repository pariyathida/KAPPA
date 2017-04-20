package library;

import java.util.ArrayList;

import Entity.Seed;

public class SeedLibrary {
	private ArrayList<Seed> seeds = new ArrayList<Seed>();
	//Plant(name,health,water,sprout,maturity,lifeSpan)
	
	public SeedLibrary(){
		seeds.add(new Seed("Morning Wood"));
	}
	
	public Seed getPlant(String name){
		for(int i=0; i<seeds.size(); i++){
			if(seeds.get(i).getName()== name){
				return seeds.get(i);
			}
		}
		return null;
	}
}
