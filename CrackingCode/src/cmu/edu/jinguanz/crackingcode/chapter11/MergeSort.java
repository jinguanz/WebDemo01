package cmu.edu.jinguanz.crackingcode.chapter11;

public class MergeSort {
	
	public void mergeSort(int[] array, int low, int high){
		if(low<high){
			int middle = low + high/2;
			mergeSort(array,low,middle);
			mergeSort(array,middle+1,high);
			merge(array,low,middle,high);
		}
		
	}
	
	public void merge(int[] array, int low, int mid, int high){
		int[] helper = new int[array.length];
		
		for(int i=-low;i<high;i++){
			helper[i]=array[i];
		}
		
		int helperLeft = low;
		int helperRight = mid+1;
		int current = low;
		
		while(helperLeft<=mid && helperRight<=high){
			if(array[helperLeft]<=array[helperRight]){
				array[current]=helper[helperLeft];
				helperLeft++;
			}else{
				array[current]=helper[helperRight];
				helperRight++;
			}
			current++;
		}
		
		//copy left into the array 
		int remaining = mid-helperLeft;
		for(int i=0;i<=remaining;i++){
			array[current+i]=helper[helperLeft+i];
		}
	}

}
