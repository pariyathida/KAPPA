package entity;

import static org.junit.Assert.*;

import org.junit.Test;

import entity.Plant;

public class TestPlant {

	@Test
	public void TestGetState() {
		Plant plant = new Plant("Morning Wood",3,2,1,2,5);
		assertEquals("seedling", plant.getState());
	}
	
	@Test
	public void TestGetName(){
		Plant plant = new Plant("Morning Wood",3,2,1,2,5);
		assertEquals("Morning Wood", plant.getName());
	}
	
	@Test
	public void TestGetAge(){
		Plant plant = new Plant("Morning Wood",3,2,1,2,5);
		assertEquals(0, plant.getAge());
	}
	
	@Test
	public void TestGetHealth(){
		Plant plant = new Plant("Morning Wood",3,2,1,2,5);
		assertEquals(3, plant.getHealth());
	}
	
	@Test
	public void TestGetHealthGauge(){
		Plant plant = new Plant("Morning Wood",3,2,1,2,5);
		assertEquals(3, plant.getHealthGauge());
	}
	
	@Test
	public void TestGetWater(){
		Plant plant = new Plant("Morning Wood",3,2,1,2,5);
		assertEquals(2, plant.getWater());
	}
	
	@Test
	public void TestGetWaterGauge(){
		Plant plant = new Plant("Morning Wood",3,2,1,2,5);
		assertEquals(2, plant.getWater());
	}
	
	@Test
	public void TestGetSprout(){
		Plant plant = new Plant("Morning Wood",3,2,1,2,5);
		assertEquals(1, plant.getSprout());
	}
	
	@Test
	public void TestGetMaturity(){
		Plant plant = new Plant("Morning Wood",3,2,1,2,5);
		assertEquals(2, plant.getMaturity());
	}
	
	@Test
	public void TestGetLifeSpan(){
		Plant plant = new Plant("Morning Wood",3,2,1,2,5);
		assertEquals(5, plant.getLifeSpan());
	}
	
	@Test
	public void TestGetFruit(){
		Plant plant = new Plant("Morning Wood",3,2,1,2,5);
		plant.setFruit(new Fruit("Morning Wood",50));
		assertEquals("Morning Wood", plant.getFruit().getName());
	}
	
	@Test
	public void TestSetFruit(){
		Plant plant = new Plant("Morning Wood",3,2,1,2,5);
		plant.setFruit(new Fruit("Morning Wood",50));
		assertEquals("Morning Wood", plant.getFruit().getName());
	}
	
	@Test
	public void TestIncreaseWaterGauge(){
		Plant plant = new Plant("Morning Wood",3,2,1,2,5);
		plant.increaseAge();
		assertEquals(1,plant.getWaterGauge());
		plant.isWatered();
		assertEquals(2,plant.getWaterGauge());
	}
	
	@Test
	public void TestDecreaseWaterGauge(){
		Plant plant = new Plant("Morning Wood",3,2,1,2,5);
		assertEquals(2,plant.getWaterGauge());
		plant.increaseAge();
		assertEquals(1,plant.getWaterGauge());
	}
	
	@Test
	public void TestIncreaseHealthGauge(){
		Plant plant = new Plant("Morning Wood",3,2,1,2,5);
		plant.setFruit(new Fruit("Morning Wood",50));
		plant.increaseAge();
		plant.increaseAge();
		assertEquals(2,plant.getHealthGauge());
		plant.isWatered();
		plant.isWatered();
		plant.increaseAge();
		assertEquals(3,plant.getHealthGauge());
	}
	
	@Test
	public void TestDecreaseHealthGauge(){
		Plant plant = new Plant("Morning Wood",3,2,1,2,5);
		assertEquals(3,plant.getHealthGauge());
		plant.increaseAge();
		plant.increaseAge();
		assertEquals(2,plant.getHealthGauge());
	}
	
	@Test
	public void TestIsWatered(){
		Plant plant = new Plant("Morning Wood",3,2,1,2,5);
		plant.increaseAge();
		assertEquals(1,plant.getWaterGauge());
		plant.isWatered();
		assertEquals(2,plant.getWaterGauge());
	}
	
	@Test
	public void TestIncreaseAge() {
		
		Plant plant = new Plant("Morning Wood",3,2,1,2,5);
		plant.setFruit(new Fruit("Morning Wood",50));
		
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
		
		plant = new Plant("Morning Wood",3,2,1,2,5);
		plant.setFruit(new Fruit("Morning Wood",50));
		plant.increaseAge();
		plant.isWatered();
		plant.increaseAge();
		plant.isWatered();
		plant.increaseAge();
		plant.isWatered();
		plant.increaseAge();
		plant.isWatered();
		plant.increaseAge();
		plant.isWatered();
		plant.increaseAge();
		plant.isWatered();
		assertEquals("dead",plant.getState());
	}
	
	@Test
	public void TestIsHarvested(){
		Plant plant = new Plant("Morning Wood",3,2,1,2,5);
		plant.setFruit(new Fruit("Morning Wood",50));
		plant.increaseAge();
		plant.increaseAge();
		plant.increaseAge();
		Fruit f = plant.isHarvested();
		assertEquals("Morning Wood",f.getName());
		assertEquals(50.0,f.getPrice(),0);
		assertEquals(1,f.getAmount());
	}
}