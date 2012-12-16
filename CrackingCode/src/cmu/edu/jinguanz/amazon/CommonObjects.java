package cmu.edu.jinguanz.amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Find common objects or different objects from two list
 * @author jinguangzhou
 *
 */

public class CommonObjects {
	
	public ArrayList<String> getDifferent(String str1,String str2){
		ArrayList<String> list = new ArrayList<String>();
		Map<String,Integer> map = new HashMap<String,Integer>();
		String[] s1 = str1.split(" ");
		String[] s2=str2.split(" ");
		for(String s:s1){
			if(!map.containsKey(s))
				map.put(s, 0);
		}
		for(String s:s2){
			if(map.containsKey(s))
				map.put(s, 1);
			else
				map.put(s, 0);
		}
		
		for(String s:map.keySet()){
			Integer number =map.get(s);
			if(number==1) // 1 represents same, 0 represents different
				list.add(s);
		}
		
		return list;
			
		
	}
	
	public static void main(String args[]){
		String a ="Hello my family china chicago";
		String b="Hello china new york skyfall";
		ArrayList<String> list = new CommonObjects().getDifferent(a, b);
		for(String s:list)
			System.out.println(s +", ");
	}
 
}
