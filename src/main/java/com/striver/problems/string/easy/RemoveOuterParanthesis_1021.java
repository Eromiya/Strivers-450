package com.striver.problems.string.easy;

import java.util.Stack;

/**
 * Leet : https://leetcode.com/problems/remove-outermost-parentheses/
 * 
 * Difficulty : Easy
 * 
 * Status : Done 
 */
public class RemoveOuterParanthesis_1021 {

	/**
	 * Solution 1 but got wrong answer in LC
	 * 
	 * @param s
	 * @return
	 */
	public String removeOuterParentheses1(String s) {
		int size = s.length();
		char[] sArray = s.toCharArray();
		StringBuilder br = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (sArray[i] == '(') {
				stack.push(sArray[i]);
			} else {
				if (stack.size() > 1) {
					count++;
					br.append("(");
					stack.pop();
					if (stack.size() == 1) {
						count--;
						br.append(")");
					}
				}

				else {
					stack.clear();
				}
			}
		}
		while (count > 0) {
			br.append(")");
			count--;
		}

		return br.toString();
	}

	/**
	 * Solution 2 Final Solution
	 * 
	 * @param s
	 * @return
	 */
	public String removeOuterParentheses(String s) {
		char[] sArray = s.toCharArray();
		StringBuilder br = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		for (char c : sArray) {
			if (stack.isEmpty() && c == '(') {
				stack.push('(');
			} else if (!stack.isEmpty() && c == '(') {
				stack.push('(');
				br.append(c);
			} else if (stack.size() > 1 && c == ')') {
				stack.pop();
				br.append(c);
			} else if (stack.size() == 1 && c == ')') {
				stack.pop();
			}
		}

		return br.toString();
	}

}
