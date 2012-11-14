package cmu.edu.jinguanz.crackingcode.chapter2;

import java.util.Hashtable;

public class RedeuceDuplicate {
	
	public void reduceDeuplicate(LinkedListNode node){
		Hashtable table = new Hashtable();
		LinkedListNode previous = null;
		while(node!=null){
			if(table.containsKey(n.data)){
				previous.next=n.next;
			}else{
				table.put(n.data, true);
				previous=n;
			}
			n=n.next;
		}
		
	}
	
	/**
	 * No buffer allowed
	 */
	
	public void reduceDuplicate(LinkListNode head){
		if(head==null) return;
		
		LinklistNode current = head;
		while(current!=null){
			LinkListNode runner = current;
			while(runner.next!=null){
				if(runner.data=runner.next.data)
					runner.next=runner.next.next;
				else
					runner=runner.next;
			}
			current=current.next;
		}
	}

}
