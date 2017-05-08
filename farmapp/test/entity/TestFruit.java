package entity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestFruit {
	@Test
	public void TestGetName(){
		Fruit fruit = new Fruit("Morning Wood");
		assertEquals("Morning Wood", fruit.getName());
	}
	
	@Test
	public void TestGetPrice(){
		Fruit fruit = new Fruit("Morning Wood",50);
		assertEquals(50, fruit.getPrice(),0);
	}
	
	@Test
	public void TestGetAmount(){
		Fruit fruit = new Fruit("Morning Wood",50);
		assertEquals(0, fruit.getAmount());
	}
	
	@Test
	public void TestAddAmount(){
		Fruit fruit = new Fruit("Morning Wood",50);
		fruit.addAmount(10);
		assertEquals(10, fruit.getAmount());
	}
	
	@Test
	public void TestDiscard(){
		Fruit fruit = new Fruit("Morning Wood",50);
		fruit.discard();
	}
	
	@Test
	public void TestUse(){
		Fruit fruit = new Fruit("Morning Wood",50);
		fruit.use();
	}
	
	@Test
	public void TestGetType(){
		Fruit fruit = new Fruit("Morning Wood",50);
		assertEquals("fruit", fruit.getType());
	}
	
	@Test
	public void TestDeductAmount(){
		Fruit fruit = new Fruit("Morning Wood",50);
		fruit.addAmount(10);
		assertEquals(10, fruit.getAmount());
		fruit.deductAmount(5);
		assertEquals(5, fruit.getAmount());
	}
}
