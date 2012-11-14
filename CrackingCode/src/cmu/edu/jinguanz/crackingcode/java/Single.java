package cmu.edu.jinguanz.crackingcode.java;

public class Single {
	private static Single single;
	private Single(){
		System.out.println("Single");
	}
	
	public static Single getSingle(){
		if (single==null)
				single = new Single();
		return single;
	}
	
	public static void main(String args[]){
		System.out.println(Single.single);
		
	}
	

}
