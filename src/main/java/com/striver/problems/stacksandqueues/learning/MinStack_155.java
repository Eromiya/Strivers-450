package com.striver.problems.stacksandqueues.learning;

import java.util.Objects;
import java.util.Stack;

/**
 * Leet : https://leetcode.com/problems/min-stack/
 * 
 * Status : Done 
 * 
 * Complexity : Medium
 */
public class MinStack_155 {
	
	
	//Approach 2 - Using 2 stack - Min Stack and Main Stack
	Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack_155() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        
        if(!minStack.isEmpty() && val<= minStack.peek()){
            minStack.push(val);
        }   
        else if(minStack.isEmpty()){
            minStack.push(val);
        }
        stack.push(val);     
    }
    
    public void pop() {
    	// Point to be noted - == operator was not working for a scenario
        if(Objects.equals(stack.peek(), minStack.peek())){
            minStack.pop();
        }
        stack.pop();
    }
    
    public int top() {
    	if(stack.isEmpty()) {
    		return Integer.MIN_VALUE;
    	}
       return stack.peek();
    }
    
    public int getMin() {
       return minStack.peek();
    }
}
	
/**
 * Approach 1 
 * 
 * Using 2 stack - 1 main stack , 1 temp stack 
 * While popping push all the value to one stack 
 * and find min and push it back to main stack 
 * 
 * Status : Accepted but not optimsed 
 * 	
 */
/**	Stack<Integer> s ;
    int minEle = Integer.MAX_VALUE;
    public MinStack_155() {
        s = new Stack<Integer>();
    }
    
    public void push(int val) {
        if(val<minEle){
            minEle = val;
        }
        s.push(val);
        
    }
    
    public void pop() {
        
        if(minEle == s.peek()){
            minEle = Integer.MAX_VALUE;
            s.pop();
            Stack<Integer> s2 = new Stack<>();
            while(!s.isEmpty()){
                if(s.peek()<minEle){
                   minEle = s.peek();
                }
                s2.push(s.pop());
            }
            while(!s2.isEmpty()){
                s.push(s2.pop());
            }
        }
        else{
            s.pop();
        }

    }
    
    public int top() {
        if(!s.isEmpty()){
            return s.peek();
        }
       return 0;
    }
    
    public int getMin() {
        return minEle;
    }
    }
    */


