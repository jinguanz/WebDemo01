package cmu.edu.jinguanz.crackingcode.chapter11;

public class BinarySearch {
	
	public int binarySearch(int[] array, int x){
		int low=0;
		int high = array.length-1;
		int mid;
		
		while(low<=high){
			mid=(low+high)/2;
			if(array[mid]<x)
				low=mid+1;
			else if(array[mid]>x)
				high=mid-1;
			else 
				return mid;
		}
		return -1;//error
	}
	
	public static void main(String args[]){
		int[] a = {4,6,8,9,10}; // a sortex array
		System.out.println("Position: " + new BinarySearch().binarySearch(a, 8));
	}
	
	public int binarySearchRecursive(int[] array, int x, int low, int high){
		if(low>high) return -1;
		
		int mid = (low+high)/2;
		if(array[mid]<x)
			return binarySearchRecursive(array,x,mid+1,high);
		else if(array[mid]>x)
			return binarySearchRecursive(array,x,low,mid-1);
		else
			return mid;
				
		
	}

}
