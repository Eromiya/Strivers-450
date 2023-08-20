package com.striver.problems.arrays.medium;

public class SortColours_75 {

	public void sortColors(int[] nums) {
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			int minind = i;
			for (int j = i + 1; j < n; j++) {
				if (nums[minind] > nums[j])
					minind = j;
			}
			int temp = nums[i];
			nums[i] = nums[minind];
			nums[minind] = temp;
		}

	}

}
