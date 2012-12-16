package cmu.edu.jinguanz.amazon;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

/**
 * Code Fibonacci function in both iterative and recursive.
 * @author jinguangzhou
 *
 */

public class FibonacciSequence {
	
	public int fibonacciSequence(int number){
	  
		if(number==0 )
			return 0;
		if(number==1)
			return 1;
		
			return fibonacciSequence(number-1)+fibonacciSequence(number-2);
		
		
		
	}
	 //recursive Factorial
	public  int FactorialRecursive(int n)
	{
	    if (n <= 1) return 1;
	    return n * FactorialRecursive(n - 1);
	}

	//iterative function calculates n!Factorial
	public int FactorialIterative(int n)
	{
	    int sum = 1;
	    if (n <= 1) return sum;
	    while (n > 1)
	    {
	        sum *= n;
	        n--;
	    }
	    return sum;
	}
	//http://www.codeproject.com/Articles/21194/Iterative-vs-Recursive-Approaches
	
	//--------------- iterative version ---------------------    
	static int FibonacciIterative(int n)
	{
	    if (n == 0) return 0;
	    if (n == 1) return 1;
	        
	    int prevPrev = 0;
	    int prev = 1;
	    int result = 0;
	        
	    for (int i = 2; i <= n; i++)
	    {
	        result = prev + prevPrev;
	        prevPrev = prev;
	        prev = result;
	    }
	    return result;
	}
	    
	//--------------- naive recursive version --------------------- 
	static int FibonacciRecursive(int n)
	{
	    if (n == 0) return 0;
	    if (n == 1) return 1;
	        
	    return FibonacciRecursive(n - 1) + FibonacciRecursive(n - 2);
	}
	    
	//--------------- optimized recursive version ---------------------
	static Map resultHistory = new HashMap();

	static int FibonacciRecursiveOpt(int n)
	{
	    if (n == 0) return 0;
	    if (n == 1) return 1;
	    if (resultHistory.containsKey(n)) 
	        return (int) resultHistory.get(n);

	    int result = FibonacciRecursiveOpt(n - 1) + FibonacciRecursiveOpt(n - 2);
	    resultHistory.put(n, result);
	        
	    return result;
	}
	public static void main(String args[]){
		System.out.println(new FibonacciSequence().fibonacciSequence(10));
		System.out.println(new FibonacciSequence().FactorialRecursive(10));
		System.out.println(new FibonacciSequence().FibonacciRecursiveOpt(10));
		
	}

}
