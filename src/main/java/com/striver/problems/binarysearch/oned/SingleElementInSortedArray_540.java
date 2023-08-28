package com.striver.problems.binarysearch.oned;

import java.util.Stack;

/**
 * Leet : https://leetcode.com/problems/single-element-in-a-sorted-array/description/
 * Status : Done - but used Stack instead of BS
 */
public class SingleElementInSortedArray_540 {
	
	/**
	 * Stack solution 
	 * 
	 * @param nums
	 * @return
	 */
	public int singleNonDuplicate(int[] nums) {
		int result = 0;
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0 && stack.size() == 0) {
				stack.push(nums[i]);
			} else if (i % 2 != 0 && stack.size() == 1 && stack.peek() == nums[i]) {
				stack.pop();
			} else {
				result = stack.pop();
				break;
			}
		}
		if(!stack.isEmpty()) {
			result = stack.pop();
		}
		return result;
	}
}
