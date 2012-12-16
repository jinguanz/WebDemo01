package cmu.edu.jinguanz.google;

public class BitAdd {
	public String addBinary(String a, String b) {
		//return when there is no carries
        if(b.indexOf('1') == -1)//there is no carries
            return a.indexOf('1') == -1 ? a : a.substring(a.indexOf('1'));
        int diff = Math.abs(a.length() - b.length());
        if(a.length() > b.length()) {
            for(int i = 0; i < diff; ++i)
                b = '0' + b;
        } else {
            for(int i = 0; i < diff; ++i)
                a = '0' + a;
        }
         
        String sum = new String();
        String carry = "0";
        for(int i = a.length() - 1; i >= 0; --i) {
            if( (a.charAt(i) == '1' && b.charAt(i) == '1') ||
                (a.charAt(i) == '0' && b.charAt(i) == '0'))
                sum = '0' + sum;
            else
                sum = '1' + sum;
            if (a.charAt(i) == '1' && b.charAt(i) == '1')
                carry = '1' + carry;
            else
                carry = '0' + carry;
        }
        return addBinary(sum, carry);
    }

}
