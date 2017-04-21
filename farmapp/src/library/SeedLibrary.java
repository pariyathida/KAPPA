package library;

import java.util.ArrayList;

import Entity.Seed;

public class SeedLibrary {
	private ArrayList<Seed> seeds = new ArrayList<Seed>();
	//Plant(name,health,water,sprout,maturity,lifeSpan)
	
	public SeedLibrary(){
		seeds.add(new Seed("Morning Wood"));
	}
	
	public Seed getSeed(String name){
		for(int i=0; i<seeds.size(); i++){
			if(seeds.get(i).getName()== name){
				Seed seed = seeds.get(i);
				System.out.println(seed.getName());
				return seed;
			}
		}
		return null;
	}
}
