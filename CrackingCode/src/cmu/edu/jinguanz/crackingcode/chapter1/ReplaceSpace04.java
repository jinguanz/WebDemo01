package cmu.edu.jinguanz.crackingcode.chapter1;

public class ReplaceSpace04 {
	
	
	public static String replaceSpace(String str){
		int newLength=0, spaceCount=0;
		for(char c:str.toCharArray()){
			if(c==' ') //dan yin hao
				spaceCount++;
		}
		newLength= str.length()+spaceCount*2;
		char[] charArray = new char[newLength];
		//charArray[newLength]='\0';
		for( int i=str.length()-1;i>=0;i--){
			if(str.charAt(i)==' '){
				charArray[newLength-1]='0';
				charArray[newLength-2]='2';
				charArray[newLength-3]='%';
				newLength=newLength-3;
			}else{
				charArray[newLength-1]=str.charAt(i);
				newLength=newLength-1;
			}
		}
		return new String(charArray);
		
		
	}
	public static void main(String args[]){
		String a ="a b ";
		System.out.println("New String " + replaceSpace(a));
		
	}

}
