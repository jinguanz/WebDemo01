package cmu.edu.jinguanz.amazon;

import java.util.HashMap;
import java.util.Map;

/**
 * Given any string, find the index of the start of the first duplicated 3-letter subsequence. 
 * For example, in abcabcdef, 
 * it would be 0, and abcdefdef would be 3, 
 * and then abcdefkajdkffatabcdef would be 0, 
 * and abcdefkajdkffatdef would be 3. 
 * @author jinguangzhou
 *
 */

public class DuplicateSubsequence {
	
	/*
	
	public int findDuplicateIndex(String str){
		
	}
	*/
	
	public static int findDuplicate3Chars(String s)
    {
        Map<String, Integer> map = new HashMap<String, Integer>();
        StringBuffer b = new StringBuffer();
        int inputLength = s.length() - 3; // This is very important
        for (int i = 0; i <= inputLength; i++) // Be careful of this condition
        {
            for (int j = 0; j < 3; j++)
            {
                b.append(s.charAt(i + j));
            }
            String key = b.toString();
            if (map.containsKey(key))
            {
                return map.get(key);
            }
            map.put(key, i);
            b.setLength(0);
            
        }
        return -1;
    }
	
	public static void main(String args[]){
		String a ="abcdefdef";
        System.out.println(new DuplicateSubsequence().findDuplicate3Chars(a));
	}

}
