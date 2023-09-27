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
	public int removeDuplicates1(int[] nums) {
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
	
	// Got new Optimized solution (Revision)
	/**
	 * Using 2 ptrs 
	 * 1. Increment both until duplicate is found
	 * 2. If duplicate found , 
	 * 		2.1 increment j 
	 *		2.2 if non duplicate found swap i+1 and j 
	 * @param nums
	 * @return
	 */
	public int removeDuplicates(int[] nums) {
		
		int i=0;
		int j=1;
		int n = nums.length;
		boolean found = false;
		while(j<n)
		{
			if(nums[i]==nums[j]) {
				found = true;
				j++;
			}
			else {
				if(found) {
					int temp = nums[j];
					nums[j] = nums[i];
					nums[i+1] = temp;
					
				}
				i++;
				j++;
			}
		}
		
		
		return i+1 ;
	}
}
