package cmu.edu.jinguanz.google;

public class ReverseString {
	
	public String reverseWord(String str){
		String[] result =str.split(" ");
		StringBuffer buffer = new StringBuffer();
		int middle=result.length/2;
		for(int i=0;i<middle;i++){
			String temp=result[i];
			result[i]=result[result.length-i-1];
			result[result.length-i-1]=temp;
		}
		for(String s:result){
			buffer.append(s +" ");
		}
		return buffer.toString();
	}
	
	public static void main(String args[]){
		String a ="I am a student";
		String reverse = new ReverseString().reverseWord(a);
		System.out.println(reverse);
	}

}
