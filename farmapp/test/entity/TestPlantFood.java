package entity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestPlantFood {

	@Test
	public void TestGetType(){
		PlantFood plantFood = new PlantFood("Test", 50);
		assertEquals("plantFood", plantFood.getType());
	}
	
	@Test
	public void TestGetName(){
		PlantFood plantFood = new PlantFood("Test", 50);
		assertEquals("Test", plantFood.getName());
	}
	
	@Test
	public void TestGetPrice(){
		PlantFood plantFood = new PlantFood("Test", 50);
		assertEquals(50, plantFood.getPrice(),0);
	}
	
	@Test
	public void TestGetAmount(){
		PlantFood plantFood = new PlantFood("Test", 50);
		assertEquals(0, plantFood.getAmount());
	}
	
	@Test
	public void TestSetAmount(){
		PlantFood plantFood = new PlantFood("Test", 50);
		plantFood.setAmount(10);
		assertEquals(10, plantFood.getAmount());
	}
	
	@Test
	public void TestAddAmount(){
		PlantFood plantFood = new PlantFood("Test", 50);
		plantFood.addAmount(5);
		assertEquals(5, plantFood.getAmount());
	}
	
	@Test
	public void TestUse(){
		PlantFood plantFood = new PlantFood("Test", 50);
		plantFood.addAmount(1);
		assertEquals(1, plantFood.getAmount());
		plantFood.use();
		assertEquals(0, plantFood.getAmount());
		plantFood.use();
		assertEquals(0, plantFood.getAmount());
	}
	
	@Test
	public void TestDeductAmount(){
		PlantFood plantFood = new PlantFood("Test", 50);
		plantFood.addAmount(1);
		assertEquals(1, plantFood.getAmount());
		plantFood.deductAmount(1);
		assertEquals(0, plantFood.getAmount());
	}
}
