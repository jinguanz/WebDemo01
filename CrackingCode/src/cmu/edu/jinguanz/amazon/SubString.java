package cmu.edu.jinguanz.amazon;
/**
 * Decide whether a string is a substring of another
 * @author jinguangzhou
 *
 */

public class SubString {
	
	public boolean isSubString(String str1,String str2){
		boolean match=true;
		if(str1.length()<str2.length()) return false;
		if(str1.length()==str2.length() && str1.equals(str2)) return true;
			for(int j=0;j<str1.length()-str2.length()+1;j++){// condition is important
				for(int i=0;j<str2.length();i++){
					if(str1.charAt(j)==str2.charAt(i)){
						j++;
					}else{
						match=false;
						break;
					}
				}
				if(match)
					break;
				
			}
			return match;
			
		
	}
	public static void main(String args[]){
		String a ="apple";
		String b="apcp";
		if(new SubString().isSubString(a, b))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
