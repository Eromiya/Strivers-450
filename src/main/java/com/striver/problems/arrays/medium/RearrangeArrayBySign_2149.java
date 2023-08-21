package com.striver.problems.arrays.medium;


/**
 * Leet : https://leetcode.com/problems/rearrange-array-elements-by-sign/
 * Status : Time Limit Exceeded - 130 / 133 testcases passed
 */
public class RearrangeArrayBySign_2149 {
	
	/**
	 * Solution 1
	 * Status in Leet - TLE
	 * 
	 * 1. initialize i & j
	 * 2. Check for integer which is not in proper position 
	 * 3. Start to check for next proper integer using j
	 * 4. Right shift the values using k 
	 * 5. Replace the proper integer from j in place of i and increment i
	 * 
	 * @param nums
	 * @return
	 */
	public int[] rearrangeArray(int[] nums) {
		int n=nums.length;
		int i=0,j=0;
		while(i<n) {
			if(i%2==0 && nums[i]>=0) {
				i++;
			}
			else if(i%2!=0 && nums[i]<0) {
				i++;
			}
			else {
				j=i+1;
				while(j<n){
					if((nums[j]>=0 && nums[i]<0) || (nums[j]<0 && nums[i]>=0))  {
						int temp = nums[j];
						int k= j;
						while(k>i) {
							nums[k] = nums[k-1];
							k--;
						}
						nums[i]=temp;
						i++;
						break;
					}
					else {
						j = j+1;
					}
				}
			}
		}
		return nums;
	}
}
