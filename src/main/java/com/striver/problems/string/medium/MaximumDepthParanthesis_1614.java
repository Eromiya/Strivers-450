package com.striver.problems.string.medium;

import java.util.Stack;

/**
 * Leet : https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/description/
 * 
 * Difficulty : Easy
 * 
 * Status : Done
 */
public class MaximumDepthParanthesis_1614 {
	
	public int maxDepth(String s) {
        Stack<Character> stack= new Stack<>();
        int maxDepth = 0;
        for(char c : s.toCharArray()){
            if(c=='('){
                stack.push('(');
                maxDepth = Math.max(maxDepth, stack.size());
            }
            else if(c==')'){
                stack.pop();
            }
        }
        return maxDepth;
        
    }

}
