package cmu.edu.jinguanz.crackingcode.chapter11;

public class MaxSum {

	public int maxSum(int[] array) {
		int sum = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < 0) {
				if (sum < 0) {
					if (sum < array[i])
						sum = array[i];
				}
			} else {
				if (sum < 0) {
					sum = array[i];
				} else {
					sum = sum + array[i];
				}
			}
		}
		return sum;
	}

	public static void main(String args[]) {
		int[] a = {2,-3,-4,6};
		System.out.println(new MaxSum().maxSum(a));
	}

}
