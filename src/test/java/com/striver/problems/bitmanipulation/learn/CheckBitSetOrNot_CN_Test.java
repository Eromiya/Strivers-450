package com.striver.problems.bitmanipulation.learn;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CheckBitSetOrNot_CN_Test {

	CheckBitSetOrNot_CN c = new CheckBitSetOrNot_CN();
	
	@Test
	public void test1() {
		assertFalse(c.checkKthBit(500, 3));
	}
	
	@Test
	public void test2() {
		assertTrue(c.checkKthBit(4, 2));
	}
	
	@Test
	public void test3() {
		assertFalse(c.checkKthBit(4, 0));
	}
	
	@Test
	public void test4() {
		assertTrue(c.checkKthBit(1, 0));
	}
	
	@Test
	public void test5() {
		assertFalse(c.checkKthBit(0, 0));
	}

	@Test
	public void test6() {
		assertTrue(c.checkKthBit(39, 5));
	}
}
