package cmu.edu.jinguanz.amazon;

import java.util.Stack;

/**
 * Implement a Queue data structure and provide enQ and deQ functionality 
 * where the only data structure you have to use is stack.
 * @author jinguangzhou
 * Use two stack to implement a queue
 */

public class StackQueue {
	Stack stack1;
	Stack stack2;
	
	public StackQueue(){
		stack1= new Stack();
		stack2= new Stack();
	}
	
	public void enQueue(int number){
		stack1.push(number);
	}
	
	public int deQueue(){
		shift();
		return (int) stack2.pop();
	}
	
	public void shift(){
		if(stack2.isEmpty()){
			while(!stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
		}
	}
	

}
