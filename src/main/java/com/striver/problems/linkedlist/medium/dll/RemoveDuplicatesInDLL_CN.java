package com.striver.problems.linkedlist.medium.dll;

import com.striver.problems.common.Node;

/**
 * CN : https://www.codingninjas.com/studio/problems/remove-duplicates-from-a-sorted-doubly-linked-list_2420283?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=0
 * CN - has some issue 
 * Geeks : https://practice.geeksforgeeks.org/problems/remove-duplicates-from-a-sorted-doubly-linked-list/1
 * 
 * Status : Done
 */
public class RemoveDuplicatesInDLL_CN {

	public static Node uniqueSortedList(Node head) {
		Node temp = head;
		while (temp != null) {
			if (temp.prev != null && temp.data == temp.prev.data) {
				temp.prev.next = temp.next;
				if (temp.next != null) {
					temp.next.prev = temp.prev;
				}
			}
			temp = temp.next;
		}
		return head;
	}

	public static void main(String[] args) {
		Node n1 = new Node(12);
		Node n2 = new Node(22);
		n1.next = n2;
		n2.prev = n1;
		Node n3 = new Node(22);
		n2.next = n3;
		n3.prev = n2;
		Node n4 = new Node(66);
		n3.next = n4;
		n4.prev = n3;
		Node n5 = new Node(66);
		n4.next = n5;
		n5.prev = n4;
		Node n6 = new Node(69);
		n5.next = n6;
		n6.prev = n5;
		Node n7 = new Node(90);
		n6.next = n7;
		n7.prev = n6;
		Node head = n1;

		printList(head);
		System.out.println("-----------XXX----------");
		uniqueSortedList(head);
		printList(head);
	}

	static void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}

	static Node addNode(Node head_ref, int pos, int data) {
		Node newNode = new Node(data);
		if (pos == 0) {
			head_ref.prev = newNode;
			newNode.next = head_ref;
			head_ref = newNode;
		} else {
			int count = 0;
			Node top = head_ref;
			while (count != pos && top.next != null) {
				top = top.next;
				count++;
			}
			if (count == pos) {
				top.prev.next = newNode;
				top.prev = newNode;
				newNode.next = top;
			}
			return head_ref;
		}
		return head_ref;
	}

}
