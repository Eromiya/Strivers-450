package com.striver.problems.bitmanipulation.learn;

/**
 * GFG : https://practice.geeksforgeeks.org/problems/odd-or-even3618/1
 * 
 * Difficulty : Easy 
 * 
 * Status : Done
 */
public class CheckOddOREven_CN {
	
	/**
	 * Check if last bit is 1
	 * @param N
	 * @return
	 */
	public String oddEven(int N){
        // code here
		return (N & 1) !=0 ? "odd" : "even";
    }

}
