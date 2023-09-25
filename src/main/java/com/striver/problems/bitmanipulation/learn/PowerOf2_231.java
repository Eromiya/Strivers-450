package com.striver.problems.bitmanipulation.learn;

/**
 * Leet : https://leetcode.com/problems/power-of-two/description/
 * 
 * Status : Done 
 * 
 * Difficulty : Easy
 */
public class PowerOf2_231 {

	/**
     * Approach 1 
     * 
     * 1. Iteratively check if it's a power of 2 by checking all the powers of 2
     * 
     * @param n
     * @return
     */
	public boolean isPowerOfTwo1(int n) {
		if (n == 1) {
			return true;
		} else if (n % 2 != 0) {
			return false;
		} else {
			for (int i = 1; i <= n / 2; i++) {
				double val = Math.pow(2, i);
				if (val == n) {
					return true;
				}
			}
			return false;
		}
	}

	/**
     * Solution 1 
     * 
     * 1. Typecast the input to double
     * 2. Keep on diving the number until it is 0.
     * 3. If it catches exactly at 1 - It's power of 2 
     * 
     * @param n
     * @return
     */
	public boolean isPowerOfTwo3(int n) {
		return isPowerOfTwo2(n);
	}

	public static boolean isPowerOfTwo2(double n) {
		if (n == 1) {
			return true;
		} else if (n == 0) {
			return false;
		} else {
			return isPowerOfTwo2(n / 2);
		}
	}
	
	/**
	 * Solution 2
	 * 
	 * By converting the numbers to binary 
	 * Check except the first bit others are 0
	 * 
	 * @param n
	 * @return
	 */
	public boolean isPowerOfTwoUsingBinaryNumberConversion(int n) {
		if (n == 0) {
			return false;
		}
		if (n == 1) {
			return true;
		}
		int num = n;
		StringBuilder binary = new StringBuilder("");
		int rem = 0;
		while (num != 0) {
			rem = num % 2;
			binary.append(rem);
			num = num / 2;
		}
		int len = binary.toString().length();
		String s = binary.reverse().toString().substring(1, len);
		if (s.matches("^0*$")) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Optimized Solution : Using AND operator '|'
	 * 
	 * @param n
	 * @return
	 */
	public boolean isPowerOfTwo(int n) {
		return (n!=0 && (n & n-1)==0);
	}
}
