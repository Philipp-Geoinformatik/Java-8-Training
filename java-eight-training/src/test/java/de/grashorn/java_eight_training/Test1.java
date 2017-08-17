package de.grashorn.java_eight_training;

import org.junit.Test;

import junit.framework.TestCase;

public class Test1 extends TestCase {
	String message = "Hello World";
	MessageUtil messageUtil = new MessageUtil(message);

	@Test
	public void testPrintMessage() {
		
		assertEquals(message , messageUtil.printMessage());
	}
}
