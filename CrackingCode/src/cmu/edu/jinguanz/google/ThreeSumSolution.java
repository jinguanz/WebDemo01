package cmu.edu.jinguanz.google;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSumSolution {
	/**
	 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? 
	 * Find all unique triplets in the array which gives the sum of zero.
	 * @param num
	 * @return
	 */
	public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Arrays.sort(num);
        if(num==null){
            return null;
        }
       
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<num.length-2;i++){
            int index=i+1;
            int end=num.length-1;
            while(index<end){
            int total=num[i]+num[index]+num[end];
            if(total>0){
                end--;
            }else if(total<0){
                index++;
            }else{
                ArrayList<Integer> list = new ArrayList<Integer>();
                list.add(num[i]);
                list.add(num[index]);
                list.add(num[end]);
                if(!result.contains(list)){
                    result.add(list);
                }
                index++;
                end--;
                    
                }
        }
        }
        return result;
    }
}
