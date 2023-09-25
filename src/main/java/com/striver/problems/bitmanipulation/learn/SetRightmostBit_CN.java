package com.striver.problems.bitmanipulation.learn;

/**
 * GFG : https://practice.geeksforgeeks.org/problems/set-the-rightmost-unset-bit4436/1
 * 
 * Status : Done
 * 
 * Diff : Basic
 */
public class SetRightmostBit_CN {
	
	 public int setBit(int N){
	        // code here
			 int check = 1;
			 
			 int num = N | check;
		        while(num == N)
		        {
		        	
		           check = check<<1;
		           num = N | check;
		        }
		        
		        // If all bits are set , then the num will be next power of 2 - return N 
		        if(((N+1)*2)-1 == num ) {
		        	return N;
		        }
		      return num ;
		    }
	

}
