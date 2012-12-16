package cmu.edu.jinguanz.google;

import java.util.ArrayList;

/**
 *  Write an efficient function in java that deletes character from a string. Use the prototype
 *  String removechars (String str, String remove)
 *  I/p (str):- "Battle of the Vowels: Hawaii vs. Grozny"
 *  (remove):- "aeiou"
 *  O/p:- "Bttl f th Vwls: Hw vs. Grzny"
 * @author jinguangzhou
 *
 */

public class RemoveCharacter {
	
	public String removeCharacter(String str,String remove){
		ArrayList<Character> list = new ArrayList<Character>();
		ArrayList<Character> removeList = new ArrayList<Character>();
		for(char ch:remove.toCharArray()){
			removeList.add(ch);
		}
		StringBuffer buffer = new StringBuffer();
		for(int i=0;i<str.length();i++){
			if(!removeList.contains(str.charAt(i))){
				buffer.append(str.charAt(i));
			}
		}
		
		return buffer.toString();
		
	}
	
	public static void main(String args[]){
		String str="Battle of the Vowels: Hawaii vs. Grozny";
		String remove="aeiou";
		System.out.println(new RemoveCharacter().removeCharacter(str, remove));
	}

}
