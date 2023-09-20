package com.striver.problems.linkedlist.medium.ll;

import java.util.ArrayList;
import java.util.List;

import com.striver.problems.common.ListNode;

/**
 * GFG : https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1
 * 
 * Difficulty : Medium
 * 
 * Status : Done (But not optimized)
 */
public class Add1ToNumberLL_CN {
	public static ListNode addOne1(ListNode head) {
		// Calculate the length of the LL
		int lengthOfLL = 0;

		if (head == null) {
			return null;
		}
		ListNode temp = head;
		ListNode prev = null;
		double number = 0;
		int lastEle = 0;

		// Length and Digit Formation
		while (temp != null) {
			lengthOfLL++;
			number = number * 10 + temp.val;
			lastEle = temp.val;
			prev = temp;
			temp = temp.next;
		}

		if (lastEle != 9) {
			prev.val = lastEle + 1;
			return head;
		}

		number = number + 1;
		int m = lengthOfLL;
		double num = number;
		ListNode head1 = null;
		ListNode temp1 = null;
		while (m > 0) {
			double quo = num / Math.pow(10, m - 1);
			ListNode newNode = new ListNode((int) quo);
			if (temp1 == null) {
				head1 = newNode;
				temp1 = head1;
			}
			temp1.next = newNode;
			temp1 = temp1.next;
			num = num % Math.pow(10, m - 1);
			m--;
		}
		return head1;
	}

	public static ListNode addOne2(ListNode head) {
		// Calculate the length of the LL
		int lengthOfLL = 0;

		if (head == null) {
			return null;
		}
		ListNode temp = head;
		ListNode prev = null;
		double number = 0;
		int lastEle = 0;

		// Length and Digit Formation
		while (temp.next != null) {
			lengthOfLL++;
//			number = number * 10 + temp.val;
//			lastEle = temp.val;
			prev = temp;
			temp = temp.next;
		}

		lastEle = temp.val;
		if (lastEle != 9) {
			temp.val = lastEle + 1;
			return head;
		} else {

		}

		number = number + 1;
		int m = lengthOfLL;
		double num = number;
		ListNode head1 = null;
		ListNode temp1 = null;
		while (m > 0) {
			double quo = num / Math.pow(10, m - 1);
			ListNode newNode = new ListNode((int) quo);
			if (temp1 == null) {
				head1 = newNode;
				temp1 = head1;
			}
			temp1.next = newNode;
			temp1 = temp1.next;
			num = num % Math.pow(10, m - 1);
			m--;
		}
		return head1;
	}

	public static ListNode addOne(ListNode head) {

		if (head == null) {
			return null;
		}
		ListNode temp = head;
		ListNode prev = null;
		
		//Push Elements to List
		List<Integer> digits = new ArrayList<>();
		while (temp != null) {

			digits.add(temp.val);
			prev = temp;
			temp = temp.next;
		}
		
		ListNode resultHead = null;
		int n = digits.size();
		
		//Only last digit change
		if (digits.get(n - 1) != 9) {
			prev.val = digits.get(n - 1) + 1;
			return head;
		} 
		else {
			int rem = 1;
			int num = 0;
			for (int i = n - 1; i >= 0 && rem != 0; i--) {
				if (i == n - 1) {

					num = digits.get(i) + rem;
					digits.set(i, 0);

				} else {
					num = digits.get(i) + rem;
					digits.set(i, num % 10);
				}
				rem = num / 10;
			}
			// NewNode to be added at beginning - As reminder is 1
			if (rem != 0) {
				int[] newArr = new int[n + 1];
				newArr[0] = 1;
				for (int i = 1; i <= n; i++) {
					newArr[i] = digits.get(i - 1);
				}
				ListNode resTemp = null;
				for (int i : newArr) {
					if (resultHead == null) {
						resultHead = new ListNode(i);
						resTemp = resultHead;
					} else {
						ListNode newNode = new ListNode(i);

						resTemp.next = newNode;
						resTemp = resTemp.next;
					}
				}
				return resultHead;
			}
		}
		ListNode resTemp = null;
		for (int i : digits) {
			if (resultHead == null) {
				resultHead = new ListNode(i);
				resTemp = resultHead;
			} else {
				ListNode newNode = new ListNode(i);

				resTemp.next = newNode;
				resTemp = resTemp.next;
			}
		}

		return resultHead;

	}

	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		n1.next = n2;
		ListNode n3 = new ListNode(3);
		n2.next = n3;

		ListNode n4 = new ListNode(9);
		
		ListNode n5 = new ListNode(9);
		n4.next = n5;	
		ListNode n6 = new ListNode(9);
		n5.next = n6;
		ListNode n7 = new ListNode(9);
		n6.next = n7;
		ListNode head = n1;
		ListNode headd = n4;

		System.out.println("-----------XXX----------");
		printList(head);
		ListNode head1 = addOne(head);
		printList(head1);

		System.out.println("-----------XXXX----------");
		printList(headd);
		ListNode head2 = addOne(headd);
		printList(head2);
	}

	static void printList(ListNode ListNode) {
		while (ListNode != null) {
			System.out.print(ListNode.val + " ");
			ListNode = ListNode.next;
		}
		System.out.println();
	}

}
