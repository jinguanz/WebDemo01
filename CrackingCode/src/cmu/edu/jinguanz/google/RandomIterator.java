package cmu.edu.jinguanz.google;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * Implement a method (in java) that takes an Iterator<T> iterator and an int sampleSize 
 * and returns a random sample no larger than sampleSize from the iterator.
 * @author jinguangzhou
 *
 */

public class RandomIterator {
	
	public <T> ArrayList<T> getRandom(Iterator<T> iterator,int sampleSize){
		ArrayList<T> result = new ArrayList<T>();
		ArrayList<T> copy = new ArrayList<T>();
		Random r = new Random();
		int count=0;
		while(iterator.hasNext()){
			copy.add(iterator.next());//copy elements from the iterator to a new arraylist
			count++;
		}
		if(count<sampleSize){
			System.out.println("No result");
			return null;
		}
		for(int i=0;i<sampleSize;i++){
			T t = copy.get(r.nextInt(copy.size()));
			result.add(t);
		}
		for(T t:result)
			System.out.println(t);
		return result;
		
	}
	
	public static void main (String args[]){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(6);
		list.add(10);
		list.add(123);
		int sampleSize=4;
		new RandomIterator().getRandom(list.iterator(), sampleSize);
	}
	
	

}
