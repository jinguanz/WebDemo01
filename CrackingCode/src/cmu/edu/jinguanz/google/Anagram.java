package cmu.edu.jinguanz.google;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Anagram {
    // Start typing your Java solution below
    // DO NOT write main() function
	public ArrayList<String> getAnagram(String[] strs){
	 ArrayList<String> list = new ArrayList<String>();
     HashMap<String, ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
     for(String str:strs){
         char[] ch = str.toCharArray();
         Arrays.sort(ch);
         String temp= new String(ch);
         if(!map.containsKey(temp)){
        	 ArrayList<String> anagram = new ArrayList<String>();
        	 anagram.add(str);
             map.put(temp, anagram);
         }else{
             map.get(temp).add(str);
             
         }
     }
     for(String str:map.keySet()){
    	 if(map.get(str).size()>1){
    		 list=map.get(str);
    	 }
     }
     return list;
    
}
	public static void main(String args[]){
		String[] str={"asc","sca","jjjj"};
		ArrayList<String> list = new Anagram().getAnagram(str);
		for(String s:list){
			System.out.println(s);
		}
	}

}
