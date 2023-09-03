package com.striver.problems.linkedlist.medium.ll;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

import com.striver.problems.common.Node;

/**
 * Geeks : https://practice.geeksforgeeks.org/problems/find-length-of-loop/1
 * 
 * Difficulty : Easy
 * 
 * Status : Done
 */
public class LengthOfLoop_CN {
	
	
	public static int countNodesinLoop(Node head)
    {
		if ( head == null )
	    {
			return 0;
	    }
	    Node tempNode = head;
	    Set<Node> newSet = new HashSet<>();
	    Stack<Node> stack = new Stack<>();
	    while ( tempNode.next != null )
	    {
	      if ( newSet.contains( tempNode ) )
	      {
	    	  int count =0;
	    	  // After finding the point of next rotation, pop out from stack until finding the current element(Start of next cycle)
		      // Parallelly increasing the count
	    	  while(stack.peek()!=tempNode) {
	    		  stack.pop();
	    		  count++;
	    	  }
	    	  return count +1;
	      }
	      else
	      {
	    	// Adding elements into set to find the start of next rotation of the cycle
	        newSet.add( tempNode );
	        // Pushing elements into stack to find the length 
	        
	        stack.push(tempNode);
	        tempNode = tempNode.next;
	      }
	    }
	    return 0;
    }

	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		n1.next = n2;
		Node n3 = new Node(3);
		n2.next = n3;
		Node n4 = new Node(4);
		n3.next = n4;
		Node n5 = new Node(5);
		n4.next = n5;
		Node n6 = new Node(6);
		n5.next = n2;
		Node n7 = new Node(7);
		n6.next = n7;
		Node head = n1;

		System.out.println("-----------XXX----------");
		System.out.println(countNodesinLoop(head));
	}

}
