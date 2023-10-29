package com.striver.problems.linkedlist.medium.ll;

import com.striver.problems.common.ListNode;

/**
 * Leet : https://leetcode.com/problems/sort-list/submissions/
 * 
 * Complexity : Medium
 * 
 * Status : Done
 */
public class SortLL_148 {

	public static ListNode sortList(ListNode head) {
        ListNode slow = head, fast = head, prev =null;
        if(head==null || head.next == null){
            return head;
        }

        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next=null;
        //Divide 
        ListNode l1=sortList(head);
        ListNode l2=sortList(slow);

        //Conquer
        return merge(l1, l2);
    }

    public static ListNode merge(ListNode l1, ListNode l2) {
    	ListNode l3Head = new ListNode(-1);
    	ListNode l3 = l3Head;
    	while(l1!=null && l2!=null) {
    		if(l1.val<l2.val) {
    			l3.next = l1;
    			l1 = l1.next;
    		}
    		else {
    			l3.next = l2;
    			l2 = l2.next;
    		}
    		l3 = l3.next;
    	}
    	
    	if(l1!=null) {
    		l3.next = l1;
    	}
    	if(l2!=null) {
    		l3.next = l2;
    	}
    	
    	return l3Head.next;
    }
	
	public static void main(String[] args) {

		ListNode n1 = new ListNode(111);
		ListNode n2 = new ListNode(20);
		n1.next = n2;
		ListNode n3 = new ListNode(13);
		n2.next = n3;
		ListNode n4 = new ListNode(4);
		n3.next = n4;
		ListNode n5 = new ListNode(5);
		n4.next = n5;
		ListNode head = n1;

		System.out.println("-----------Input 1----------");
		printList(head);
		System.out.println("-----------Output 1----------");
		head = sortList(head);
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
