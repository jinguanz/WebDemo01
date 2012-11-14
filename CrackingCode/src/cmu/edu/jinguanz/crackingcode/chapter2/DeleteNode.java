package cmu.edu.jinguanz.crackingcode.chapter2;

public class DeleteNode {
	
	/**
	 * Delete a node in the middle of a singly linked list, given only access to that node
	 * @param node
	 */
	
	public void deleteNode(Node node){
		if(node==null || node.next==null)
			return;
		Node next=n.next;
		n.data=next.data;
		n.next=next.next;
	}

}
