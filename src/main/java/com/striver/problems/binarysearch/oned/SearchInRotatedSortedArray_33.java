package com.striver.problems.binarysearch.oned;

/**
 * Leet : https://leetcode.com/problems/search-in-rotated-sorted-array/description/
 * 
 * Status : Done 
 * 
 * Difficulty : Medium
 */
public class SearchInRotatedSortedArray_33 {
	
	/**
	 At any point during the search in the rotated array, one half (either the left or the right) will always be sorted. Determining which half is sorted is crucial for our modified binary search.

		If left half [low...mid][low...mid][low...mid] is sorted: We know this if the element at low\text{low}low is less than or equal to the element at mid\text{mid}mid. In a normally sorted array, if the start is less than or equal to the midpoint, it means all elements till the midpoint are in the correct increasing order.

			If the target lies within this sorted left half: We know this if the target is greater than or equal to the element at low\text{low}low and less than the element at mid\text{mid}mid. If this is the case, we then move our search to this half, meaning, we update high\text{high}high to mid−1\text{mid} - 1mid−1.

			Otherwise: The target must be in the right half. So, we update low\text{low}low to mid+1\text{mid} + 1mid+1.

		If right half [mid...high][mid...high][mid...high] is sorted: This is the else part. If the left half isn't sorted, the right half must be!

			If the target lies within this sorted right half: We know this if the target is greater than the element at mid\text{mid}mid and less than or equal to the element at high\text{high}high. If so, we move our search to this half by updating low\text{low}low to mid+1\text{mid} + 1mid+1.

			Otherwise: The target must be in the left half. So, we update high\text{high}high to mid−1\text{mid} - 1mid−1.
	 * @param nums
	 * @param target
	 * @return
	 */
	public int search(int[] nums, int target) {
		int low = 0, high = nums.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (nums[mid] == target)
				return mid;
			if (nums[low] <= nums[mid]) {
				if (target < nums[mid] && target >= nums[low]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} else {
				if (target > nums[mid] && target <= nums[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		}
		return -1;
	}

}
