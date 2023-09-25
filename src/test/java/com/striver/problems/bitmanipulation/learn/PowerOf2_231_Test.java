package com.striver.problems.bitmanipulation.learn;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PowerOf2_231_Test {
	PowerOf2_231 p = new PowerOf2_231();
	
	@Test
	public void test1() {
		assertTrue(p.isPowerOfTwo(128));
	}
	
	@Test
	public void test2() {
		assertFalse(p.isPowerOfTwo(0));
	}
	
	@Test
	public void test3() {
		assertTrue(p.isPowerOfTwo(1));
	}

	@Test
	public void test4() {
		assertFalse(p.isPowerOfTwo(10000000));
	}
}
