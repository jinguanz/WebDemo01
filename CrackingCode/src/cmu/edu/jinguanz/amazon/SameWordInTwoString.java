package cmu.edu.jinguanz.amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given 2 strings find the common words along with the time and space complexity
 * Time complexity N, space complexity M+N
 * @author jinguangzhou
 *
 */

public class SameWordInTwoString {
	
	public List<String> findSameWord(String str1,String str2){
		List<String> list = new ArrayList<String>();
		String[] array1 = str1.split(" ");
		String[] array2=str2.split(" ");
		Map<String,Boolean> map = new HashMap<String,Boolean>();
		for(String str:array1){
			map.put(str,true);
		}
		for(String str:array2){
			if(map.containsKey(str))
				list.add(str);
		}
		return list;
			
		
	}
	
	public static void main(String args[]){
		String a ="Hello my friend aa bb cc";
		String b="Hi THIS IS fiend aa bb Hello";
		List<String> common = new SameWordInTwoString().findSameWord(a, b);
		for(String s:common){
			System.out.print(s +", ");
		}
	}

}
