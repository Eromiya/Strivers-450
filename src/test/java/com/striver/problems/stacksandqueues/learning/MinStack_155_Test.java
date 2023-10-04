package com.striver.problems.stacksandqueues.learning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinStack_155_Test {
	MinStack_155 i = new MinStack_155();
	
	@Test
	public void test1() {
		i.push(-1);
		i.push(2);
		i.push(3);
		i.pop();
		assertEquals(-1,i.getMin());
		i.push(-4);
		assertEquals(-4,i.getMin());
		i.pop();
		assertEquals(2, i.top());
		assertEquals(-1,i.getMin());
		i.pop();
		i.pop();
		assertEquals(Integer.MIN_VALUE, i.top());
	}

}
