package com.striver.problems.bitmanipulation.interview;

/**
 * Leet : https://leetcode.com/problems/minimum-bit-flips-to-convert-number/
 * 
 * Status : Done 
 * 
 * Easy
 */
public class MinBitsFlips_2220 {
	
	// Result - Set bits of XOR of two numbers 
	public int minBitFlips(int start, int goal) {
        int intNum =  start ^ goal; // intermediate number 
        int check = 1;
        int count =0;
        while(check<=intNum){
            if((intNum&check) != 0){
                count++;
            }
            check = check << 1;
        }
        return count;
    }

}
