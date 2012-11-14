package cmu.edu.jinguanz.crackingcode.chapter3;

import java.util.Stack;

public class StackAscending{
	
	public Stack<Integer> sort(Stack<Integer> r){
		Stack<Integer> s = new Stack<Integer>();
		while(!r.isEmpty()){
			int temp=r.pop();
			while(!s.isEmpty() && s.peek()>temp){
				r.push(s.pop());
			}
			s.push(temp);
		}
		return s;
	}

}
