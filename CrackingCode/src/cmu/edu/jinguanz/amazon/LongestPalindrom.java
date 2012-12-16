package cmu.edu.jinguanz.amazon;

/**
 * Find the length of the longest palindrom in a given string
 * 
 * @author jinguangzhou
 * 
 */

public class LongestPalindrom {

	public boolean isPalinfrom(String str) {
		char[] ch = str.toCharArray();
		int start = 0;
		int end = str.length() - 1;
		int mid = (start + end) / 2;
		for (int i = 0; i < mid; i++) {
			if (ch[i] != ch[end - i])
				return false;
		}
		return true;
	}
	/**
	 * Reverse a string and find the longest same string
	 * @param str
	 * @return
	 */
	
	public int longestPalindrom(String str){
		String reverse = reverse(str);
		System.out.println("Reverse: " +reverse);
		System.out.println("Length: " + reverse.length());
		int maxLength=1;
		int length=1;
		for(int i=0;i<str.length();i++){
			int pointer=i;
			for(int j=0;j<reverse.length()-i;j++){
				if(str.charAt(pointer)==reverse.charAt(j)){
					pointer++;
					length++;;
				}	
				else
				{
					//pointer=i;
					break;
				}
					
			}
			maxLength = maxLength<length ? length :maxLength;
			length=0;
		}
		return maxLength;
		
	}
	
	public String reverse(String str){
		char[] ch =str.toCharArray();
		int mid=(0+str.length()-1)/2;
		for(int i=0;i<=mid;i++){
			swap(ch,i,str.length()-i-1);
		}
		return new String(ch);
		
	}
	public void swap(char[] array, int start,int end){
		char temp=array[start];
		array[start]=array[end];
		array[end]=temp;
	}

	public static void main(String args[]) {
		String str ="fhgjhhgjkbbbb";
		System.out.println(new LongestPalindrom().longestPalindrom(str));
	}

}
