package com.striver.problems.binarysearch.oned;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ImplementLowerBound_CN_Test {
	ImplementLowerBound_CN implementLowerBound_CN = new ImplementLowerBound_CN();

	@Test
	public void test1() {
		int[] nums1 = new int[] { 1, 4, 7, 8, 10 };
		assertEquals(2, implementLowerBound_CN.lowerBound(nums1, 7, nums1.length));
	}

	@Test
	public void test2() {
		int[] nums2 = new int[] { 1, 2, 5, 6, 10 };
		assertEquals(4, implementLowerBound_CN.lowerBound(nums2, 10, nums2.length));
	}

	@Test
	public void test3() {
		int[] nums3 = new int[] { 1, 5, 5, 7, 7, 9, 10 };
		assertEquals(1, implementLowerBound_CN.lowerBound(nums3, 5, nums3.length));
	}

	@Test
	public void test4() {
		int[] nums3 = new int[] { 1, 1, 1, 1, 1, 1 };
		assertEquals(6, implementLowerBound_CN.lowerBound(nums3, 5, nums3.length));
	}

	@Test
	public void test5() {
		int[] nums5 = new int[] { 1, 2, 2, 3, 3, 5 };
		assertEquals(1, implementLowerBound_CN.lowerBound(nums5, 2, nums5.length));
	}
}
