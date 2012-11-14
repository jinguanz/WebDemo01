package cmu.edu.jinguanz.amazon;

public class StringToInteger {
	
	/**
	 * Convert String to Integer without using any libraries
	 */
	
	public long stringtToInteger(String str){
		long sum=0;
		int j=0;
		for(int i=str.length()-1;i>=0;i--){
			int temp=str.charAt(i) - '0';
			//sum=(int) (sum+temp*Math.pow(10, j));
			sum=sum+temp*pow(j);
			j++;
		}
		return sum;
	}
	
	public long pow(int b){
		long sum=1;
		for(int i=1;i<=b;i++){
			sum*=10;
		}
		return sum;
	}
	
	public static void main(String args[]){
		String str ="123456";
		System.out.println(new StringToInteger().stringtToInteger(str));
	}

}
