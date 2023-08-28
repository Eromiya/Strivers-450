package com.striver.problems.binarysearch.oned;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountOccurrences_CN_Test {
	CountOccurrences_CN countOccurrences_CN = new CountOccurrences_CN();

	@Test
	public void test1() {
		int[] nums1 = new int[] { 1, 4, 7, 8, 10 };
		assertEquals(0, countOccurrences_CN.count(nums1, nums1.length, 11));
	}

	@Test
	public void test2() {
		int[] nums2 = new int[] { 1, 2, 5, 6, 10 };
		assertEquals(1, countOccurrences_CN.count(nums2, nums2.length, 10));
	}

	@Test
	public void test3() {
		int[] nums3 = new int[] { 1, 5, 5, 7, 7, 9, 10 };
		assertEquals(2, countOccurrences_CN.count(nums3, nums3.length, 7));
	}

	@Test
	public void test4() {
		int[] nums3 = new int[] { 1, 1, 1, 1, 1, 1 };
		assertEquals(6, countOccurrences_CN.count(nums3,nums3.length, 1));
	}

	@Test
	public void test5() {
		int[] nums5 = new int[] { 1, 2, 2, 3, 3, 5, 5, 5 };
		assertEquals(3, countOccurrences_CN.count(nums5, nums5.length,5 ));
	}
}
