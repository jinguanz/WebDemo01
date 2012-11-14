package cmu.edu.jinguanz.amazon;

public class ReverseIntegerArray {
	/**
	 * just reverse an integer of arrays and return it.   
	 */
	
	public int[] reverse(int[] array){
		int length=array.length-1;
		for(int i=0;i<array.length/2;i++){
			int temp=array[i];
			array[i]=array[length-i];
			array[length-i]=temp;
		}
		return array;
	}
	
	public static void main(String args[]){
		int[] a ={1,2,3,4,5};
		int[] result = new ReverseIntegerArray().reverse(a);
		for(int m:result)
			System.out.print(m +", ");
	}

}
