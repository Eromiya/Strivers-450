package com.striver.problems.sorting;

/**
 * GFG :https://practice.geeksforgeeks.org/problems/bubble-sort/1
 * 
 * Difficulty : Easy
 * 
 * Status: Done
 */
public class RecursiveBubbleSort_GFG {

	public static void bubbleSort(int arr[], int n)
    {
        if(n==1){
            return;
        }
        
        // Find the largest element and move to the last 
        
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
        
        //Then reduce the size of the array 
        // as the last elements will keep on sorted and placed in right position
        bubbleSort(arr, n-1);
    }
	
}
