package com.striver.problems.arrays.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StockBuyAndSell_121_Test {
	StockBuyAndSell_121 s = new StockBuyAndSell_121();
	
	@Test
	public void test1() {
		int[] nums1 = new int[] { 9,6,4,2,3,5,7,1 };
		assertEquals(5, s.maxProfit(nums1));
	}

	@Test
	public void test2() {
		int[] nums2 = new int[] { 0,1 };
		assertEquals(1,s.maxProfit(nums2));
	}

	@Test
	public void test3() {
		int[] nums3 = new int[] { 3,0,1 };
		assertEquals(1, s.maxProfit(nums3));
	}

}
