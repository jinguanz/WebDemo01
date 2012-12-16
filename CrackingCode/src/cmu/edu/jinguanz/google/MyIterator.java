package cmu.edu.jinguanz.google;
/**
 * implement hasNext() and next() methods like the Java collection iterator's, 
 * but hasNext() checks if collection has negative value only, 
 * and next() only return negative (assume collection has intergers)
 * @author jinguangzhou
 *
 */

public class MyIterator{
	Integer[] arr;
	   int currPos;
	   int negPos;
	   int size;
	  public boolean hasNext(){
	    for(int i = currPos+1; i<size;i++){
	        if(arr[i] < 0){
	            if(negPos != i) negPos = i;
	            return true;
	        }
	    }
	   return false;
	  }
	  public Integer next(){
	       if(hasNext()){
	           currPos = negPos;
	            return arr[currPos];
	       }
	   return null;
	 }

}
