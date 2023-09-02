package com.striver.problems.arrays.medium;

import org.junit.Assert;
import org.junit.Test;

public class LongestConsecutiveElement_CN_Test {

	LongestConsecutiveElements_CN l = new LongestConsecutiveElements_CN();
	@Test
	public void test1() {
		int[] nums1 = {1,2,2,1};
		Assert.assertEquals(2,l.longestSuccessiveElements(nums1));
	}
	
	@Test
	public void test2() {
		int[] nums2 = {15 ,6, 2 ,1, 16 ,4, 2 ,29 ,9 ,12, 8 ,5, 14, 21, 8, 12 ,17 ,16 ,6 ,26 ,3 };
		Assert.assertEquals(6,l.longestSuccessiveElements(nums2));
		
	}
	
	@Test
	public void test3() {
		int[] nums3 = {5,4 ,3 };
		Assert.assertEquals(3,l.longestSuccessiveElements(nums3));
		
	}
	
	@Test
	public void test4() {
		int[] nums4 = {19, 23, 25, 18 ,21 ,19 ,5 ,3 ,26, 22 ,18 ,6 ,19, 18, 4, 30 };
		Assert.assertEquals(4,l.longestSuccessiveElements(nums4));
		
	}
}
