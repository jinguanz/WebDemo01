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
	
	public int search(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int start=0;
        int end=A.length-1;
       
        while(start<=end){
             int middle=(start+end)/2;
             if(target<A[middle]){
                 if(A[middle]>=A[start] && target>=A[start]){
                     end=middle-1;
                 }else{
                     start=middle+1;
                 }
             }else if(target>A[middle]){
                 if(A[middle]<=A[end] && target<=A[end]){
                     start=middle+1;
                 }else{
                     end=middle-1;
                 }
             }else if(target==A[middle]){
                 return middle;
             }
        }
        return -1;
    }

}
