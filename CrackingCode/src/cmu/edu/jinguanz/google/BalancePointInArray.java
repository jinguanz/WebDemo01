package cmu.edu.jinguanz.google;

public class BalancePointInArray {
	/**
	 * Find the balance point in an array
	 */
	public int findBalance(int[] array){
		int beforeBalance=0;
		int afterBalance=0;
		for(int i=1;i<array.length;i++){
			for(int j=i-1;j<i;j++){
				beforeBalance+=array[j];
			}
			for(int k=i+1;k<array.length;k++){
				afterBalance+=array[k];
			}
			if(beforeBalance==afterBalance){
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String args[]){
		int[] a={3,4,5,6,6,6};
		System.out.println(new BalancePointInArray().findBalance(a));
	}

}
