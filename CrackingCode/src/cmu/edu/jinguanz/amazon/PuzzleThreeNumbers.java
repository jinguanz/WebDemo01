package cmu.edu.jinguanz.amazon;
/**
 *  A puzzle to find 3 numbers in an array which summed to 0.
 *  sort(S);
 *for i=0 to n-3 do
    a = S[i];
    k = i+1;
    l = n-1;
    while (k<l) do
       b = S[k];
       c = S[l];
       if (a+b+c == 0) then
          output a, b, c;
          exit;
       else if (a+b+c > 0) then
          l = l - 1;
       else
          k = k + 1;
       end   
    end
 end
 
 NlogN
 * @author jinguangzhou
 *
 */

public class PuzzleThreeNumbers {
	public void find3Sum(int[] array){
		int a,b,c=0;//for different value
		int k,l=0;//for position
		for(int i=0;i<=array.length-3;i++){  //very important
			a=array[i];
			k=i+1;
			l=array.length -1;
			while(k<l){
				b=array[k];
				c=array[l];
				if((a+b+c)==0){
					System.out.println(a +", " +b +", " +c);
					return;
				}else if((a+b+c)>0){
					l=l-1;
				}else{
					k=k+1;
				}
					
			}
		}
		System.out.println("Cannot find these three numbers");
		
	}
	/**
	 * Worst method N*N*N
	 * @param array
	 */
	
	public void find3Sum2(int[] array){
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				for(int k=j+1;k<array.length;k++){
					if(array[i] + array[j]+array[k]==0)
						System.out.println(array[i] +", " +array[j] +", " + array[k]);
				}
			}
		}
	}
	
	public static void main(String args[]){
		int[] a ={-3, 2, 4, 8,-25,-10,-7,5,6,7};// the array is not a sorted array
		new PuzzleThreeNumbers().find3Sum(a);
		new PuzzleThreeNumbers().find3Sum2(a);
	}
	

}
