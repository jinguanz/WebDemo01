package cmu.edu.jinguanz.amazon;

/**
 * Fibonacci Sequence 
 * @author jinguangzhou
 *
 */

public class FibonacciSequence {
	
	public int fibonacciSequence(int number){
		int result=0;
		if(number==1 )
			return 0;
		if(number==2)
			return 1;
		for(int i=3;i<=number;i++){
			result=fibonacciSequence(i-1)+fibonacciSequence(i-2);
		}
		
		return result;
	}
	
	public static void main(String args[]){
		System.out.println(new FibonacciSequence().fibonacciSequence(10));
	}

}
