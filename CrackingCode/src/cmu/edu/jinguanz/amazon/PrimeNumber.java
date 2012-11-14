package cmu.edu.jinguanz.amazon;

public class PrimeNumber {
	
	public boolean isPrime(int number){
		boolean flag=true;
		for(int i=2;i<Math.sqrt(number);i++){// or i<number/2
			if(number%i==0){
				flag=false;
				break;
			}
		}
		return flag;
	}
	
	public static void main(String args[]){
		int number =11;
		if(new PrimeNumber().isPrime(number))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
