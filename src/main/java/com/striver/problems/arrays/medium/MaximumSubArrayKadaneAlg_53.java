package com.striver.problems.arrays.medium;

/**
 * Leet : https://leetcode.com/problems/maximum-subarray/
 * 
 * Difficulty : Medium
 * 
 * Status : Done 100%
 */
public class MaximumSubArrayKadaneAlg_53 {
	
	

	/**
	 * Solution 1
	 * 
	 * Status : TLE in LC
	 * 
	 * 1. Looped through the array and found the sum of elsements 
	 * 2. Parallely replacing the last max sum
	 * 
	 * 
	 * @param nums
	 * @return
	 */
	public int maxSubArray1(int[] nums) {

		int sum = 0;
		int N = nums.length;
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j <= N; j++) {
				sum = 0;
				for (int k = i; k < j; k++) {
					sum = sum + nums[k];
				}
				if (maxSum < sum) {
					maxSum = sum;
				}
			}
		}
		return maxSum;

	}

	/**
	 * Final Solution - KadaneAlgorithm - 100%
	 * 1. Initialize maxSum and currSum 
	 * 2. Loop through the array 
	 * 2.1 Find the currSum by add current element with existing currSum
	 * 2.2 If currSum > maxSum - Replace 
	 * 2.3 If currSrum < 0 - reset currSum to 0
	 * 
	 * @param nums
	 * @return
	 */
	public int maxSubArray(int[] nums) {

		int maxSum = Integer.MIN_VALUE;
		int maxCurr = 0;
		int n = nums.length;
		
		for(int i=0;i<n;i++) {
			maxCurr = maxCurr + nums[i];
			if(maxCurr > maxSum) {
				maxSum = maxCurr;
			}
			if(maxCurr < 0) {
				maxCurr =0;
			}
		}
		return maxSum;		

	}
}
