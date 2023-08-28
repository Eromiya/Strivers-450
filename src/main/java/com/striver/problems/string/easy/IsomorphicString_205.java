package com.striver.problems.string.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Leet : https://leetcode.com/problems/isomorphic-strings/description/
 * 
 * Difficulty : Easy
 * 
 * Status : Done 
 */
public class IsomorphicString_205 {

	/**
	 * Solution 1 - beats 6% user - not optimised
	 * 
	 * @param s
	 * @param t
	 * @return
	 */
	public boolean isIsomorphic1(String s, String t) {
		if (s == null || t == null)
			return false;
		if (s.length() != t.length())
			return false;
		Map<Character, Integer> mapS = new HashMap<Character, Integer>();
		Map<Character, Integer> mapT = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			int indexS = mapS.getOrDefault(s.charAt(i), -1);
			int indexT = mapT.getOrDefault(t.charAt(i), -1);
			if (indexS != indexT) {
				return false;
			}
			mapS.put(s.charAt(i), i);
			mapT.put(t.charAt(i), i);
		}
		return true;

	}

	/**
	 * Solution 2 - beats 13%
	 * 
	 * @param s
	 * @param t
	 * @return
	 */
	public boolean isIsomorphic(String s, String t) {
		if (s == null || t == null)
			return false;
		if (s.length() != t.length())
			return false;
		Map<Character, Integer> mapS = new HashMap<Character, Integer>();
		Map<Character, Integer> mapT = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			int indexS = mapS.getOrDefault(s.charAt(i), -1);
			int indexT = mapT.getOrDefault(t.charAt(i), -1);
			if (indexS != indexT) {
				return false;
			}
			mapS.put(s.charAt(i), i);
			mapT.put(t.charAt(i), i);
		}
		return true;
	}

}
