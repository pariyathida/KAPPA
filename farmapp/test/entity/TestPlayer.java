package entity;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import library.SeedLibrary;
import model.Item;

public class TestPlayer {
	
	@Test
	public void TestGetName(){
		Player player = new Player("Test",500);
		assertEquals("Test", player.getName());
	}
	
	@Test
	public void TestGetMoney(){
		Player player = new Player("Test",500);
		assertEquals(500, player.getMoney(),0);
	}
	
	@Test
	public void TestGetInventory(){
		Player player = new Player("Test",500);
		player.addItemToInventory(new Seed("Morning Wood",80), 1);
		assertEquals("Morning Wood", player.getInventory().get(0).getName());
	}
	
	@Test
	public void TestGetSeeds(){
		Player player = new Player("Test",500);
		player.addItemToInventory(new Seed("Morning Wood",80), 1);
		player.addItemToInventory(new Seed("Orange",60), 1);
		assertEquals("Morning Wood", player.getSeeds().get(0).getName());
		assertEquals(1, player.getSeeds().get(0).getAmount());
		assertEquals("Orange", player.getSeeds().get(1).getName());
		assertEquals(1, player.getSeeds().get(1).getAmount());
	}
	
	@Test
	public void TestBuyItem(){
		Player player = new Player("Test",500);
		player.buyItem(new Seed("Orange",60), 1, 50);
		assertEquals("Orange", player.getInventory().get(0).getName());
	}
	
	@Test
	public void TestAddItemToInventory(){
		Player player = new Player("Test",500);
		player.addItemToInventory(new Seed("Morning Wood",80), 1);
		assertEquals("Morning Wood", player.getSeeds().get(0).getName());
		assertEquals(1, player.getSeeds().get(0).getAmount());
		player.addItemToInventory(new Seed("Morning Wood",80), 1);
		assertEquals("Morning Wood", player.getSeeds().get(0).getName());
		assertEquals(2, player.getSeeds().get(0).getAmount());
	}
	
	@Test
	public void TestUseSeed(){
		Player player = new Player("Test",500);
		player.addItemToInventory(new Seed("Morning Wood",80), 1);
		assertEquals(true, player.useSeed("Morning Wood"));
		assertEquals(false, player.useSeed("Orange"));
	}
	
	@Test
	public void TestHarvestPlant(){
		Player player = new Player("Test",500);
		Plant plant1 = new Plant("Orange",3,2,1,2,5);
		plant1.setFruit(new Fruit("Orange",60));
		Plant plant2 = new Plant("Morning Wood",3,2,1,2,5);
		plant2.setFruit(new Fruit("Morning Wood",50));
		GardenBed gardenBed = new GardenBed();
		gardenBed.plant(plant1);
		gardenBed.plant(plant2);
		gardenBed.increaseDay();
		gardenBed.increaseDay();
		gardenBed.increaseDay();
		player.harvestPlant(gardenBed);
		assertEquals("Orange", player.getInventory().get(0).getName());
		player.harvestPlant(gardenBed);
		assertEquals("Orange", player.getInventory().get(0).getName());
	}
}
