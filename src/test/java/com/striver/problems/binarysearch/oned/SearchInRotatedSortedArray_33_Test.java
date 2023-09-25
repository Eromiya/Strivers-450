package com.striver.problems.binarysearch.oned;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SearchInRotatedSortedArray_33_Test {
	
	SearchInRotatedSortedArray_33 s = new SearchInRotatedSortedArray_33();
	
	@Test
	public void test1() {
		int[] nums = {4,5,6,7,0,1,2};
		assertEquals(4, s.search(nums, 0));
	}
	
	@Test
	public void test2() {
		int[] nums = {4,5,6,7,0,1,2};
		assertEquals(-1, s.search(nums, 3));
	}
	
	@Test
	public void test3() {
		int[] nums = {1};
		assertEquals(-1, s.search(nums, 0));
	}

}
