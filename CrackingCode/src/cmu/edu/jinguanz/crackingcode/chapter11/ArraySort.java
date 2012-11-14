package cmu.edu.jinguanz.crackingcode.chapter11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class ArraySort {
	private AnagramComparator com = new AnagramComparator();
	
	class AnagramComparator implements Comparator<String>{
		
		
		public String sortCharts(String s){
			char[] content = s.toCharArray();
			Arrays.sort(content);
			return new String(content);
		}

		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			return sortCharts(o1).compareTo(sortCharts(o2));
		}
		
	}
	
	public static void main(String args[]){
		String[] array=null;
		Arrays.sort(array, new ArraySort().com);
	}
	
	
	public String sortChart(String s){
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
	
	public void sort(String[] array){
		Map<String, LinkedList<String>> map = new HashMap<String, LinkedList<String>>();
		
		for(String s:array){
			String key = sortChart(s);
			if(!map.containsKey(key)){
				map.put(key, new LinkedList<String>());
			}
			LinkedList<String> list = map.get(key);
			list.push(s);
		}
		
		int index=0;
		for(String key:map.keySet()){
			LinkedList<String> list = map.get(key);
			for(String s:list){
				array[index]=s;
				index++;
			}
		}
	}

}
