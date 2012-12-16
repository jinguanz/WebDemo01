package cmu.edu.jinguanz.google;

public class Median {
	/**
	 * Odd even
	 * @param array
	 * @return
	 */
	public double findMedian(int[] array){
		double median=-1;
		if(array.length%2==0){//even
			median=0.5*(array[array.length/2]+array[array.length/2+1]);
		}else{
			median=array[(array.length+1)/2-1];
		}
		return median;
	}
	
	public static void main(String args[]){
		int[] array ={1,2,3,4,5};
		System.out.print(new Median().findMedian(array));
	}

}
