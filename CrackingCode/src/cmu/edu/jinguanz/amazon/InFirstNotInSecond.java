package cmu.edu.jinguanz.amazon;

import java.util.ArrayList;
import java.util.List;

public class InFirstNotInSecond {

	/**
	 * Given two int arrays, return a third int array that contains all values
	 * in the first int array that aren't in the 2nd. If a value is duplicated
	 * in the first int array, only return it once in the output array.
	 */

	public Integer[] find(int[] a, int[] b) {
		List<Integer> list = new ArrayList<Integer>();
		boolean flag = true;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					flag = false;
					break;
				}

			}
			if (flag)
				list.add(a[i]);
			else
				flag = true;
		}
		Integer[] arr = list.toArray(new Integer[list.size()]);
		return arr;

	}

	public static void main(String args[]) {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		int[] b = { 2, 3, 4, 5 };
		Integer[] result = new InFirstNotInSecond().find(a, b);
		for (Integer i : result) {
			System.out.print(i + ", ");
		}
	}

}
