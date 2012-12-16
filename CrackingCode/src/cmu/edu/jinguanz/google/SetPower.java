package cmu.edu.jinguanz.google;

import java.util.ArrayList;

public class SetPower {
	public static  ArrayList<ArrayList<Integer>> powerset(ArrayList<Integer> list) {
		  ArrayList<ArrayList<Integer>> ps = new ArrayList<ArrayList<Integer>>();
		  ps.add(new ArrayList<Integer>());   // add the empty set
		 
		  // for every item in the original list
		  for (Integer item : list) {
		    ArrayList<ArrayList<Integer>> newPs = new ArrayList<ArrayList<Integer>>();
		 
		    for (ArrayList<Integer> subset : ps) {
		      // copy all of the current powerset's subsets
		      newPs.add(subset);
		 
		      // plus the subsets appended with the current item
		      ArrayList<Integer> newSubset = new ArrayList<Integer>(subset);
		      newSubset.add(item);
		      newPs.add(newSubset);
		    }
		 
		    // powerset is now powerset of list.subList(0, list.indexOf(item)+1)
		    ps = newPs;
		  }
		  return ps;
		}
	
	public static void main(String args[]){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		int count=0;
		ArrayList<ArrayList<Integer>> result =new SetPower().powerset(list);
		for(ArrayList<Integer> item : result){
			for(Integer in:item){
				System.out.print(in+", ");
				
			}
			count++;
			System.out.println();
		}
		System.out.print("count: " + count);
	}

}
