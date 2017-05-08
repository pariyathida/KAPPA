package library;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import entity.Plant;

public class TestPlantLibrary {
	
	@Test
	public void testGetPlant(){
		Plant plant = new Plant("Morning Wood",3,2,1,2,5);
		PlantLibrary plantLibrary = new PlantLibrary();
		assertEquals(plant.getName(),plantLibrary.getPlant("Morning Wood").getName());
		assertEquals(null,plantLibrary.getPlant("Weed"));
	}

}
