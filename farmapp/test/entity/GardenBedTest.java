package entity;

import static org.junit.Assert.*;

import org.junit.Test;

import entity.GardenBed;
import entity.Plant;
import library.PlantLibrary;

public class GardenBedTest {

	@Test
	public void plantTest() {
		Plant plant1 = PlantLibrary.getPlant("Orange");
		Plant plant2 = PlantLibrary.getPlant("Morning Wood");
		GardenBed gardenBed = new GardenBed();
		gardenBed.plant(plant1);
		assertEquals("Orange", gardenBed.getPlant(0).getName());
		gardenBed.plant(plant2);
		assertEquals("Morning Wood", gardenBed.getPlant(1).getName());
	}
	
	@Test
	public void getPlantTest() {
		Plant plant = PlantLibrary.getPlant("Orange");
		GardenBed gardenBed = new GardenBed();
		gardenBed.plant(plant);
		assertEquals("Orange", gardenBed.getPlant(0).getName());
	}
	
	@Test
	public void increaseDayTest(){
		Plant plant = PlantLibrary.getPlant("Orange");
		GardenBed gardenBed = new GardenBed();
		gardenBed.plant(plant);
		assertEquals(0, gardenBed.getPlant(0).getAge());
		gardenBed.increaseDay();
		assertEquals(1, gardenBed.getPlant(0).getAge());
	}
}
