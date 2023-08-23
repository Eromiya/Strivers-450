package com.striver.problems.binarysearch.oned;

/**
 * CN : https://www.codingninjas.com/studio/problems/implement-upper-bound_8165383?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=0
 * Status : Done
 */
public class ImplementUpperBound_CN {
	public int upperBound(int []arr, int x, int n){
        int low =0, high = n-1;
        while(low<=high){
            int mid = low+(high - low)/2;
            if(arr[mid]>x){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        
        return high+1;
    }

}
