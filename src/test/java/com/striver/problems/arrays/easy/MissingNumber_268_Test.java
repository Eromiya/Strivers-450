package com.striver.problems.arrays.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MissingNumber_268_Test {
	MissingNumber_268 missingNumber_268 = new MissingNumber_268();
	@Test
	public void test1() {
		int[] nums1 = new int[] { 9,6,4,2,3,5,7,0,1 };
		assertEquals(8, missingNumber_268.missingNumber(nums1));
	}

	@Test
	public void test2() {
		int[] nums2 = new int[] { 0,1 };
		assertEquals(2, missingNumber_268.missingNumber(nums2));
	}

	@Test
	public void test3() {
		int[] nums3 = new int[] { 3,0,1 };
		assertEquals(2, missingNumber_268.missingNumber(nums3));
	}

}
