package com.striver.problems.arrays.easy;

/**
 * 
 * Leet : https://leetcode.com/problems/rotate-array/ 
 * Status : Done - but not optimized
 * 
 */
public class RotateArrayRight_186 {

	// Solution 1 - TLE
	public void rotate1(int[] nums, int k) {
		int i = 0, j = 0;
		int n = nums.length;
		for (i = 0; i < k; i++) {
			int temp = nums[n - 1];
			for (j = n - 1; j > 0; j--) {
				nums[j] = nums[j - 1];
			}
			nums[j] = temp;
		}
	}

	/*
	 * Final Solution
	 * 
	 * 1. Reverse the entire array 
	 * 2. split the array with position k 
	 * 3. Reverse the sub part 0, k-1 
	 * 4. Reverse the sub part k, n-1
	 */
	public void rotate(int[] arr, int k) {
		int n = arr.length;
		if (n == 1) {
			return;
		}
		k = k % n;
		reverseArray(arr, 0, arr.length - 1);
		reverseArray(arr, 0, k - 1);
		reverseArray(arr, k, arr.length - 1);

	}

	public void reverseArray(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}

}
