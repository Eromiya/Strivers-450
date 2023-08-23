package com.striver.problems.binarysearch.oned;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ImplementUpperBound_CN_Test {
	ImplementUpperBound_CN implementUpperBound_CN = new ImplementUpperBound_CN();

	@Test
	public void test1() {
		int[] nums1 = new int[] { 1, 4, 7, 8, 10 };
		assertEquals(3, implementUpperBound_CN.upperBound(nums1, 7, nums1.length));
	}

	@Test
	public void test2() {
		int[] nums2 = new int[] { 1, 2, 5, 6, 10 };
		assertEquals(5, implementUpperBound_CN.upperBound(nums2, 10, nums2.length));
	}

	@Test
	public void test3() {
		int[] nums3 = new int[] { 1, 5, 5, 7, 7, 9, 10 };
		assertEquals(3, implementUpperBound_CN.upperBound(nums3, 5, nums3.length));
	}
	
	@Test
	public void test4() {
		int[] nums3 = new int[] { 1, 1,1,1,1,1 };
		assertEquals(6, implementUpperBound_CN.upperBound(nums3, 5, nums3.length));
	}
}
