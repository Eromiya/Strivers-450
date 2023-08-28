package com.striver.problems.string.easy;

import org.junit.Assert;
import org.junit.Test;

public class IsomorphicString_205_Test {

	IsomorphicString_205 i = new IsomorphicString_205();

	@Test
	public void test1() {

		Assert.assertTrue(i.isIsomorphic("egg", "add"));
	}

	@Test
	public void test2() {
		Assert.assertTrue(i.isIsomorphic("paper", "title"));
	}
	
	@Test
	public void test3() {
		Assert.assertFalse(i.isIsomorphic("foo", "bar"));
	}
	
	@Test
	public void test4() {

		Assert.assertFalse(i.isIsomorphic("badc", "baba"));
	}
}
