package cmu.edu.jinguanz.amazon;

import java.util.HashMap;
import java.util.Map;

public class RemoveOnceFromArray {
	/**
	 * There is an array of numbers with all the elements appearing twice, 
	 * and one element appearing once. Remove this element.
	 */
	
	public int[] removeOnce(int[] array){
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int number:array){
			if(map.containsKey(number)){
				int time = map.get(number);
				map.put(number, time+1);
			}else{
				map.put(number, 1);
			}
		}
		int[] result = new int[array.length-1];
		int i=0;
		for(int number:map.keySet()){
			int temp=map.get(number);
			if(temp==2){
				result[i++]=number;
				result[i++]=number;
			}
		}
		return result;
		
	}
	
	public static void main(String args[]){
		int[] a ={1,1,2,2,3,3,4};
		int[] remove= new RemoveOnceFromArray().removeOnce(a);
		for(int i:remove){
			System.out.print(i+", ");
		}
	}

}
