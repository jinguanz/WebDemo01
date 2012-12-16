package cmu.edu.jinguanz.eightqueen;

public class Print {
	
	public void printTable(){
	     for(int i=1;i<=12;i++){
	          for(int j=1;j<=12;j++){
	          System.out.print(i*j + "");
	     }
	         System.out.println();

	}
	}
	
	public static void main(String args[]){
		new Print().printTable();
	}

}
