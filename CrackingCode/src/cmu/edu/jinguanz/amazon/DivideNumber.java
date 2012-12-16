package cmu.edu.jinguanz.amazon;

public class DivideNumber {
	
	/**
	 * divide numbers without using division operator
	 * How to do integer multiplication and division without using multiplication nor division sign.
	 */
	
	public int divideNumber(int a,int b){
		if(a==0) return 0;
		int t=1;
		while(b*t<=a){
			t++;
		}
		return t-1;
	}
	
	/**
	 * Multiply
	 * @param multiplicand
	 * @param factor
	 * @return
	 */
	
	public int multiply(int multiplicand, int factor)
	{
	    if (factor == 0) return 0;
         int sum=0;
	    for (int ii = 0; ii < Math.abs(factor); ++ii) {
	        sum += multiplicand;
	    }

	    return factor >= 0 ? sum : -sum;
	}
	
	public static void main(String args[]){
		System.out.println(new DivideNumber().divideNumber(10, 5));
		System.out.println(new DivideNumber().multiply(10, 5));
	}

}
