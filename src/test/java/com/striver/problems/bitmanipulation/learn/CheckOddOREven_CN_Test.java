package com.striver.problems.bitmanipulation.learn;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CheckOddOREven_CN_Test {
	CheckOddOREven_CN c = new CheckOddOREven_CN();

	@Test
	public void test1() {
		assertEquals("odd", c.oddEven(99));
	}

	@Test
	public void test2() {
		assertEquals("even", c.oddEven(98));
	}
}
