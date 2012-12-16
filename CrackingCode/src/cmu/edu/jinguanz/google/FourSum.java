package cmu.edu.jinguanz.google;

import java.util.ArrayList;
import java.util.Arrays;

public class FourSum {
	
	public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
		//n*n*n*n
		//find a better algorithm
        Arrays.sort(num);
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                for(int k=j+1;k<num.length;k++){
                    for(int m=k+1;m<num.length;m++){
                        if(num[i]+num[j]+num[k]+num[m]==target){
                            ArrayList<Integer> list=new ArrayList<Integer>();
                            list.add(num[i]);
                            list.add(num[j]);
                            list.add(num[k]);
                            list.add(num[m]);
                            if(!result.contains(list)){
                                result.add(list);
                            }
                            
                        }
                    }
                }
            }
        }
        return result;
        
    }

}
