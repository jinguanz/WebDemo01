package cmu.edu.jinguanz.amazon;

public class SquareRoot {
      /**
       * Cannot deal with non-integer
       * @param n
       * @return
       */
	public static double sqrt(double n) {
		double lower = 0;
		double upper = n;
		while (true) // what does this mean?
		{
			double mid = (lower + upper) / 2;
			if (mid * mid < n)
				lower = mid;
			else if (mid * mid > n)
				upper = mid;
			else
				return (lower + upper) / 2;
		}

	}
	
	public static double sqrt2(double n){
		if(n<0) return-1;
		if(n==0||n==1) return n;
		double precision=0.000001;
		double start=0;
		double end=n;
		if(n<1)
			end=1;
		while(end-start>precision){
			double mid =(start+end)/2;
			if(mid*mid==n)
				return mid;
			else if(mid*mid<n)
				start=mid;
			else
				end=mid;
			
		}
		return (start+end)/2;
	}
	
	/***
	 * This is the best method
	 * @param x
	 * @return
	 */

	public static int squareRoot(double x) {
		double precision = 0.00001;
		double base = 0;
		double increment = 1;
		while (increment > precision) {
			double diff = base * base - x;
			if (diff < 0) {
				base += increment;
			} else if (diff > 0) {
				base -= increment;
				increment /= 2;
			} else {
				break;
			}
		}
		return (int) base;
	}

	public static void main(String args[]) {
		//System.out.println(SquareRoot.sqrt(17));
		System.out.println(SquareRoot.squareRoot(2000));
		//System.out.println(SquareRoot.sqrt2(3));
		//System.out.println(Math.sqrt(3));
	}

}
