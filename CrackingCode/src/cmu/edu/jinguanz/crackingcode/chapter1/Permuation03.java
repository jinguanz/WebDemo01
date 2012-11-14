package cmu.edu.jinguanz.crackingcode.chapter1;

public class Permuation03 {
	
	public static String sort(String str){
		char[] content = str.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}
	
	public static boolean permuation(String str1, String str2){
		if(str1.length()!=str2.length()) 
			return false;
		 return sort(str1).equals(sort(str2));
	}
	
	public static boolean isPermuation(String str1, String str2){
		if(str1.length()!=str2.length())
			return false;
		int[] letters = new int[256];
		for(char c:str1.toCharArray()){
			letters[c]++;
		}
		for(char c:str2.toCharArray()){
			if(--letters[c]<0)
				return false;
		}
		return true;
	}
	
	
	
	
	public static void main(String args[]){
		String a ="abcdddddd";
		String b ="bcadddddc";
		if(isPermuation(a ,b))
			System.out.println("Anagrams");
		else
			System.out.println("Not anagrams");
	}

}
