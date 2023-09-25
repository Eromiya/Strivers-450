package com.striver.problems.binarysearch.oned;

/**
 * Leet : https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/
 * 
 * Difficulty : Medium
 * 
 * Status : Done
 */
public class SearchInRotatedSortedArray2_81 {
	
	public boolean search(int[] nums, int target) {
        int low =0, high=nums.length-1;
         while(low <= high ) {
            int mid = low + (high-low)/2;

            if(nums[mid] == target) 
                return true;

            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
                continue;
            }
            
            if(nums[low] <= nums[mid]) {
                if(target < nums[mid] && target >= nums[low]){
                    high = mid -1;
                }
                else{
                    low = mid +1;
                }
            } else {
                if(target > nums[mid] && target <= nums[high]){
                    low = mid +1;
                }
                else{
                 high = mid -1;
                }
            }
        }
        return false;
    }

}
