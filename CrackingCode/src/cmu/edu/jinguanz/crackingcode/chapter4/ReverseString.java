package cmu.edu.jinguanz.crackingcode.chapter4;

public class ReverseString {
	
  public static String reverseString(String array){
	  String[] result = array.split(" ");
      StringBuffer strBuffer = new StringBuffer();
	  for(String str:result){
		  char[] ch = str.toCharArray();
		  for(int i=0;i<str.length()/2;i++){
			  char temp = ch[i];
			  ch[i]=ch[str.length()-1-i];
			  ch[str.length()-1-i]=temp;
		  }
		  strBuffer.append(ch);
		  strBuffer.append(" ");
	  }
	  return strBuffer.toString();
  }
  
  public static void main(String args[]){
	  String a ="apple banana man women";
	  System.out.println("String: " + reverseString(a));
  }
}
