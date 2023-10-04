package com.striver.problems.stacksandqueues.monotonicstackqueues;

import java.util.Stack;

/**
 * Leet : https://leetcode.com/problems/next-greater-element-i/description/
 * 
 * Status : Done
 * 
 * Complexity : Easy
 * 
 * Comments : Passed but not optimised
 * 
 */
public class NextGreaterElement1_496 {
	/**
	 * Approach 1 (Passed but not optimised)
	 * 1. Push all the elements in stack1 in reverse order
	 * 2. Loop through the input array 
	 * 2.1 - > add a loop until the same element is found in the stack
	 * 2.2 - > Also pop from stack1 to stack2(tempStack)
	 * 2.3 - > start to find the greater element from there till the stack is empty.
	 * 2.4 - > If greater element is found. Add to result array else add -1
	 * 3. Push back all the elements from tempStack to stack1
	 * 
	 * 
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[nums1.length];
        for(int i=nums2.length-1;i>=0;i--){
                stack.push(nums2[i]);
            
        }

        for(int i=0;i<nums1.length;i++){
            Stack<Integer> tempStack = new Stack<>();
            while(!stack.isEmpty() && nums1[i]!= stack.peek()){
                tempStack.push(stack.pop());
            }
            int res =-1;
            if(!stack.isEmpty() && nums1[i]==stack.peek()){
                tempStack.push(stack.pop());
                while(!stack.isEmpty() && nums1[i]>=stack.peek()){
                    tempStack.push(stack.pop());
                }
                if(!stack.isEmpty() && nums1[i]<stack.peek()){
                    res = stack.peek();
                    
                }
                while(!tempStack.isEmpty()){
                        stack.push(tempStack.pop());
                    }
            }
            result[i] = res;

        }
        return result;
    }

}
