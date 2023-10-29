package com.striver.problems.linkedlist.hard.ll;

import java.util.HashMap;
import java.util.Map;

import com.striver.problems.common.ListNode;

/**
 * Leet : https://leetcode.com/problems/reverse-nodes-in-k-group/description/
 * 
 * Status : Done
 * 
 * Complexity : Hard
 */
public class ReverseNodesInKGroup_25 {

	public static ListNode reverseKGroup(ListNode head, int k) {
		Map<Integer, ListNode> map = new HashMap<>();
		int lengthOfLL = 0;
		int partitionCount = 0;
		ListNode temp = head;
		while (temp != null) {
			lengthOfLL++;
			if (lengthOfLL % k == 0) {
				partitionCount++;
				map.put(partitionCount, temp);
			}
			temp = temp.next;
		}
		temp = head;
		ListNode temp1 = temp;
		for (int i = 1; i <= partitionCount; i++) {
			if (i == 1) {
				head = reverseInKNodes(temp, map.get(i).next, temp1);
			} else {
				ListNode tempTemp = temp1.next;
				temp1.next = reverseInKNodes(tempTemp, map.get(i).next, temp1);
				temp1 = tempTemp;
			}

		}
		return head;
	}

	public static ListNode reverseInKNodes(ListNode head, ListNode endNode, ListNode temp1) {
		if (head == endNode) {
			return head;
		}
		if (head.next == endNode) {
			return head;
		}

		ListNode newHeadNode = reverseInKNodes(head.next, endNode, temp1);
		head.next.next = head;
		head.next = endNode;

		return newHeadNode;
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
		ListNode n8 = new ListNode(8);
		n7.next = n8;
		ListNode n9 = new ListNode(9);
		n8.next = n9;
		ListNode n10 = new ListNode(10);
		n9.next = n10;
		ListNode n11 = new ListNode(11);
		n10.next = n11;
		ListNode n12 = new ListNode(12);
		n11.next = n12;
		ListNode head = n1;

		System.out.println("-----------XXX----------");
		printList(head);
//		head = rotateRight(head, 2);
		head = reverseKGroup(head, 4);
		printList(head);

		System.out.println("-----------XXXX----------");
		printList(head);
//		head = rotateRight(head, 200000000);
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
