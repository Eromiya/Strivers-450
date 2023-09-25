package com.striver.problems.bitmanipulation.interview;

/**
 * Leet : https://leetcode.com/problems/single-number/description/
 * 
 * Status : Done
 * 
 * Easy
 */
public class SingleNumber_136 {
	
	// XOR of all to find the remaining one
	public int singleNumber(int[] nums) {
        int ans=0; 
        for(int i=0; i<nums.length; i++){
            ans ^= nums[i];
        }
        return ans;    
    }
}
