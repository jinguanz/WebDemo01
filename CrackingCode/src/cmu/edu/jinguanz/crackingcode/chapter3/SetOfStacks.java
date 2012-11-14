package cmu.edu.jinguanz.crackingcode.chapter3;

import java.util.List;
import java.util.Stack;

public class SetOfStacks {  
	private List<Stack<Integer>> stacks;
	public void push(int value){
		Stack stack = getLastStack();
		if(stack!=null && !stack.isEmpty()){
			stack.push(value);
		}else{
			Stack newStack = new Stack();
			newStack.push(value);
			stacks.add(newStack);
		}
	}
	
	public int pop(){
		Stack stack = getLastStack();
		int value = (int) stack.pop();
		if(stack.size()==0)
			stacks.remove(stacks.size()-1);
		return value;
	}
	
	public Stack getLastStack(){
		return null;
	}

}
