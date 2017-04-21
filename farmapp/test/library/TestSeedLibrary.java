package library;

import static org.junit.Assert.*;

import org.junit.Test;

import entity.Seed;

public class TestSeedLibrary {
	@Test
	public void testGetSeed(){
		Seed seed = new Seed("Morning Wood");
		SeedLibrary seedLibrary = new SeedLibrary();
		assertEquals(seed,seedLibrary.getSeed("Morning Wood"));
	}
}
