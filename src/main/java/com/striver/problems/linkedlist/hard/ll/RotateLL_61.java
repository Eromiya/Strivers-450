package com.striver.problems.linkedlist.hard.ll;

import com.striver.problems.common.ListNode;

/**
 * Leet : https://leetcode.com/problems/rotate-list/description/
 * 
 * Difficulty : Medium
 * 
 * Status : Done 100% users
 */
public class RotateLL_61 {
	public static ListNode rotateRight(ListNode head, int k) {

		ListNode temp = head;
		ListNode prev = null;

		// Return null if null
		if (head == null) {
			return head;
		}
		
		// Return same if only one node
		if (head.next == null) {
			return head;
		}

		// Calculate the length of the LL
		int lengthOfLL = 0;
		while (temp != null) {
			lengthOfLL++;
			temp = temp.next;

		}

		// In case k is given as large numbers more than the length - optimization
		temp = head;
		k = k % lengthOfLL;
		
		//Reduce k until 0 and right rotate the list
		while (k != 0) {
			while (temp.next != null) {
				prev = temp;
				temp = temp.next;

			}
			prev.next = temp.next;
			temp.next = head;
			head = temp;
			k--;
		}
		
		// Return the head
		return head;

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
		ListNode n6 = new ListNode(6);
		n5.next = n6;
		ListNode n7 = new ListNode(7);
		n6.next = n7;
		ListNode head = n1;

		System.out.println("-----------XXX----------");
		printList(head);
		head = rotateRight(head, 2);
		printList(head);

		System.out.println("-----------XXXX----------");
		printList(head);
		head = rotateRight(head, 200000000);
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
