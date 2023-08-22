package com.striver.problems.arrays.medium;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SpiralMatrix_54_Test {

	SpiralMatrix_54 matrix_54 = new SpiralMatrix_54();

	@Test
	public void test1() {
		int[][] nums1 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		List<Integer> list1 = matrix_54.spiralOrder(nums1);
		System.out.println("--Example 1 -- 3*3 --");
		for (Integer i : list1) {
			System.out.println(i);
		}
		List<Integer> expected = Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5);
		assertArrayEquals(expected.toArray(), list1.toArray());
	}

	@Test
	public void test2() {
		int[][] nums2 = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		List<Integer> list2 = matrix_54.spiralOrder(nums2);
		System.out.println("--Example 2-- 3*4 --");
		for (Integer i : list2) {
			System.out.println(i);
		}
		List<Integer> expected = Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7);
		assertArrayEquals(expected.toArray(), list2.toArray());
	}

	@Test
	public void test3() {
		int[][] nums3 = new int[][] { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 },
				{ 16, 17, 18, 19, 20 }, { 21, 22, 23, 24, 25 } };
		List<Integer> list3 = matrix_54.spiralOrder(nums3);
		System.out.println("--Example 2-- 3*4 --");
		for (Integer i : list3) {
			System.out.println(i);
		}
		List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 10, 15, 20, 25, 24, 23, 22, 21, 16, 11, 6, 7, 8, 9, 14,
				19, 18, 17, 12, 13);
		assertArrayEquals(expected.toArray(), list3.toArray());
	}

	@Test
	public void test4() {
		int[][] nums4 = new int[][] { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 },
				{ 16, 17, 18, 19, 20 } };
		List<Integer> list4 = matrix_54.spiralOrder(nums4);
		System.out.println("--Example 2-- 5*4 --");
		for (Integer i : list4) {
			System.out.println(i);
		}
		List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 10, 15, 20, 19, 18, 17, 16, 11, 6, 7, 8, 9, 14, 13, 12);
		assertArrayEquals(expected.toArray(), list4.toArray());
	}
}
