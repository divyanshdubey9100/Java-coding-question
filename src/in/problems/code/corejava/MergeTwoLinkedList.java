package in.problems.code.corejava;

import in.problems.code.commons.LinkedListNode;

public class MergeTwoLinkedList {
	
	public static LinkedListNode  doListMerge(LinkedListNode l1,LinkedListNode l2) {
		LinkedListNode head=new LinkedListNode(0);
		LinkedListNode cur=head;
		while(l1 != null || l2 != null) {
			if(l1.val < l2.val) {
				cur.next=l1;
				l1=l1.next;
			}else {
				cur.next= l2;
				l2= l2.next;
			}
			cur=cur.next;
		}
		cur.next = l1 != null ? l1 : l2;
		return head.next;
	}

}
