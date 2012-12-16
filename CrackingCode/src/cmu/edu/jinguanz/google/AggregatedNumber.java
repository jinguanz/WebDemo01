package cmu.edu.jinguanz.google;
/**
 * we will name a number "aggregated number" if this number has the following attribute:
 * just like the Fibonacci numbers 1,1,2,3,5,8,13.....
 * the digits in the number can divided into several parts, 
 * and the later part is the sum of the former parts.
 * like 112358, because 1+1=2, 1+2=3, 2+3=5, 3+5=8
 * 122436, because 12+24=36
 * 1299111210, because 12+99=111, 99+111=210
 * 112112224, because 112+112=224
 * so can you provide a function to check whether this number is aggregated number or not?
 * @author jinguangzhou
 *
 */

public class AggregatedNumber {
	
	static boolean isAggregatedNumber(String text) {
		int length = text.length() / 2;
		for(int i = 1; i <= length; i++) {
			for(int j = 2; j <= length; j++) {
				if(Match(i,j,text)) {
					return true;
				}
			}
		}
		return false;
	}


static boolean Match(int i, int j, String text) {
		String first = text.substring(0, i);
		String second = text.substring(i, i*2);//why 2*i
		StringBuilder buffer = new StringBuilder(first);
		buffer.append(second);
		while(buffer.length() < text.length()) {
			Integer x  = (Integer.parseInt(first) + Integer.parseInt(second));
			String third =  x.toString();
			buffer.append(third);
			first = second;
			second = third;
			}
		if(text.equals(buffer.toString())) 
			return true;
		return false;				
	}

 public static void main(String args[]){
	 String a ="1299111210";
	 boolean flag = new AggregatedNumber().isAggregatedNumber(a);
	 if(flag)
		 System.out.println("IS");
	 else
		 System.out.println("Not");
 }

}
