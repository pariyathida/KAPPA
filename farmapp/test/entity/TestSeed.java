package entity;

import static org.junit.Assert.*;

import org.junit.Test;

import entity.Seed;

public class TestSeed {

	@Test
	public void getName() {
		Seed seed = new Seed("Apple");
		assertEquals(seed.getName(), "Apple");
	}

	@Test
	public void setName() {
		Seed seed = new Seed("Banana");
		assertEquals(seed.getName(), "Banana");
	}

	@Test
	public void setAmount() {
		Seed seed = new Seed("");
		seed.setAmount(10);
		assertEquals(seed.getAmount(), 10);
	}

	@Test
	public void getAmount() {
		Seed seed = new Seed("");
		seed.setAmount(10);
		assertEquals(seed.getAmount(), 10);
	}

	@Test
	public void addAmount() {
		Seed seed = new Seed("");
		seed.setAmount(1);
		seed.addAmount(2);
		assertEquals(seed.getAmount(), 3);
	}

	@Test
	public void getPrice() {
		Seed seed = new Seed("");
		seed.setPrice(10.0);
		assertEquals(10.0, seed.getPrice(),0);
	}

	@Test
	public void getType() {
		Seed seed = new Seed("");
		assertEquals(seed.getType(), "seed");
	}

	@Test
	public void TestDeductAmount(){
		Seed seed = new Seed("");
		seed.setAmount(10);
		assertEquals(10, seed.getAmount());
		seed.deductAmount(5);
		assertEquals(5, seed.getAmount());
	}
}
