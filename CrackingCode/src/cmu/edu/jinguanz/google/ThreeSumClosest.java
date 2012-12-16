package cmu.edu.jinguanz.google;

import java.util.Arrays;

public class ThreeSumClosest {
	/**
	 * Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers. 
	 * You may assume that each input would have exactly one solution.
	 * @param num
	 * @param target
	 * @return
	 */
	 public int threeSumClosest(int[] num, int target) {
	        //deal with null situation
	        int diff=Integer.MAX_VALUE;
	        int threeSum=0;
	        Arrays.sort(num);
	        for(int i=0;i<num.length-2;i++){
	            int index=i+1;
	            int end=num.length-1;
	            while(index<end){
	                int total=num[i]+num[index]+num[end];
	                int currentDiff=Math.abs(target-total);
	                if(currentDiff<diff){
	                    threeSum=num[i]+num[index]+num[end];
	                    diff=currentDiff;
	                    index++;
	                }else if(currentDiff==0){
	                    threeSum=num[i]+num[index]+num[end];
	                    return threeSum;
	                }else{
	                    end--;
	                    
	                }
	            }
	        }
	        return threeSum;
	        
	    }//[1,1,-1,-1,3], -1	1	-1 test case cannot work
}
