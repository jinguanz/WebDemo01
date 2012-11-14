package cmu.edu.jinguanz.crackingcode.chapter2;

public class KthNode {
   /**
    * Find the kth to last element of a singly linked list
    */
	
	public LinkedListNode kth(LinkedListNode head, int k){
		if(head==null) return null;
		
		Node p1=head;
		Ndde p2=head;
		
		for(int i=0;i<k;i++){
			if(p2==null) return null;
			p2=p2.next
		}
		
		if(p2==null) return null;
		
		while(p2.next!=null){
			p2=p2.next;
			p1=p1.next;
		}
		return p1;
	}
}
