package cmu.edu.jinguanz.amazon;

import java.util.*;
import java.io.*;

public class Anagram {
    public static void main(String[] args) {
    String beta = args[1];

        try {

            Map<String, List<String>> m = 
                   new HashMap<String, List<String>>();

            Scanner s = new Scanner(new File(args[0]));
            while (s.hasNext()) {
                String word = s.next();
                String alpha = sorting(word);
                List<String> l = m.get(alpha);
                if (l == null)
                    m.put(alpha, l=new ArrayList<String>());
                l.add(word);
            }

         List<String> l = m.get(sorting(beta));
       Object[] arr = l.toArray();
           for (int i=0; i < arr.length; i++)
                System.out.println(arr[i]);

        } 
    catch (Exception e) {
            System.out.println(e);
            System.exit(1);
        }

    }

    private static String sorting(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);//Convert String to char array
        return new String(a);
    }
}
