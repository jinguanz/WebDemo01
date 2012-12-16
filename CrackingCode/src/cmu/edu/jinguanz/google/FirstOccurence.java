package cmu.edu.jinguanz.google;

public class FirstOccurence {
	
	public int getFirstOccurence(int[] a,int target){
		int begin=0;
		int end=a.length-1;
		while(begin<=end){
			int middle=(begin+end)/2;
			if(a[middle]==target){
				while(a[middle]==target){
					middle--;
					if(middle==-1)
						break;
				}
				return middle+1;
				
			}else if(a[middle]>target){
				end=middle-1;
			}else{
				begin=middle+1;
			}
		}
		return -1;
	}
	
	public static void main(String args[]){
		int[] a={1,2,2,2,4,4,5,6,6};
		System.out.println(new FirstOccurence().getFirstOccurence(a, 6));
	}

}
