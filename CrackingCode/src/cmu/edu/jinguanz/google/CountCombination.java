package cmu.edu.jinguanz.google;

public class CountCombination {
	
	public long countCombination(int number,int min){
		long temp=1;
		if(number<=1) return 1;
		for(int i=1;i<number/2;i++){
			if(i>=min){
				temp=temp+countCombination(number-i,i);
			}
		}
		return temp;
		
	}
	
	public static void main(String args[]){
		System.out.println(new CountCombination().countCombination(100, 1));
	}

}
