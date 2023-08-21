package com.striver.problems.arrays.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Leet : https://leetcode.com/problems/rearrange-array-elements-by-sign/ Status
 * Status : Done - but not optimized
 */
public class RemoveDuplicates_26 {

	/**
	 * Solution 1
	 * 
	 * 1. initialize i, itr & Set 2. Check the current integer in set 3. If not
	 * present add and increment i 4. If present left shift other elements and
	 * continue with the same position of i 5. Break the look once itr reach N 6.
	 * Return the size of Set
	 * 
	 * @param nums
	 * @return
	 */
	public int removeDuplicates(int[] nums) {
		int N = nums.length;
		Set<Integer> set = new HashSet<>();
		int itr = 0;
		int i = 0;
		while (itr < N) {
			if (set.contains(nums[i])) {
				int k = i;
				while (k < N - 1) {
					nums[k] = nums[k + 1];
					k++;
				}

			} else {
				set.add(nums[i]);
				i++;
			}
			itr++;
		}
		return set.size();
	}
}
