package entity;

import static org.junit.Assert.*;

import org.junit.Test;

import entity.GardenBed;
import entity.Plant;



public class GardenBedTest {

	@Test
	public void increaseDay(){
	
	}
		
	public void plant(Plant plant, int index){
		plantingSpot[index] = plant;
	}

	
	
	@Test
	public void plant(){
		 Plant p = new Plant("Morning Wood",3,2,1,2,5);
		GardenBed g = new GardenBed();
		
		g.plant(p,9);
		assertEquals(p,g.plantingSpot[9]);
		
		}
	
	
	
	
		
	public Plant getPlant(int index){
			return plantingSpot[index];
		}
		
	
	
	
	
	
	
	
	
}
