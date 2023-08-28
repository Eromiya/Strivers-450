package com.striver.problems.binarysearch.oned;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SingleElementInSortedArray_540_Test {
	SingleElementInSortedArray_540 s = new SingleElementInSortedArray_540();
	@Test
	public void test1() {
		int[] nums1 = new int[] { 1, 1,2, 2, 3 };
		assertEquals(3, s.singleNonDuplicate(nums1));
	}

	@Test
	public void test2() {
		int[] nums2 = new int[] { 4,4, 5, 6, 6 };
		assertEquals(5, s.singleNonDuplicate(nums2));
	}

	@Test
	public void test3() {
		int[] nums3 = new int[] { 1, 5, 5, 7, 7, 9, 9 };
		assertEquals(1, s.singleNonDuplicate(nums3));
	}

	@Test
	public void test4() {
		int[] nums3 = new int[] { 1, 1, 11, 11, 111, 111 };
		assertEquals(0, s.singleNonDuplicate(nums3));
	}

	@Test
	public void test5() {
		int[] nums5 = new int[] { 1, 2, 2, 3, 3 };
		assertEquals(1, s.singleNonDuplicate(nums5));
	}
}
