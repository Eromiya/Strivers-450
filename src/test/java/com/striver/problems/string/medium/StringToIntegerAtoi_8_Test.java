package com.striver.problems.string.medium;

import org.junit.Assert;
import org.junit.Test;


public class StringToIntegerAtoi_8_Test {

	StringToIntegerAtoi_8 s = new StringToIntegerAtoi_8();
	
	@Test
	public void test1() {
		Assert.assertEquals(0, s.myAtoi("+-12"));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(0, s.myAtoi("+ 12"));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(1, s.myAtoi("1"));
	}
	@Test
	public void test4() {
		Assert.assertEquals(1, s.myAtoi("1++++++++++        "));
	}
	
	@Test
	public void test5() {
		Assert.assertEquals(1, s.myAtoi("++++1"));
	}
}

