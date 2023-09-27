package com.striver.problems.stackandqueues.pipconversion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InfixToPostfixConversion_GFG_Test {

	InfixToPostfixConversion_GFG i = new InfixToPostfixConversion_GFG();
	
	@Test
	public void test1() {
		assertEquals("ABC+*D/", i.infixToPostfix("A*(B+C)/D"));
	}
	@Test
	public void test2() {
		assertEquals("AB+C+", i.infixToPostfix("A+B+C"));
	}
}

