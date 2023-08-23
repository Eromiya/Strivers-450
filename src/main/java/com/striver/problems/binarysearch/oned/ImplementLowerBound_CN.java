package com.striver.problems.binarysearch.oned;

/**
 * CN : https://www.codingninjas.com/studio/problems/lower-bound_8165382?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1
 * Status : Done
 */
public class ImplementLowerBound_CN {

	public int lowerBound(int[] arr, int x, int n) {
		int low = 0, high = n - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] >= x) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return low;
	}
}
