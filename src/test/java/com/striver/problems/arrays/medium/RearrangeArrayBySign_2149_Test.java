package com.striver.problems.arrays.medium;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class RearrangeArrayBySign_2149_Test {
	RearrangeArrayBySign_2149 rearrangeArrayBySign_2149 = new RearrangeArrayBySign_2149();

	@Test
	public void test1() {
		int[] nums1 = new int[] {3 ,1 ,-2 ,-5 ,2 ,-4};
		assertEquals("[3, -2, 1, -5, 2, -4]", Arrays.toString(rearrangeArrayBySign_2149.rearrangeArray(nums1)));
	}

	@Test
	public void test2() {
		int[] nums2 = new int[] {-1, 1};
		assertEquals("[1, -1]", Arrays.toString(rearrangeArrayBySign_2149.rearrangeArray(nums2)));
	}
	
	
	//Failed-LC  - code o/p - [28,-41,22,-8,46,-37,35,-9,18,-6,19,-26,15,-10,31,-37,14,-9]
	@Test
	public void test3() {
		int[] nums3 = new int[] {28,-41,22,-8,-37,46,35,-9,18,-6,19,-26,-37,-10,-9,15,14,31};
		assertEquals("[28, -41, 22, -8, 46, -37, 35, -9, 18, -6, 19, -26, 15, -37, 14, -10, 31, -9]", Arrays.toString(rearrangeArrayBySign_2149.rearrangeArray(nums3)));
	}
	
}
