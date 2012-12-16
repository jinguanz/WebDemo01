package cmu.edu.jinguanz.google;

public class ReverseInteger {
	public int reverse(int number) {
		// Start typing your Java solution below
		// DO NOT write main() function

		int reversedNumber = 0;
		int temp = 0;
		boolean flag = false;
		if (number < 0) {
			number = -number;
			flag = true;
		}

		while (number > 0) {

			// use modulus operator to strip off the last digit
			temp = number % 10;

			// create the reversed number
			reversedNumber = reversedNumber * 10 + temp;
			number = number / 10;

		}
		if (flag) {
			return -reversedNumber;
		}
		return reversedNumber;

	}
}
