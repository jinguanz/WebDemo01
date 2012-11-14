package cmu.edu.jinguanz.crackingcode.chapter1;

public class Rotate09 {
	
	public boolean isSubstring(String st1, String str2){
		return false;
	}
	
	public boolean isRotation(String str1, String str2){
		int length = str1.length();
		if(length==str2.length() && length>0){
			String newString = str1+str1;
			return isSubstring(newString, str2);
		}
		return false;
		
	}

}
