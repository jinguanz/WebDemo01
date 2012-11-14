package cmu.edu.jinguanz.amazon;

/**
 * print all permutations of a string
 * @author jinguangzhou
 *
 */

public class Permutation {
	
	public void printPermuation(char[] ch, int start, int end){
		if(start==end){
			for(char c:ch)
				System.out.print(c +",");
			System.out.println();
		}
		else{
			for(int j=start;j<=end;j++){
				swap(ch,j,start);
				printPermuation(ch,start+1,end);
				swap(ch,j,start);//http://zhedahht.blog.163.com/blog/static/254111742007499363479/
				
			}
		}
	}
	
	public void swap(char[] ch,int x, int y){
		char temp=ch[x];
		ch[x]=ch[y];
		ch[y]=temp;
		
	}
	
	public static void main(String args[]){
		String a ="1234";
		new Permutation().printPermuation(a.toCharArray(), 0, 3);
	}

}
