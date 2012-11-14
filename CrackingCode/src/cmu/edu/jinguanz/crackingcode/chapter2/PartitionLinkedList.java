package cmu.edu.jinguanz.crackingcode.chapter2;

public class PartitionLinkedList {

	public Node partition(Node node, int x) {
		Node beforeStart = null;
		Node beforeEnd = null;
		Node afterStart = null;
		Node afterEnd = null;
		if (node == null)
			return null;

		while (node != null) {
			if (node.data < x) {
				if (beforeStart == null) {
					beforeStart = node;
					beforeEnd = beforeStart;
				} else {
					beforeEnd.next = node;
					beforeEnd = node;
				}
			} else {
				if (afterStart == null) {
					afterStart = node;
					afterEnd = afterStart;
				} else {
					afterEnd.next = node;
					afterEnd = node;
				}
			}
			node = node.next;
		}
		if (beforeStart == null)
			return afterStart;

		beforeEnd.next = afterStart;
		return beforeStart;
	}

	public Node partion02(Node head, int x) {
		Node beforeStart = null;
		Node afterStart = null;

		if (head == null)
			return null;
		while (head != null) {
			if (head.data < x) {
				head.next = beforeStart;
				beforeStart = head;
			} else {
				head.next = afterStart;
				afterStart = head;
			}
			head = head.next;
		}
		// Merget
		if (beforeStart == null)
			return afterStart;
		while(beforeStart!=null){
			beforeStart=beforeStart.next;
		}
		beforeStart.next=afterStart;
		
		return head;

	}
}
