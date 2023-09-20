package com.striver.problems.recursion.stronghold;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class ReverseStackUsingRecursion_CN_Test{
	ReverseStackUsingRecursion_CN r = new ReverseStackUsingRecursion_CN();
	
	@Test
	public void test1() {
		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		
		r.reverse(s);
		int[] in = new int[] { 1,2,3,4,5 };
		for(int i : in) {
			Assert.assertEquals(i, s.pop().intValue());
		}
		
	}

}
