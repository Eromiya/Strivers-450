package com.striver.problems.linkedlist.medium.ll;

import java.util.Stack;

import com.striver.problems.common.ListNode;

/**
 * Leet : https://leetcode.com/problems/palindrome-linked-list/description/
 * 
 * Difficulty : Easy
 * 
 * Status : Done (Beats around 20%)
 * 
 */
public class LLIsPalindrome_234 {
	public static boolean isPalindrome(ListNode head) {
		if (head == null) {
			return true;
		}
		if (head.next == null) {
			return true;
		}
		ListNode temp = head;
		int lengthOfLL = 0;
		while (temp != null) {
			lengthOfLL++;
			temp = temp.next;

		}
		int mid = lengthOfLL / 2;
		int rem = lengthOfLL % 2;

		Stack<Integer> stack = new Stack<>();
		temp = head;
		int count = 0;
		while (count != mid) {
			stack.push(temp.val);
			count++;
			temp = temp.next;
		}

		if (rem != 0) {
			temp = temp.next;
		}

		while (temp != null) {
			if (stack.peek() == temp.val) {
				stack.pop();
				temp = temp.next;
			} else {
				return false;
			}
		}
		if (stack.isEmpty()) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {

		ListNode n1 = new ListNode(2);
		ListNode n2 = new ListNode(3);
		n1.next = n2;
		ListNode n3 = new ListNode(3);
		n2.next = n3;
		ListNode n4 = new ListNode(2);
		n3.next = n4;
		ListNode head = n1;

		System.out.println("-----------Input 1----------");
		printList(head);
		System.out.println("-----------Output 1----------");
		System.out.println(isPalindrome(head));

		ListNode n21 = new ListNode(2);
		ListNode n22 = new ListNode(3);
		n21.next = n22;
		ListNode n23 = new ListNode(4);
		n22.next = n23;
		ListNode n24 = new ListNode(3);
		n23.next = n24;
		ListNode n25 = new ListNode(2);
		n24.next = n25;
		ListNode head2 = n21;

		System.out.println("-----------Input 2----------");
		printList(head2);
		System.out.println("-----------Output 2----------");
		System.out.println(isPalindrome(head2));

		ListNode n11 = new ListNode(12);
		ListNode n12 = new ListNode(13);
		n11.next = n12;
		ListNode head1 = n11;

		System.out.println("-----------Input 3----------");
		printList(head1);
		System.out.println("-----------Output 3----------");
		System.out.println(isPalindrome(head1));

	}

	static void printList(ListNode ListNode) {
		while (ListNode != null) {
			System.out.print(ListNode.val + " ");
			ListNode = ListNode.next;
		}
		System.out.println();
	}
}
