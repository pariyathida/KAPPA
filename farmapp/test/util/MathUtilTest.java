package util;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathUtilTest {

	@Test
	public void testAdd(){
		MathUtil mathUtil = new MathUtil();
		assertEquals(9,mathUtil.add(5, 4));
		assertEquals(8,mathUtil.add(5, 1));
	}

}