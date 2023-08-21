package com.striver.problems.arrays.easy;

import java.util.Hashtable;

/**
 * Leet : https://leetcode.com/problems/missing-number/description/
 * 
 * Status : Done 
 */
public class MissingNumber_268 {

	/**
	 * Final Solution 100% Approach 3
	 * 
	 * Sum of first N natural numbers formula Learning - Forgetting basic math
	 * 
	 * @param nums
	 * @return
	 */
	public int missingNumber(int[] nums) {

		int n = nums.length;
		int expSum = (n * (n + 1)) / 2;
		int actSum = 0;

		for (int i = 0; i < n; i++) {
			actSum = actSum + nums[i];
		}

		return expSum - actSum;

	}

	// Approach 1 - TLE
	public int missingNumber1(int[] nums) {
		int miss = -1;
		if (nums.length <= 0) {
			return 0;
		}
		for (int i = 0; i <= nums.length; i++) {
			// below lines not compatible
//			int finalI = i;
//         boolean contains = Arrays.stream( nums ).anyMatch( j -> j == finalI ) ;
			boolean contains = true;
			if (!contains) {
				miss = i;
				break;
			}
		}
		return miss;
	}

	// Approach 2 - HashtTable - TLE
	public int missingNumber2(int[] nums) {
		Hashtable<Integer, Integer> hashtable = new Hashtable<>();
		int miss = -1;
		for (int i = 0; i < nums.length; i++) {
			hashtable.put(nums[i], nums[i]);
		}
		for (int j = 0; j <= nums.length; j++) {
			if (!hashtable.contains(j)) {
				miss = j;
				break;
			}
		}
		return miss;
	}

}
