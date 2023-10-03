package com.striver.problems.string.medium;

import org.junit.Assert;
import org.junit.Test;

public class LongestPalindromicSubstring_5_Test {
	LongestPalindromicSubstring_5 l = new LongestPalindromicSubstring_5();
	
	@Test
	public void test1() {
		Assert.assertEquals("bab", l.longestPalindrome("babad"));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals("baab", l.longestPalindrome("baab"));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals("bacddcab", l.longestPalindrome("bacddcab"));
	}
	@Test
	public void test4() {
		Assert.assertEquals("bb", l.longestPalindrome("cbbd"));
	}

}
