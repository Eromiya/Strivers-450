package com.striver.problems.bitmanipulation.learn;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SetRightmostBit_CN_Test {
	SetRightmostBit_CN s = new SetRightmostBit_CN();
	@Test
	public void test1() {
		assertEquals(7, s.setBit(6));
	}

	@Test
	public void test2() {
		assertEquals(15, s.setBit(15));
	}
	
	@Test
	public void test3() {
		assertEquals(1535, s.setBit(1279));
	}
}
