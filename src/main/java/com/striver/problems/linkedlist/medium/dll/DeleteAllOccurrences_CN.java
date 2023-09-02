package com.striver.problems.linkedlist.medium.dll;

import com.striver.problems.common.Node;

/**
 * CN : https://www.codingninjas.com/studio/problems/delete-all-occurrences-of-a-given-key-in-a-doubly-linked-list_8160461?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=0
 * 
 * Geeks : https://practice.geeksforgeeks.org/problems/delete-all-occurrences-of-a-given-key-in-a-doubly-linked-list/1
 *  
 * Status : Done
 */
public class DeleteAllOccurrences_CN {

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


		System.out.println("-----------Input 1----------");
		printList(head);
		System.out.println("-----------Output 1----------");
		head = deleteAllOccurrences(head, 66);
		printList(head);
		head = deleteAllOccurrences(head, 12);
		printList(head);
		head = deleteAllOccurrences(head, 90);
		printList(head);
		
		Node n11 = new Node(12);
		Node n12 = new Node(12);
		n11.next = n12;
		n12.prev = n11;
		Node n13 = new Node(12);
		n12.next = n13;
		n13.prev = n12;
		Node head1 = n11;
		
		
		System.out.println("-----------Input 2----------");
		printList(head1);
		System.out.println("-----------Output 2----------");
		head1 = deleteAllOccurrences(head1, 12);
		printList(head1);
		
	}

	static void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}

	public static Node deleteAllOccurrences(Node head, int k) {
		// Write your code here.
		Node temp = head;
		while (temp != null) {
			if (temp.data == k) {
				if(temp.prev == null) {
					head = head.next;
					if(temp.next !=null) {
						temp.next.prev = null;
					}
				}
				else {
					if (temp.prev != null) {
						temp.prev.next = temp.next;
					}
					if (temp.next != null) {
						temp.next.prev = temp.prev;
						
					}
				}
				
			}
			temp = temp.next;
		}
		return head;
	}
}
