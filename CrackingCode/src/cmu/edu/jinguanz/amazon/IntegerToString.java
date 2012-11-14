package cmu.edu.jinguanz.amazon;

import java.util.Stack;

public class IntegerToString {
     /**
      * Convert Integer to String without use any library
      */
	
	public String integerToString(int a){
		Stack<Integer> stack = new Stack<Integer>();
		while(a>10){
			int temp=a%10;
			stack.push(temp);
			a=a/10;
		}
		stack.push(a);
	  StringBuffer buffer = new StringBuffer();
		while(!stack.isEmpty()){
			buffer.append(stack.pop());
		}
		
		return new String(buffer.toString());
	}
	public static void main(String args[]){
		int a =123450;
		System.out.println(new IntegerToString().integerToString(a) );
	}
}
