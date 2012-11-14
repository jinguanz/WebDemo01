package cmu.edu.jinguanz.amazon;

public class LinkList {
    private Link first;
    
    public LinkList(){
    	first=null;
    }
    public boolean isEmpty(){
    	return first==null;
    }
    
    public void insertFirst(int id, double dd){
    	Link newLink = new Link(id,dd);
    	newLink.next =first;
    	first=newLink;
    }
    
    public Link deleteFirst(){
    	Link temp=first;
    	first=first.next;
    	return temp;
    }
    
    public void display(){
    	System.out.println("List (first -->last): ");
    	Link current=first;
    	while(current!=null){
    		current.display();
    		current=current.next;
    	}
    }
    
    public Link reverse(Link head) {
    	  // if head is null or only one node, it's reverse of itself.
    	  if ( (head==null) || (head.next == null) ) return head;

    	  // reverse the sub-list leaving the head node.
    	  Link reverse = reverse(head.next);

    	  // head.next still points to the last element of reversed sub-list.
    	  // so move the head to end.
    	  head.next.next = head;

    	  // point last node to nil, (get rid of cycles)
    	  head.next = null;
    	  return reverse;
    	}
    
    
    public void Reverse()
    {
        if (first != null)
            first = RecursiveReverse(null, first); //previous current
    }

    private Link RecursiveReverse(Link prev, Link curr)
    {
        Link next = curr.next;
        curr.next = prev;
        return (next == null) ? curr : RecursiveReverse(curr, next);
    }
    
    public static void main(String args[]){
    	LinkList list = new LinkList();
    	list.insertFirst(1, 1);
    	list.insertFirst(2, 2);
    	list.insertFirst(3, 3);
    	list.insertFirst(4, 4);
    	
    	list.display();
    	System.out.println();
    	Link first =list.reverse(list.first);
    	while(first!=null){
    		first.display();
    		first=first.next;

    	}
    	
    }
}
