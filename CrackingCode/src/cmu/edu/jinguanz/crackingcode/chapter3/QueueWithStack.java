package cmu.edu.jinguanz.crackingcode.chapter3;

import java.util.Stack;

public class QueueWithStack<T> {
	Stack<T> newStack = new Stack<T>();
	Stack<T> oldStack = new Stack<T>();

	public void add(T value) {
		newStack.push(value);
	}

	public void stackShift() {
		if (oldStack.isEmpty()) {
			while (!newStack.isEmpty()) {
				oldStack.push(newStack.pop());
			}
		}
	}
	
	public T peek(){
		stackShift();
		return oldStack.peek();
	}
	
	public T remove(){
		stackShift();
		return oldStack.pop();
	}
	
	

}
