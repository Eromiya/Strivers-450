package com.striver.problems.binarysearch.oned;

import java.util.Stack;

public class SingleElementInSortedArray_540 {
	public int singleNonDuplicate(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			Stack<Integer> stack = new Stack<>();
			if (i % 2 == 0 && stack.size() == 0) {
				stack.push(nums[i]);
			} else if (i % 2 != 0 && stack.size() == 1 && stack.peek() == nums[i]) {
				stack.pop();
			} else {
				result = stack.pop();
			}
		}
		return result;
	}
}
