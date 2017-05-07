package entity;

import static org.junit.Assert.*;

import org.junit.Test;

import entity.GardenBed;
import entity.Plant;
import library.PlantLibrary;

public class GardenBedTest {

	@Test
<<<<<<< HEAD
	public void increaseDay(){
	
	}
		
=======
	public void plantTest() {
		Plant plant1 = PlantLibrary.getPlant("Orange");
		Plant plant2 = PlantLibrary.getPlant("Morning Wood");
		GardenBed gardenBed = new GardenBed();
		gardenBed.plant(plant1);
		assertEquals("Orange", gardenBed.getPlant(0).getName());
		gardenBed.plant(plant2);
		assertEquals("Morning Wood", gardenBed.getPlant(1).getName());
	}
>>>>>>> origin/master

	@Test
<<<<<<< HEAD
	public void plant(){
		 Plant p = new Plant("Morning Wood",3,2,1,2,5);
		GardenBed g = new GardenBed();
		
		g.plant(p,9);
		assertEquals(p,g.plantingSpot[9]);
		
		}
	
	
	

	
	
	
	
	
	
	
=======
	public void getPlantTest() {
		Plant plant = PlantLibrary.getPlant("Orange");
		GardenBed gardenBed = new GardenBed();
		gardenBed.plant(plant);
		assertEquals("Orange", gardenBed.getPlant(0).getName());
	}
>>>>>>> origin/master
	
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
