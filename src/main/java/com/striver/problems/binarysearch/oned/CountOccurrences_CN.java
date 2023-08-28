package com.striver.problems.binarysearch.oned;

/**
 * CN : https://www.codingninjas.com/studio/problems/occurrence-of-x-in-a-sorted-array_630456?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=0
 * Status : Done - But has to be done entirely with BS
 */
public class CountOccurrences_CN {
	public int count(int arr[], int n, int x) {
        int low =0, high = n-1, count=0;
        while(low<=high){
            int mid = low+(high - low)/2;
            if(arr[mid]>=x){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        for(int i=low; i<n;i++){
			if(arr[i]==x){
                count ++;
            }
            else{
                break;
            }
		}
        return count;
    }

}
