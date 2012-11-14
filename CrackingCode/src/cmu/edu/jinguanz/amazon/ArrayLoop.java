package cmu.edu.jinguanz.amazon;

public class ArrayLoop {
	/**
	 * From large to small
	 * @param array
	 * @param left
	 * @param right
	 * @param num
	 * @return
	 */

	public int binarySearch(int[] array, int left, int right, int num) {
		if (array == null)
			return -1;
		if (left > right)
			return -1;
		if (right == left) {
			if (array[left] == num)
				return left;
			else
				return -1;
		}
		int mid = (left + right) / 2;
		if (array[mid] == num)
			return mid;

		if (array[mid] <= array[left]) {
			if (num > array[mid] && num <= array[left])
				return binarySearch(array, left, mid - 1, num);
			else
				return binarySearch(array, mid + 1, right, num);

		} else {
			if (num < array[mid] && num >= array[right])
				return binarySearch(array, mid + 1, right, num);
			else
				return binarySearch(array, left, mid - 1, num);
		}

	}

	public static void main(String args[]) {
		int[] a = { 5,6,1,2,3,4 };
		System.out.println(new ArrayLoop().binarySearch2(a, 0, a.length - 1, 10));
	}
	/**
	 * From small to large
	 * @param array
	 * @param left
	 * @param right
	 * @param num
	 * @return
	 */

	public int binarySearch2(int[] array, int left, int right, int num) {
		if (array == null)
			return -1;
		if (left > right)
			return -1;
		if (left == right) {
			if (array[left] == num)
				return left;
			else
				return -1;

		}
		int mid =(left+right)/2;
		if(array[mid] == num)
			return mid;
		if(array[mid]>num){
			if(array[mid]>=array[left])
				return binarySearch2(array,left,mid-1,num);
			else
				return binarySearch2(array,mid+1,right,num);
			
		}else{
			if(num<=array[right])
				return binarySearch2(array,mid+1,right,num);
			else
				return binarySearch2(array,left,mid-1,num);
				
		}

	}

}
