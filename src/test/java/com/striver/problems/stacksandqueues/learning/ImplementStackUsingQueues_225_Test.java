package com.striver.problems.stacksandqueues.learning;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ImplementStackUsingQueues_225_Test {

	ImplementStackUsingQueues_225 i = new ImplementStackUsingQueues_225();
	
	@Test
	public void test1() {
		i.push(1);
		i.push(2);
		i.push(3);
		i.push(4);
		assertEquals(4, i.pop());
		assertEquals(3, i.top());
		assertFalse(i.empty());
		i.pop();
		i.pop();
		assertEquals(1, i.top());
		i.pop();
		assertTrue(i.empty());
	}
}
