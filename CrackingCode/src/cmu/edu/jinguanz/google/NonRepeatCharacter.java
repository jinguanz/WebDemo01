package cmu.edu.jinguanz.google;

import java.util.HashMap;

public class NonRepeatCharacter {
	public char firstNonRepeat(String str){
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		int first=str.length()-1;
		char[] array = str.toCharArray();
		for(int i=0;i<array.length;i++){
			if(!map.containsKey(array[i])){
				map.put(array[i], i);
			}else{
				map.put(array[i], -1);//-1 represents repeated character
			}
		}
		for(Character ch:map.keySet()){
			int index=map.get(ch);
			if(index!=-1){
				if(index<first){
					first=index;
				}
			}
		}
		return array[first];
	}
	
	public static void main(String args[]){
		String a="peaarrlpet";
		System.out.println(new NonRepeatCharacter().firstNonRepeat(a));
	}

}
