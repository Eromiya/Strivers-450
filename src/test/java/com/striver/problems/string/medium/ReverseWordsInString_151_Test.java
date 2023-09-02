package com.striver.problems.string.medium;

import org.junit.Assert;
import org.junit.Test;

public class ReverseWordsInString_151_Test {
	
	ReverseWordsInString_151 r = new ReverseWordsInString_151();
	
	@Test
	public void test1()
	{
		Assert.assertEquals("blue is sky the", r.reverseWords("the sky is blue"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals("world hello", r.reverseWords("  hello world  "));
	}

	@Test
	public void test3()
	{
		Assert.assertEquals("example good a", r.reverseWords("a good   example"));
	}
}
