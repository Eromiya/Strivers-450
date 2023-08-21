package com.striver.problems.arrays.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RemoveDuplicates_26_Test {
	RemoveDuplicates_26 removeDuplicates_26 = new RemoveDuplicates_26();

	@Test
	public void test1() {
		int[] nums1 = new int[] { 0, 1, 1 };
		assertEquals(2, removeDuplicates_26.removeDuplicates(nums1));
	}

	@Test
	public void test2() {
		int[] nums2 = new int[] { 1, 1, 2, 3, 3, 4, 44, 56, 90 };
		assertEquals(7, removeDuplicates_26.removeDuplicates(nums2));
	}

	@Test
	public void test3() {
		int[] nums3 = new int[] { 1, 1, 1, 1, 1 };
		assertEquals(1, removeDuplicates_26.removeDuplicates(nums3));
	}

	@Test
	public void test4() {
		int[] nums4 = { 1, 3, 4, 5, 6, 12, 13, 17, 19, 22, 23, 25, 27, 28, 28, 35, 36, 37, 39, 43, 46, 48, 54, 59, 62,
				63, 65, 68, 68, 70, 70, 72, 79, 82, 83, 92, 92, 93, 95, 96, 96, 100 };
		assertEquals(37, removeDuplicates_26.removeDuplicates(nums4));
	}
}
