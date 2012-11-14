package cmu.edu.jinguanz.crackingcode.chapter2;

import java.util.Stack;

public class Palindrome {
	
	public boolean isPalindrome(Node node){
		Node slow = node;
		Node fast = node;
		
		Stack<Integer> stack = new Stack<Integer>();
		
		while(fast!=null || fast.next!=null){
			stack.push(slow.data);
			slow=slow.next;
			fast=fast.next.next;
		}
		//deal with odd
		if(fast!=null){
			slow=slow.next;
		}
		
		while(slow!=null){
			int top=stack.pop();
			if(top!=slow.data)
				return false;
			slow=slow.next;
		}
		return true;
	}

}
