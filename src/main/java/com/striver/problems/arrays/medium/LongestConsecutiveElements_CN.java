package com.striver.problems.arrays.medium;

import java.util.Arrays;

/**
 * CN : https://www.codingninjas.com/studio/problems/longest-successive-elements_6811740?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1
 * 
 * Status : Done 
 */
public class LongestConsecutiveElements_CN {

	/**
	 * Solution 1 :
	 * 
	 * 1. Sort Array 
	 * 2. Maintain currLength and Longest int for finding the longest 
	 * consecutive subarray
	 * 3. Check if the next element is same as current element - skip in that case.
	 * 4. Check if the next element & current Element has a difference of 1.
	 * 4.1 If yes, increment the currentLongest value 
	 * 4.2 If no, check the currentLongest with existing Longest Length 
	 * And update the Longest length value
	 * 4.3 Make CurrLongest as Initial value which is 1
	 * 5. Finally make the same check and update the longest value
	 * 6. Return the longest
	 * 
	 * 
	 * @param a
	 * @return
	 */
	public int longestSuccessiveElements(int[] a) {
		// Write your code here.
		Arrays.sort(a);
		int longest = 1;
		int currLen = 1;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i + 1] == a[i]) {
				continue;
			}
			if (a[i + 1] - a[i] == 1) {
				currLen++;
			} else {

				if (currLen > longest) {
					longest = currLen;
				}
				currLen = 1;
			}

		}
		if (currLen > longest) {
			longest = currLen;
		}
		return longest;
	}
}
