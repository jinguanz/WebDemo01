package cmu.edu.jinguanz.amazon;

public class CountWordsInSentence {
	/**
	 * Count the number of words in a sentence.
	 */
	
	public int countWord(String str){
		String[] strArray=str.split(" ");
		return strArray.length;
	}
	
	public static void main(String args[]){
		String a ="I am a student.";
		System.out.print(new CountWordsInSentence().countWord(a));
	}

}
