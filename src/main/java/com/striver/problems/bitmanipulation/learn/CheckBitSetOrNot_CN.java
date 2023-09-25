package com.striver.problems.bitmanipulation.learn;

/**
 * GFG : https://practice.geeksforgeeks.org/problems/check-whether-k-th-bit-is-set-or-not-1587115620/1
 * 
 * Difficulty : Easy
 * 
 * Status : Done
 */
public class CheckBitSetOrNot_CN {

	public boolean checkKthBit(int n, int k) {
		// Your code here
		return ( n & ( 1 << k ) ) != 0;

	}

}
