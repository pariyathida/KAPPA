package library;

import java.util.ArrayList;

import entity.Seed;

public class SeedLibrary {
	private static ArrayList<Seed> seeds = new ArrayList<Seed>();
	//Plant(name,health,water,sprout,maturity,lifeSpan)
	
	public SeedLibrary(){
		seeds.add(new Seed("Morning Wood",30));
		seeds.add(new Seed("Orange",20));
	}
	
	public static Seed getSeed(String name){
		//System.out.println(seeds.size());
		for(int i=0; i<seeds.size(); i++){
			if(seeds.get(i).getName().equals(name)){
				Seed seed = seeds.get(i);
				//System.out.println(seed.getName());
				return seed;
			}
		}
		System.out.println("cannot get seed from library");
		return null;
	}
}
