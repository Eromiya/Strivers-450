package com.striver.problems.recursion.stronghold;

import java.util.Stack;

/**
 * GFG : https://practice.geeksforgeeks.org/problems/reverse-a-stack/1
 * 
 * Status : Done 
 * 
 * Difficulty : Medium
 */
public class ReverseStackUsingRecursion_CN {
	public void reverse(Stack<Integer> s) {
		
		if (!s.isEmpty()) {
			Integer top = s.pop();
			reverse(s);
			insertByPop(top, s);
		}

	}

	public void insertByPop(Integer x, Stack<Integer> s) {
		if (s.isEmpty()) {
			s.push(x);

		} else {
			int a = s.pop();
			insertByPop(x, s);
			s.push(a);
		}
	}

}
