package cmu.edu.jinguanz.crackingcode.chapter11;

public class LowToHigh {
	
	public void change(int[] array,int x){
		int low=0;
		int high=array.length-1;
		while(low<=high){
			while(array[low]<=x) low++;
			while(array[high]>x) high--;
			if(low<=high){
				swap(array,low,high);
				low++;
				high--;
			}
		}
	}
	
	public void swap(int[] array, int low,int high){
		int temp=array[low];
		array[low]=array[high];
		array[high]=temp;
	}
	
	public static void main(String args[]){
		int[] array = {1,-1,10,12,13,5,7,8,-2,-3,9};
		LowToHigh  l = new LowToHigh();
		l.change(array, 0);
		for(int e:array)
			System.out.print(e +", ");
	}

}
