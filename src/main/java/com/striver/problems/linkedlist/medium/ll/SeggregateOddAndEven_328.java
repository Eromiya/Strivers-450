package com.striver.problems.linkedlist.medium.ll;

import com.striver.problems.common.ListNode;

/**
 * Leet : https://leetcode.com/problems/odd-even-linked-list/
 * 
 * Complexity : Medium 
 * 
 * Status : Done
 * 
 */
public class SeggregateOddAndEven_328 {
	
	public static ListNode oddEvenList(ListNode head) {
		ListNode oddPtr=null, evenPtr = null;
		ListNode temp = head;
		ListNode newOddHead = null;
		ListNode newEvenHead = null;
		int i=1;
		while(temp!=null) {
			if(i%2!=0) {
				if(oddPtr==null) {
					newOddHead = temp;
					oddPtr = newOddHead ;
				}
				else {
					oddPtr.next = temp;
					oddPtr = oddPtr.next;
					
				}
			}
			else {
				if(evenPtr==null) {
					newEvenHead = temp;
					evenPtr = newEvenHead;
				}
				else {
					evenPtr.next = temp;
					evenPtr = evenPtr.next;
				}
			}
			temp = temp.next;
			i++;
		}
		evenPtr.next = null;
		oddPtr.next = newEvenHead;
		return newOddHead;
	}

	public static void main(String[] args) {

		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		n1.next = n2;
		ListNode n3 = new ListNode(3);
		n2.next = n3;
		ListNode n4 = new ListNode(4);
		n3.next = n4;
		ListNode n5 = new ListNode(5);
		n4.next = n5;
		ListNode head = n1;

		System.out.println("-----------Input 1----------");
		printList(head);
		System.out.println("-----------Output 1----------");
		head = oddEvenList(head);
		printList(head);


	}

	static void printList(ListNode ListNode) {
		while (ListNode != null) {
			System.out.print(ListNode.val + " ");
			ListNode = ListNode.next;
		}
		System.out.println();
	}
}
