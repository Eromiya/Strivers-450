package com.striver.problems.stacksandqueues.learning;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues_225 {
	
	    Queue<Integer> q1 ;
	    Queue<Integer> q2 ;
	    
	    public ImplementStackUsingQueues_225() {
	        q1 = new LinkedList<Integer>();
	        q2 = new LinkedList<Integer>();
	    
	    }
	    
	    public void push(int x) {
	        if(q1.isEmpty()){
	            q2.add(x);
	        }
	        else{
	            q1.add(x);
	        }
	    }
	    
	    public int pop() {
	        if(!q1.isEmpty()){
	            while(q1.size()!=1){
	                q2.add(q1.remove());
	            }
	            return q1.remove();
	        }else{
	             while(q2.size()!=1){
	                q1.add(q2.remove());
	            }
	            return q2.remove();
	        }
	        
	    }
	    
	    public int top() {
	         if(!q1.isEmpty()){
	            while(q1.size()!=1){
	                q2.add(q1.remove());
	            }
	            int x = q1.remove();
	            q2.add(x);
	            return x;
	        }else{
	             while(q2.size()!=1){
	                q1.add(q2.remove());
	            }
	            int x = q2.remove();
	            q1.add(x);
	            return x;
	        }
	    }
	    
	    public boolean empty() {
	        if(q1.isEmpty() && q2.isEmpty()){
	           return true; 
	        }
	        else{
	            return false;
	        }
	    }
	
	
	
	
}
