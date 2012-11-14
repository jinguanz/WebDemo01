package cmu.edu.jinguanz.eightqueen;

public class MaxSum {

	/**
	 * Get the maximal sum of an array
	 * 
	 * @param array
	 * @return
	 */

	public int maxSum(int[] array) {
		int sum = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < 0) {
				if (sum < 0) {
					if (sum < array[i]) {
						sum = array[i];
					}
				}
			} else {
				if (sum < 0)
					sum = array[i];
				else
					sum = sum + array[i];
			}
		}

		return sum;
	}

	public static void main(String args[]) {
		int[] a = { -2, -1, -3, 1 ,-1,-1,-1,2,3};
		System.out.println("Max sum: " + new MaxSum().maxSum(a));
	}

}
