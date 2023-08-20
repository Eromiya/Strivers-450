package com.striver.problems.arrays.medium;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class SortColours_75_Test {
	SortColours_75 sortColours_75 = new SortColours_75();

	@Test
	public void test1() {
		int[] nums1 = new int[]{ 2, 0, 2, 1, 1, 0 };
		sortColours_75.sortColors(nums1);
		assertEquals("[0, 0, 1, 1, 2, 2]", Arrays.toString(nums1));
	}
	
	@Test
	public void test2() {
		int[] nums2 = new int[]{2 ,0 ,1 };
		sortColours_75.sortColors(nums2);
		assertEquals("[0, 1, 2]", Arrays.toString(nums2));
	}

}
