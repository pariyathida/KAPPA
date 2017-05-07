package library;

import java.util.ArrayList;

import entity.Seed;

public class SeedLibrary {
	private static ArrayList<Seed> seeds = new ArrayList<Seed>();
	//Plant(name,health,water,sprout,maturity,lifeSpan)
	
	public SeedLibrary(){
		seeds.add(new Seed("Morning Wood",30));
	}
	
	public static Seed getSeed(String name){
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
