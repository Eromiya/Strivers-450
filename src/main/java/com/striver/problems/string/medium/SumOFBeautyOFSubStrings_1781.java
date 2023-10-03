package com.striver.problems.string.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Leet : https://leetcode.com/problems/sum-of-beauty-of-all-substrings/description/
 * 
 * Status : Done
 * 
 * Diff : Medium
 */
public class SumOFBeautyOFSubStrings_1781 {
	
	/**
	 * Using Ordered hashing - array[26]
	 * 
	 * @param s
	 * @return
	 */
	public int beautySum(String s) {
		int n = s.length();
		int beauty = 0;
		for (int i = 0; i < n; i++) {
			int[] freq = new int[26];
			for (int j = i; j < n; j++) {
				
				freq[s.charAt(j)-'a']++ ;
				int[] minMax = findMinMax(freq);
				beauty += (minMax[1] - minMax[0]);
			}
		}
		return beauty;
	}
	
	private int[] findMinMax(int[] freq) {
		Integer min = Integer.MAX_VALUE;
		Integer max = Integer.MIN_VALUE;
		for (int value : freq) {
			if(value>0) {
				min = Math.min(min, value);

				max = Math.max(max, value);
			}
		}
		return new int[] { min, max };
	}

	/**
	 * Approach 1
	 * Store each subString freq in map and fetch max & min
	 * 
	 * Expl for TLE : Checked optimal solution, but they have user arr[] of size 26
	 * instead of HashMap
	 * 
	 * @param s
	 * @return
	 */
	public int beautySum1(String s) {
		int n = s.length();
		int beauty = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				Map<Character, Integer> map = new HashMap<Character, Integer>();

				String str = s.substring(i, j + 1);
				if (str.length() == 1 || str.length() == 2)
					continue;
				char[] charArr = str.toCharArray();
				for (char ch : charArr) {
					map.put(ch, map.getOrDefault(ch, 0) + 1);
				}
				// Find the min
				int[] minMax = findMinMax1(map);
				beauty += (minMax[1] - minMax[0]);
			}
		}
		return beauty;
	}

	private int[] findMinMax1(Map<Character, Integer> map) {
		Integer min = Integer.MAX_VALUE;
		Integer max = -1;
		for (Integer value : map.values()) {
			min = Math.min(min, value);
			max = Math.max(max, value);
		}
		return new int[] { min, max };
	}
}
