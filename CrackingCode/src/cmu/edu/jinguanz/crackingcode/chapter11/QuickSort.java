package cmu.edu.jinguanz.crackingcode.chapter11;

public class QuickSort {

	public void quickSort(int[] array, int left, int right) {
        int index = partition(array,left,right);
        if(left<index)
        	quickSort(array,left,index-1); //sort the left half
        if(right>index)
        	quickSort(array,index+1,right);//sort the right half
	}

	public int partition(int[] array, int left, int right) {
		int pivot = array[(left + right) / 2];
		while (left <= right) {
			while (array[left] < pivot)
				left++;
			while (array[right] > pivot)
				right--;
			if (left <= right) {
				swap(array, left, right);
                left++;
                right--;
			}
		}
		return left;

	}
	
	public void swap(int[] array, int left, int right){
		int temp=0;
		temp=array[left];
		array[left]=array[right];
		array[right]=temp;
	}

	public static void main(String args[]) {
        int[] array ={2,1,-1,5,78,4,0};
        
        QuickSort q =new QuickSort();
        q.quickSort(array,0,array.length-1);
        for(int e:array)
        	System.out.print(e +", ");
        
	}

}
