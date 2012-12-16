package cmu.edu.jinguanz.amazon;

import java.util.HashMap;
import java.util.Map;

/**
 * Replace duplicate intergers in an array
 * given an array of numbers to remove the duplicates
 * @author jinguangzhou
 *
 */
public class ReplaceDuplicateInArray {
	/**
	 * use hashmap
	 * @param array
	 * @return
	 */
	
	
	/**
	 *   Given an array A of n integers, in sorted order, and an integer x.
         design an O(n)-time complexity algorithm to determine whether there
         are 2 integers in A whose sum is exactly x. 
	 */
	
	public boolean sum(int[] array,int sum){
		int begin_index=0;
		int end_index=array.length-1;
		while(begin_index<end_index){
			if(array[begin_index]+array[end_index]==sum)
				return true;
			else if(array[begin_index]+array[end_index]>sum)
				end_index--;
			else
				begin_index++;
		}
		return false;
	}
	
	public static void main(String args[]){
		int[] array={1,3,4,5,6,7,8,9};
		if(new ReplaceDuplicateInArray().sum(array, 20)){
			System.out.println("Can find!");
		}else{
			System.out.println("Can not find");
		}
	}

}
