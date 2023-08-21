package com.striver.problems.arrays.easy;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class RotateArrayRight_186_Test {
	RotateArrayRight_186 rotateArrayRight_186 = new RotateArrayRight_186();

	@Test
	public void test1() {
		int[] nums1 = new int[] {1,2,3,4,5,6,7};
		rotateArrayRight_186.rotate(nums1, 3);
		assertEquals("[5, 6, 7, 1, 2, 3, 4]", Arrays.toString(nums1));
	}

	@Test
	public void test2() {
		int[] nums2 = new int[] {-1,-100,3,99};
		rotateArrayRight_186.rotate(nums2, 2);
		assertEquals("[3,99,-1,-100]", Arrays.toString(nums2));
	}
}
