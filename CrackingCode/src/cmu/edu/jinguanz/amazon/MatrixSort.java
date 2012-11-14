package cmu.edu.jinguanz.amazon;
/**
 * How to find an element in a matrix. Rows are sorted. Columns are not sorted;
 * @author jinguangzhou
 *
 */
public class MatrixSort {
	/**
	 * Rows sort, column not nlogN
	 * @param matrix
	 * @param x
	 * @return
	 */
	
	public static int[] findElement(int[][] matrix,int x){
		int[] result ={-1,-1};
		for(int i=0;i<matrix[0].length;i++){// column
			int start=0;
			int end=matrix.length-1;
			while(start<=end){
				int mid=(start+end)/2;
				if(matrix[i][mid]<x)
					start=mid+1;
				else if(matrix[i][mid]>x)
					end=end-1;
				else if(matrix[i][mid]==x){
					result[0]=i;
					result[1]=mid;
					return result;
				}
			}
		}
		return result;
		
	}
	
	
	public static int[] findElement2(int[][] matrix,int x){
		int[] result ={-1,-1};
		for(int i=0;i<matrix.length;i++){// column
			int start=0;
			int end=matrix[0].length-1; //row
			while(start<=end){
				int mid=(start+end)/2;
				if(matrix[i][mid]<x)
					start=mid+1;
				else if(matrix[i][mid]>x)
					end=mid-1;
				else if(matrix[i][mid]==x){
					result[0]=i;
					result[1]=mid;
					return result;
				}
			}
		}
		return result;
		
	}
	
	/**
	 * Rows and columns are all sorted
	 * @param args
	 */
	
	
	
	public static void main(String args[]){
		int[][] matrix = {{2,4,5,6},{1,3,4,10},{0,8,9,15}};
		for(int i:MatrixSort.findElement2(matrix, 2))
			System.out.print(i +" ");
		
		/*int[][] test = new int[3][4];
		System.out.println(test.length);
		System.out.println(test[0].length);*/
	}

}
