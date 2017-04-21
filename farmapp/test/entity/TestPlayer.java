package entity;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import model.Item;

public class TestPlayer {
	
	@Test
	public void TestGetSeeds(){
		//create seed arraylist
		ArrayList<Item> seeds = new ArrayList<Item>();
		Seed seed = new Seed("Morning Wood");
		seeds.add(seed);
		seed = new Seed("Orange");
		seeds.add(seed);
		//create mock player
		Player player = new Player();
		player.inventory = seeds;
		ArrayList<Item> inventory = player.getSeeds();
		assertEquals(seeds.get(0),inventory.get(0));
		assertEquals(seeds.get(1),inventory.get(1));
		
	}
}
