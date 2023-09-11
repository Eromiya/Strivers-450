package com.striver.problems.arrays.medium;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class PlusOne_66_Test {
	PlusOne_66 p = new PlusOne_66();
	
	@Test
	public void test1() {
		int[] nums1 = new int[]{ 9 };
		int[] res1 = p.plusOne(nums1);
		assertEquals("[1, 0]", Arrays.toString(res1));
	}

	@Test
	public void test3() {
		int[] nums1 = new int[]{ 1, 2 };
		int[] res1 = p.plusOne(nums1);
		assertEquals("[1, 3]", Arrays.toString(res1));
	}
	
	@Test
	public void test4() {
		int[] nums1 = new int[]{ 9,9,9,9,9,9,9 };
		int[] res1 = p.plusOne(nums1);
		assertEquals("[1, 0, 0, 0, 0, 0, 0, 0]", Arrays.toString(res1));
	}

}
