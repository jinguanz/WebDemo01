package cmu.edu.jinguanz.crackingcode.java;

public class ExceptionExample {
	
	public int div(int i,int j) throws Exception{
		int temp=0;
		try{
			System.out.println("Begin");
			temp = i/j;
		}catch(Exception e){
			throw e;
		}finally{
			System.out.println("end ");
		}
		return temp;
	}
	
	public static void main(String args[]){
		ExceptionExample exe = new ExceptionExample();
		try{
			exe.div(10, 0);
		}catch(Exception e){
			System.out.println("Exception: " + e);
		}
	}

}
