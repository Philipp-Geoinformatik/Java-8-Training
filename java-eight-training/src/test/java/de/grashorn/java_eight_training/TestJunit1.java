package de.grashorn.java_eight_training;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJunit1 {
	@Test
	public void testAdd() {
		// test data
		int num = 5;
		String temp = null;
		String str = "Junit is working fine";

		// check for equality
		assertEquals("Junit is working fine", str);

		// check for false condition
		assertFalse(5 > 6);

		// check for not null value
		assertNotNull(str);
	}

}
