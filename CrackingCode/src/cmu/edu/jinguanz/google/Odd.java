package cmu.edu.jinguanz.google;

public class Odd {
	/**
	 * Decide a number is a odd or not
	 * @param x
	 * @return
	 */
	
	public boolean isOdd(long x){
		long temp=x%2;
		if(temp==0)
			return false;
		else
			return true;
	}
	
	public static void main(String args[]){
		long x =-11;
		boolean flag=new Odd().isOdd(x);
		if(flag)
			System.out.println("Odd");
		else
			System.out.println("Even");
	}
	
	public static boolean isOdd(int i) {
	    return (i&1) != 0;
	}
	
	public static boolean isEven(int i) {
	    return (i&1) == 0;
	}

}
