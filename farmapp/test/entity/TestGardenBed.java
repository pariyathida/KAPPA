package entity;

import static org.junit.Assert.*;

import org.junit.Test;

import entity.GardenBed;
import entity.Plant;
import library.PlantLibrary;

public class TestGardenBed {

	@Test
	public void plantTest() {
		Plant plant1 = new Plant("Orange",3,2,1,2,5);
		Plant plant2 = new Plant("Morning Wood",3,2,1,2,5);
		GardenBed gardenBed = new GardenBed();
		gardenBed.plant(plant1);
		assertEquals("Orange", gardenBed.getPlant(0).getName());
		gardenBed.plant(plant2);
		assertEquals("Morning Wood", gardenBed.getPlant(1).getName());
		gardenBed.plant(plant1);
		gardenBed.plant(plant1);
		gardenBed.plant(plant1);
		gardenBed.plant(plant1);
		gardenBed.plant(plant1);
		gardenBed.plant(plant1);
		gardenBed.plant(plant1);
		assertEquals(false, gardenBed.plant(plant1));
	}
	
	@Test
	public void getPlantTest() {
		Plant plant = new Plant("Orange",3,2,1,2,5);
		GardenBed gardenBed = new GardenBed();
		gardenBed.plant(plant);
		assertEquals("Orange", gardenBed.getPlant(0).getName());
	}
	
	@Test
	public void increaseDayTest(){
		Plant plant = new Plant("Orange",3,2,1,2,5);
		plant.setFruit(new Fruit("Orange",60));
		GardenBed gardenBed = new GardenBed();
		gardenBed.plant(plant);
		assertEquals(0, gardenBed.getPlant(0).getAge());
		gardenBed.increaseDay();
		assertEquals(1, gardenBed.getPlant(0).getAge());
		gardenBed.increaseDay();
		gardenBed.increaseDay();
		gardenBed.increaseDay();
		gardenBed.increaseDay();
		gardenBed.increaseDay();
		assertEquals(null, gardenBed.getPlant(0));
	}
	
	@Test
	public void TestWater(){
		Plant plant = new Plant("Orange",3,2,1,2,5);
		GardenBed gardenBed = new GardenBed();
		gardenBed.plant(plant);
		gardenBed.water(0);
	}
	
	@Test
	public void TestWaterAll(){
		Plant plant = new Plant("Orange",3,2,1,2,5);
		GardenBed gardenBed = new GardenBed();
		gardenBed.plant(plant);
		gardenBed.waterAll();
	}
}
