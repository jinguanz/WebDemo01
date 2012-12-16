package cmu.edu.jinguanz.amazon;

public class ChickenRice {
	   public static int eat(int[][] array){
		   int[][] arrSum = new int[3][3];
		   int[] rom = new int[3];
		   int[] col = new int[3];
		   arrSum[0][0] = array[0][0];
		   System.out.println(array.length);
		   for (int j = 1; j < array[0].length; j++)  
	        {  
	            arrSum[0][j] = array[0][j] + array[0][j - 1];  
	        }  
		   for (int i = 1; i < array.length; i++)  
	        {  
	            arrSum[i][0] = array[i][0] + arrSum[i - 1][0];  
	            for (int j = 1; j < array[0].length; j++)  
	            {  
	                arrSum[i][j] = Math.max(arrSum[i - 1][j], arrSum[i][j - 1]) + array[i][j];  
	            }  
	        }
		   return arrSum[2][2];
	    }  
	   
	   
	   
	   public static int printMax(int[][] a){
		   int[][] grid = a;
		   int gridSize = grid[0].length;
		   for (int i = gridSize - 2; i >= 0; i--) {
			    grid[gridSize - 1][i] += grid[gridSize - 1][i+1];
			    grid[i][gridSize - 1] += grid[i+1][gridSize - 1];
			}
			 
			for (int i = gridSize - 2; i >= 0; i--) {
			    for (int j = gridSize - 2; j >= 0; j--) {
			        grid[i][j] += Math.min(grid[i + 1][j], grid[i][j + 1]);
			    }
			}
			System.out.println(grid[a.length-1][a[0].length-1]);
			return grid[2][2];
		}
		   
	   
	
	
	
	public static void main(String args[]){
		int[][] a={{3,5,7},{5,7,0},{6,8,1}};
		int result = ChickenRice.eat(a);
		System.out.println("Result: " + result);
		ChickenRice.printMax(a);
		
		
	}

}
