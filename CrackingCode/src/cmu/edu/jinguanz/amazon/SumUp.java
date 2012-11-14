package cmu.edu.jinguanz.amazon;

import java.util.HashMap;
import java.util.Map;

public class SumUp {
	/**
	 * write a func that takes in array and an int k and find all pairs
       that sum up to k
       Sorted array
	 * @param array
	 * @param x
	 * @return
	 */
	
	public Map<Integer, Integer> findPairSum(int[] array,int x){
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();//sorted array
		int start=0;
		int end=array.length-1;
		while(start<end){
			if((array[start]+array[end])<x)
				start++;
			else if((array[start]+array[end])>x)
				end--;
			else{
				map.put(start, end);
				start++;
				end--;
			}
				
		}
		return map;
	}
	/**
	 * Unsorted array
	 * @param array
	 * @param x
	 * @return
	 */
	public Map<Integer,Integer> getPairSum(int[] array,int x){
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if((array[i]+array[j])==x){
					map.put(i, j);
					break;
				}
					
			}
		}
		return map;
	}
	
	public static void main(String args[]){
		int[] array={5,1,3,9,8,4,7,6,2,0};
		SumUp sum = new SumUp();
		//Map<Integer, Integer> map = sum.findPairSum(array, 10);
		Map<Integer, Integer> map = sum.getPairSum(array, 5);
		for(Integer i:map.keySet()){
			Integer j = map.get(i);
			System.out.println(array[i] +" " + array[j]);
		}
			
		
	}

}
