package com.striver.problems.stackandqueues.pipconversion;

import java.util.Stack;

public class InfixToPostfixConversion_GFG {

	public String infixToPostfix(String exp) {
		// Your code here
		char[] charArray = exp.toCharArray();
		String postfix = "";
		Stack<Character> stack = new Stack<>();

		for (char c : charArray) {
			if (Character.isLetterOrDigit(c)) {
				postfix += c;
			} else if (c == '(') {
				stack.push(c);
			} else if (c == ')') {
				while (!stack.isEmpty() && stack.peek() != '(') {
					postfix += stack.peek();
					stack.pop();
				}
				stack.pop();
			} else {
				while (!stack.isEmpty() && findPrecedence(stack.peek()) >= findPrecedence(c)) {
					postfix += stack.peek();
					stack.pop();
				}
				stack.push(c);
			}
		}

		while (!stack.isEmpty()) {
			postfix += stack.peek();
			stack.pop();
		}

		return postfix;
	}

	public static int findPrecedence(char c) {
		switch (c) {
		case '^':
			return 3;
		case '*':
		case '/':
			return 2;
		case '+':
		case '-':
			return 1;
		}
		return 0;
	}
}
