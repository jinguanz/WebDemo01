package cmu.edu.jinguanz.crackingcode.chapter1;

public class UniqueString1 {

	public static boolean uniqueString(String str) {
		if (str.length() > 256)  // use ASCII string
			return false;

		boolean[] unique = new boolean[256];
		for (int i = 0; i < str.length(); i++) {
			int number = str.charAt(i);
			if (unique[number]) {
				return false;
			}
			unique[number] = true;
		}
		return true;

	}
	/**
	 * Use bit operation to decide
	 * @param str
	 * @return
	 * lower case letter a through z
	 */
	public static boolean isUniqueChars(String str){
		if(str.length()>256) return false;
		int checker =0;
		for(int i=0;i<str.length();i++){
			int val = str.charAt(i) -'a';
			if((checker & (1 << val))>0)
				return false;
			checker |= (1 << val);
		}
		return true;
		
	}
	
	//http://polythinking.wordpress.com/2012/06/06/cracking-the-code-interviews-solution-1-arrays-strings/
	//Another method to do this
	
	
	public static void main(String args[]){
		String a = "abcd";
		if(isUniqueChars(a))
			System.out.println("Unique String");
		else
			System.out.println("Not Unique");
	}

}
