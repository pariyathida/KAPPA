package entity;

import static org.junit.Assert.*;

import org.junit.Test;

import entity.Plant;

public class TestPlant {

	@Test
	public void testIncreaseAge() {
		
		Plant plant = new Plant("Morning Wood",3,2,1,2,5);
		
		assertEquals(0,plant.getAge());
		assertEquals(3,plant.getHealthGauge());
		assertEquals(2,plant.getWaterGauge());
		assertEquals("seedling",plant.getState());
		plant.increaseAge();
		
		assertEquals(1,plant.getAge());
		assertEquals(3,plant.getHealthGauge());
		assertEquals(1,plant.getWaterGauge());
		assertEquals("seedling",plant.getState());
		plant.increaseAge();
		
		assertEquals(2,plant.getAge());
		assertEquals(2,plant.getHealthGauge());
		assertEquals(0,plant.getWaterGauge());
		assertEquals("sprout",plant.getState());
		plant.increaseAge();
		
		assertEquals(3,plant.getAge());
		assertEquals(1,plant.getHealthGauge());
		assertEquals(0,plant.getWaterGauge());
		assertEquals("mature",plant.getState());
		plant.increaseAge();
		
		assertEquals(4,plant.getAge());
		assertEquals(0,plant.getHealthGauge());
		assertEquals(0,plant.getWaterGauge());
		assertEquals("dead",plant.getState());
		plant.increaseAge();
		
	}
}