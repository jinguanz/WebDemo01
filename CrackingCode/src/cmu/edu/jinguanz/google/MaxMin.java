package cmu.edu.jinguanz.google;

import java.util.ArrayList;

public class MaxMin {
	public ArrayList<Integer> getMinMax(int[] a){
		ArrayList<Integer> result = new ArrayList<Integer>();
		int min=a[0];
		int max=a[0];
		for(int i=1;i<a.length;i++){
			if(a[i]>max){
				max=a[i];
			}
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("max: " + max);
		System.out.println("min: "+ min);
	    return result;
	}
	
	public static void main(String args[]){
		int[] a={2,4,56,7,23,4,7,78,1,-12};
		new MaxMin().getMinMax(a);
	}

}
