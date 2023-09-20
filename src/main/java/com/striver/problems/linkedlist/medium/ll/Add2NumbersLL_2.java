package com.striver.problems.linkedlist.medium.ll;

import com.striver.problems.common.ListNode;

/**
 * Leet : https://leetcode.com/problems/add-two-numbers/description/
 * 
 * Difficulty : Medium
 * 
 * Status : Done 100%
 */
public class Add2NumbersLL_2 {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	   ListNode temp1 = l1;
	   ListNode temp2 = l2;
	   
	   ListNode currTemp = null;
	   ListNode prev = null;
	   
	   ListNode head = null;
	 	int rem =0;
	   while (temp1 != null || temp2 != null || rem !=0) {
		   	int val1 =0, val2 =0;
		   	if(temp1!=null) {
		   		val1 = temp1.val;
		   		temp1 = temp1.next;
		   	}
		   	if(temp2!=null) {
		   		val2 = temp2.val;
		   		temp2 = temp2.next;
		   	}
		   	int sum = val1+val2;
		   	int resVal = (sum+ rem)%10;
		   	rem = (sum+ rem)/10 ;
		   	
		   	if(head==null) {
		   		head = new ListNode(resVal);
		   		currTemp = head;
		   	}
		   	else {
		   		ListNode newNode = new ListNode(resVal);
		   		
		   		prev = currTemp;
		   		prev.next = newNode;
		   		currTemp = currTemp.next;
		   		
		   	}
		   
			
		}
	   
	   return head;
	}
	
	public static void main(String[] args) {
		ListNode n1 = new ListNode(9);
		ListNode n4 = new ListNode(1);
		
		ListNode n5 = new ListNode(9);
		n4.next = n5;
		ListNode n6 = new ListNode(9);
		n5.next = n6;
		ListNode n7 = new ListNode(9);
		n6.next = n7;
		ListNode n8 = new ListNode(9);
		n7.next = n8;
		ListNode n9 = new ListNode(9);
		n8.next = n9;
		ListNode n10 = new ListNode(9);
		n9.next = n10;
		ListNode n11 = new ListNode(9);
		n10.next = n11;
		ListNode n12 = new ListNode(9);
		n11.next = n12;
		ListNode n13 = new ListNode(9);
		n12.next = n13;
		ListNode n14 = new ListNode(9);
		n13.next = n14;
		ListNode head = n1;
		ListNode headd = n4;

		System.out.println("-----------XXX----------");
		printList(head);
		printList(headd);
		ListNode head1 = addTwoNumbers(head, headd);
		printList(head1);

		System.out.println("-----------XXXX----------");
		printList(headd);
		printList(head);
		ListNode head2 = addTwoNumbers(headd, head);
		printList(head2);
		
		ListNode n15 = new ListNode(2);

		ListNode n16 = new ListNode(4);
		n15.next = n16;
		ListNode n17 = new ListNode(9);
		n16.next = n17;
		
		ListNode n18 = new ListNode(5);

		ListNode n19 = new ListNode(6);
		n18.next = n19;
		ListNode n20 = new ListNode(4);
		n19.next = n20;
		ListNode head11 = n15;
		ListNode head12 = n18;
		
		System.out.println("-----------XXXXX----------");
		printList(head11);
		printList(head12);
		ListNode head3 = addTwoNumbers(head11, head12);
		printList(head3);
		
		ListNode n25 = new ListNode(9);

		ListNode n26 = new ListNode(9);
		n25.next = n26;
		ListNode n27 = new ListNode(9);
		n26.next = n27;
		ListNode n28 = new ListNode(9);
		n27.next = n28;
		ListNode n29= new ListNode(9);
		n28.next = n29;
		ListNode n30 = new ListNode(9);
		n29.next = n30;
		ListNode n31 = new ListNode(9);
		n30.next = n31;
		
		ListNode n32 = new ListNode(9);

		ListNode n33 = new ListNode(9);
		n32.next = n33;
		ListNode n34 = new ListNode(9);
		n33.next = n34;
		ListNode n35 = new ListNode(9);
		n34.next = n35;
		ListNode head21 = n25;
		ListNode head22 = n32;
		
		System.out.println("-----------XXXXX----------");
		printList(head21);
		printList(head22);
		ListNode head4 = addTwoNumbers(head21, head22);
		printList(head4);
	}
	
	

	static void printList(ListNode ListNode) {
		while (ListNode != null) {
			System.out.print(ListNode.val + " ");
			ListNode = ListNode.next;
		}
		System.out.println();
	}
	
	
}
