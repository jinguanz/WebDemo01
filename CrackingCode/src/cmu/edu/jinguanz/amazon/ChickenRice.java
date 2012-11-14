package cmu.edu.jinguanz.amazon;

public class ChickenRice {
	   public static int eat(int[][] array){
		   int[][] arrSum = new int[5][4];
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
		   return arrSum[4][3];
	    }  
		   
	   
	
	
	
	public static void main(String args[]){
		int[][] array={{3,5,7,8},{5,7,0,2},{6,8,1,3},{9,56,78,90},{1,2,3,4}};
		System.out.println(array.length);
		System.out.println(array[0].length);
		int result=ChickenRice.eat(array);
		System.out.println("result: " + result);
		System.out.println(5/2);
		
	}

}
