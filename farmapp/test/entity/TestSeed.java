package entity;

import static org.junit.Assert.*;

import org.junit.Test;

import entity.Seed;

public class TestSeed {
	
	@Test
	public void getName(){
		Seed seed = new Seed("Apple");
		assertEquals(seed.getName(), "Apple" );
	}
	
	@Test
	public void setName(){
		Seed seed = new Seed("Banana");
		assertEquals(seed.getName(), "Banana" );
	}
	
	@Test
	public void setAmount(){
		Seed seed = new Seed("");
		seed.setAmount(10);
		assertEquals(seed.getAmount(), 10 );
	}
	
	@Test
	public void getAmount(){
		Seed seed = new Seed("");
		seed.setAmount(10);
		assertEquals(seed.getAmount(), 10 );
	}
	
	@Test
	public void addAmount(){
		Seed seed = new Seed("");
		seed.amount = 1;
		seed.addAmount(2);
		assertEquals(seed.getAmount(), 3 );
	}
	
	@Test
	public void getPrice(){
		Seed seed = new Seed("");
		seed.price = 10.0;
		assertEquals(seed.getPrice(), 10.0 );
	}
	
	@Test
	public void getType(){
		Seed seed = new Seed("");
		assertEquals(seed.getType(), "seed" );
	}
	
	

}
