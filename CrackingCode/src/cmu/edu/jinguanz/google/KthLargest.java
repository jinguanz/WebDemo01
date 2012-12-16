package cmu.edu.jinguanz.google;
/**
 * Get the kth largest number from two sorted arrays
 * @author jinguangzhou
 *
 */

public class KthLargest {
	public void getKthLargest(int[] a,int[] b,int k){
		//merge first
		int indexA=a.length-1;
		int indexB=b.length-1;
		int newLength=indexA+indexB+1;
		int[] result=new int[a.length+b.length];
		int count=0;
		while(indexA>=0 && indexB>=0){
			if(a[indexA]>=b[indexB]){
				//result[newLength]=a[indexA];
				indexA--;
				newLength--;
				count++;
				if(count==k){
					System.out.println("K largest: " + a[indexA+1]);
					return;
				}
			}else{
				//result[newLength]=b[indexB];
				indexB--;
				newLength--;
				count++;
				if(count==k){
					System.out.println("K largest: "  +b[indexB+1]);
					return;
				}
			}
		
			
			
		}
		if(indexA>=0){
			result[newLength]=a[indexA];
			indexA--;
			newLength--;
			if(count==k){
				System.out.println("K largest: " + a[indexA+1]);
				return;
			}
		}
		if(indexB>=0){
			result[newLength]=b[indexB];
			indexB--;
			newLength--;
			if(count==k){
				System.out.println("K largest: "  +b[indexB+1]);
				return;
			}
		}
		int min=a[0]<b[0]? a[0]:b[0];
		System.out.print("Kth largest: " + min);
		
		
	}
	
	public int getKthLargest02(int[] a,int[] b,int k){
		//non-merge method
		
		return 0;
	}
	
	public static void main(String args[]){
		int[] a ={3,5,6,7};
		int[] b={1,10,34,56};
		new KthLargest().getKthLargest(a, b, 8);
	}

}
