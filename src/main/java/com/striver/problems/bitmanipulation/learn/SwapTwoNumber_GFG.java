package com.striver.problems.bitmanipulation.learn;

import java.util.Arrays;
import java.util.List;

/**
 * GFG : https://practice.geeksforgeeks.org/problems/swap-two-numbers3844/1
 * 
 * Status : Done
 * 
 * Diff : School
 */
public class SwapTwoNumber_GFG {
	
	/**
	 * Using XOR
	 * @param a
	 * @param b
	 * @return
	 */
	public List<Integer> get(int a,int b)
    {
        a^=b;
        b^=a;
        a^=b;
        return Arrays.asList(a, b);
    }
}
