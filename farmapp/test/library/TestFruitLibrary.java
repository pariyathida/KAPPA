package library;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import entity.Fruit;

public class TestFruitLibrary {

	@Test
	public void testFruitLibrary(){
		
		Fruit fruit = new Fruit("Orange",30);
		FruitLibrary fruitLibrary = new FruitLibrary();
		assertEquals(fruit,fruitLibrary.getFruit("Orange"));
	}
}
