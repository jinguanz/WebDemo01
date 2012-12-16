package cmu.edu.jinguanz.google;

import java.util.ArrayList;

/**
 * Given two array, where each item in the array in a digit of a number,
 *  so, {1,0,1} is number 101 and {1,3,5} = 135, 
 *  create a sum function that takes two arrays and outputs the sum of the array in the given form:
 * A1 = {1,2,3}
 * A2 = {2,2,2}
sum(A1, A2) = {3,4,5}
 * @author jinguangzhou
 *
 */

public class ArraySum {
	
	public ArrayList<Integer> arraySum(int[] a,int[] b){
		ArrayList<Integer> list = new ArrayList<Integer>();
		int m=Math.max(a.length, b.length)-1;
		int length2=Math.min(a.length, b.length)-1;
		int sum=0;
		int carry=0;
		for(;m>=0;m--){
			if(length2>=0){
				sum=a[m]+b[length2]+carry;
				list.add(sum%10);
				carry=sum/10;
				length2--;
			}else{
				sum=a[m]+carry;
				list.add(sum%10);
				carry=sum/10;
			}
			sum=0;
		}
		if(carry!=0){
			list.add(carry);
		}
			
		
		return list;
		
	}
	
	public static void main(String args[]){
		int[] a ={1,2,3,5};
		int[] b={1,2,4,5};
		ArrayList<Integer> list = new ArraySum().arraySum(a, b);
		//System.out.println();
		for(int m=list.size()-1;m>=0;m--){
			System.out.print(list.get(m));
		}
	}

}
