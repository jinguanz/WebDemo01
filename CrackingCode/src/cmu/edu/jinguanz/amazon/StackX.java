package cmu.edu.jinguanz.amazon;

import java.util.Queue;

public class StackX {
	private int size;
	private char[] stackArray;
	private int top;

	public StackX(int max) {
		this.size = max;
		stackArray = new char[size];
		top = -1;
	}

	public void push(char x) {
		if (!isFull())
			stackArray[++top] = x;
		else
			System.out.println("The stack is full");

	}

	public char pop() {
		if (!isEmpty())
			return stackArray[top--];
		else{
			System.out.println("The stack is empty");
			return 'e';
		}

	}

	public char peek() {
		if (!isEmpty())
			return stackArray[top];
		else
			return 'e';
	}

	public boolean isEmpty() {
		return (top == -1);

	}

	public boolean isFull() {
		return (top == size - 1);

	}
	
	public static void main(String args[]){
		StackX stack = new StackX(3);
		stack.push('x');
		stack.push('y');
		stack.push('z');
		stack.push('z');
		
		for(char ch:stack.getStackArray())
			System.out.print(ch+", ");
		
		while(!stack.isEmpty()){
			System.out.print(stack.pop() +", ");
		}
		stack.pop();
		
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public char[] getStackArray() {
		return stackArray;
	}

	public void setStackArray(char[] stackArray) {
		this.stackArray = stackArray;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

}
