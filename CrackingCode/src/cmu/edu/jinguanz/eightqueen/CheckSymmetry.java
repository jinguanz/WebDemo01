package cmu.edu.jinguanz.eightqueen;

public class CheckSymmetry {
	
	public boolean isSymmetry(String str){
		char[] array = str.toCharArray();
		int middle = str.length()/2;
		for(int i=0;i<middle;i++){
			if(array[i]!=array[str.length()-1-i])
				return false;
		}
		return true;
	}
	
	public static void main(String args[]){
		String a = " aabaa ";
		if(new CheckSymmetry().isSymmetry(a))
			System.out.println("It's Symmetry");
		else
			System.out.println("It's not Symmetry");
	}

}
