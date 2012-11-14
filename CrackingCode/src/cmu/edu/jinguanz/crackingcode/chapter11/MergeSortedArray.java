package cmu.edu.jinguanz.crackingcode.chapter11;

public class MergeSortedArray {
	
	public void merge(int[] a, int[] b, int lastA, int lastB){
		int indexA=lastA-1;
		int indexB=lastB-1;
		int mergeIndex=indexA+indexB-1;
		
		while(indexA>=0 && indexB>=0){
			if(a[indexA]>b[indexB]){
				a[mergeIndex]=a[indexA];
				mergeIndex--;
				indexA--;
			}else{
				a[mergeIndex]=b[indexB];
				indexB--;
				mergeIndex--;
			}
		}
		while(indexB>=0){
			a[mergeIndex]=b[indexB];
			mergeIndex--;
			indexB--;
		}
	}

}
