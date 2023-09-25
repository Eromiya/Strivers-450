package com.striver.problems.basics.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Leet : https://leetcode.com/problems/find-all-lonely-numbers-in-the-array/description/
 * 
 * Difficulty : Medium
 * 
 * Status : Done
 */
public class LonelyNumbers_2150 {
	
	/**
	 * 1. Store the freq of all elements of the array in HashMap 
	 * 2. Fetch the freq , prev element and next element of each array element 
	 * 3. Check for the condition and add to Result List 
	 * 
	 * @param nums
	 * @return
	 */
	public List<Integer> findLonely(int[] nums) {
		Map<Integer, Integer> hashMap = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
		}

		for (int i = 0; i < nums.length; i++) {
			if (hashMap.get(nums[i]) == 1 && hashMap.getOrDefault(nums[i] - 1, 0) == 0
					&& hashMap.getOrDefault(nums[i] + 1, 0) == 0) {
				list.add(nums[i]);
			}
		}

		return list;
	}

}
