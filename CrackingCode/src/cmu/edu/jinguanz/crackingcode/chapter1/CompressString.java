package cmu.edu.jinguanz.crackingcode.chapter1;

/**
 * If the string would not become smaller than the original string, method should return original string
 * @author jinguangzhou
 *
 */

public class CompressString {
	
	public static String compress(String str){
		String newString="";
		char last=str.charAt(0);
		int count=1;
		for(int i=1;i<str.length();i++){
			if(str.charAt(i)==last){
				count++;
			}else{
				newString =newString + last +"" +count;
				last=str.charAt(i);
				count=1;
			}
		}
		return newString = newString + last +"" +count; //This is very important. For the last loop
		
	}
	
	public static int compressNumber(String str){
		int count=1,size=0;
		char last = str.charAt(0);
		for(int i=1;i<str.length();i++){
			if(str.charAt(i)==last){
				count++;
			}else{
				last=str.charAt(i);
				size=size + 1 + String.valueOf(count).length();
				count=1;
			}
		}
		return size +1 +String.valueOf(count).length();
		
	}
	
	public static String compressString(String str){
		int number = compressNumber(str);
		if(number>str.length())
			return str;
		int count=1;
		char last = str.charAt(0);
		StringBuffer strBuffer= new StringBuffer();
		for(int i=1;i<str.length();i++){
			if(str.charAt(i)==last)
				count++;
			else{
				last=str.charAt(i);
				strBuffer.append(str.charAt(i));
				strBuffer.append(count);
				count=1;
			}
					
		}
		strBuffer.append(last);
		strBuffer.append(count);
		return strBuffer.toString();
		
	}
	
	
	
	public static void main(String args[]){
		String a ="aaaadffffdssgggg";
		System.out.println("New Strin:" + compressString(a));
	}

}
