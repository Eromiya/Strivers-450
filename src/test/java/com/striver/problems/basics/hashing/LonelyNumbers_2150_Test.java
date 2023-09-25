package com.striver.problems.basics.hashing;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class LonelyNumbers_2150_Test {
	
	LonelyNumbers_2150 l = new LonelyNumbers_2150();
	
	@Test
	public void test1() {
		int[] nums = {10,6,5,8};
		assertEquals("[10, 8]", Arrays.toString(l.findLonely(nums).toArray()));
	}
	
	@Test
	public void test2() {
		int[] nums = {1,3,5,3};
		assertEquals("[1, 5]", Arrays.toString(l.findLonely(nums).toArray()));
	}
	
	@Test
	public void test3() {
		int[] nums = {1};
		assertEquals("[1]", Arrays.toString(l.findLonely(nums).toArray()));
	}

}
