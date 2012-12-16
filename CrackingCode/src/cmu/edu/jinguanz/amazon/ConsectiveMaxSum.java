package cmu.edu.jinguanz.amazon;

public class ConsectiveMaxSum {
	
	public int getMaxSum(int[] a){
		int maxSum=0;
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum=sum+a[i];
			if(maxSum<sum){
				maxSum=sum;
			}
	        if(sum<0){
	        	sum=0;
	        }
		}
		return maxSum;
		
	}
	
	public static void main(String args[]){
		int[] a = {-2,4,-5,-1,2,-4};
		System.out.println(new ConsectiveMaxSum().getMaxSum(a));	
	}

}
