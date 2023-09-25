package com.striver.problems.binarysearch.oned;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SearchInRotatedSortedArray2_81_Test {
	SearchInRotatedSortedArray2_81 s = new SearchInRotatedSortedArray2_81();
	
	@Test
	public void test1() {
		int[] nums = {2,5,6,0,0,1,2};
		assertTrue(s.search(nums, 0));
	}
	
	@Test
	public void test2() {
		int[] nums = {2,5,6,0,0,1,2};
		assertFalse(s.search(nums, 3));
	}
	
	@Test
	public void test3() {
		int[] nums = {1,0,1,1,1};
		assertTrue(s.search(nums, 0));
	}
}
