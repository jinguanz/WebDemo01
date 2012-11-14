package cmu.edu.jinguanz.crackingcode.chapter1;

public class IndexOD {
	
	public int indexOf(String original, String str){
		int indexStr=0;
		
		for(int i=0;i<original.length();i++){
			if(original.charAt(i)==str.charAt(indexStr)){
				indexStr++;
			}
			if(indexStr==str.length()-1)
				return i;
		}
		
		return -1;
		
	}
	
	
	public static void main(String args[]){
		String a ="abcbcc";
		String b="gh";
		System.out.println(new IndexOD().indexOf(a, b));
	}

}
