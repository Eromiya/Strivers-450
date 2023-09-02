package com.striver.problems.linkedlist.medium.ll;

import com.striver.problems.common.ListNode;

/**
 * Leet : https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
 * 
 * Difficulty : Medium
 * 
 * Status : Done
 */
public class RemoveNthFromEndOfLL_19 {
	public static void main(String[] args) {

		ListNode n1 = new ListNode(12);
		ListNode n2 = new ListNode(22);
		n1.next = n2;
		ListNode n3 = new ListNode(23);
		n2.next = n3;
		ListNode n4 = new ListNode(64);
		n3.next = n4;
		ListNode n5 = new ListNode(66);
		n4.next = n5;
		ListNode n6 = new ListNode(69);
		n5.next = n6;
		ListNode n7 = new ListNode(90);
		n6.next = n7;
		ListNode head = n1;

		System.out.println("-----------Input 1----------");
		printList(head);
		System.out.println("-----------Output 1----------");
		head = removeNthFromEnd(head, 2);
		printList(head);
		head = removeNthFromEnd(head, 1);
		printList(head);
		head = removeNthFromEnd(head, 3);
		printList(head);
		head = removeNthFromEnd(head, 4);
		printList(head);

		
		ListNode n11 = new ListNode(12);
		ListNode n12 = new ListNode(13);
		n11.next = n12;
		ListNode head1 = n11;

		System.out.println("-----------Input 2----------");
		printList(head1);
		System.out.println("-----------Output 2----------");
		head1 = removeNthFromEnd(head1, 2);
		printList(head1);
	}

	static void printList(ListNode ListNode) {
		while (ListNode != null) {
			System.out.print(ListNode.val + " ");
			ListNode = ListNode.next;
		}
		System.out.println();
	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode temp = head, prev = null;
		int lengthOfLL = 0;
		while (temp != null) {
			lengthOfLL++;
			prev = temp;
			temp = temp.next;

		}
		int delPosition = lengthOfLL - n ;
		temp = head;
		prev = null;
		if(delPosition==0) {
			return head.next;
		}
		while (delPosition != 0) {
			prev = temp;
			temp = temp.next;

			delPosition--;
		}

		if (prev != null) {

			prev.next = temp.next;
		}

		return head;

	}

}
