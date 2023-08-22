package com.striver.problems.arrays.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaximumSubArrayKadaneAlg_53_Test {

	MaximumSubArrayKadaneAlg_53 maximumSubArrayKadaneAlg_53 = new MaximumSubArrayKadaneAlg_53();
	
	@Test
	public void test1() {
		int[] nums1 = new int[] { 9,6,4,2,3,5,7,0,1 };
		assertEquals(37, maximumSubArrayKadaneAlg_53.maxSubArray(nums1));
	}

	@Test
	public void test2() {
		int[] nums2 = new int[] { 0,1 };
		assertEquals(1, maximumSubArrayKadaneAlg_53.maxSubArray(nums2));
	}

	@Test
	public void test3() {
		int[] nums3 = new int[] { 3,0,1 };
		assertEquals(4, maximumSubArrayKadaneAlg_53.maxSubArray(nums3));
	}
}
