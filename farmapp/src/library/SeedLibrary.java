<<<<<<< HEAD
package library;

import java.util.ArrayList;

import entity.Seed;

public class SeedLibrary {
	private static ArrayList<Seed> seeds = new ArrayList<Seed>();
	//Plant(name,health,water,sprout,maturity,lifeSpan)
	
	public SeedLibrary(){
		seeds.add(new Seed("Morning Wood",80));
		seeds.add(new Seed("Orange",60));
	}
	
	public static Seed getSeed(String name){
		//System.out.println(seeds.size());
		for(int i=0; i<seeds.size(); i++){
			Seed s = seeds.get(i);
			if(s.getName().equals(name)){
				//System.out.println(seed.getName());
				return new Seed(s.getName(),s.getPrice());
			}
		}
		System.out.println("cannot get seed from library");
		return null;
	}
}
=======
package library;

import java.util.ArrayList;

import entity.Seed;

public class SeedLibrary {
	private static ArrayList<Seed> seeds = new ArrayList<Seed>();
	//Plant(name,health,water,sprout,maturity,lifeSpan)
	
	public SeedLibrary(){
		seeds.add(new Seed("Morning Wood",80));
		seeds.add(new Seed("Orange",60));
	}
	
	public static Seed getSeed(String name){
		//System.out.println(seeds.size());
		for(int i=0; i<seeds.size(); i++){
			Seed s = seeds.get(i);
			if(s.getName().equals(name)){
				//System.out.println(seed.getName());
				return new Seed(s.getName(),s.getPrice());
			}
		}
		System.out.println("cannot get seed from library");
		return null;
	}
}
>>>>>>> origin/master
