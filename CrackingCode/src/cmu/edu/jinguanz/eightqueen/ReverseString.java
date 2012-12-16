package cmu.edu.jinguanz.eightqueen;

public class ReverseString {
	/**
	 * Reverse a String
	 * @param str
	 * @return
	 */
	
	public char[] reverseString(String str){
		int middle = str.length()/2;
		char[] array = str.toCharArray();
		for(int i=0;i<middle;i++){
			char temp=array[i];
			array[i]=array[str.length()-1-i];
			array[str.length()-1-i]=temp;	
		}
		return array;
	}
	
	public static void main(String args[]){
		String a ="123456";
		System.out.print("Reverse String: ");
		for(char c:new ReverseString().reverseString(a)){
			System.out.print(c);
		}
	}

}
