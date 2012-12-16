package cmu.edu.jinguanz.crackingcode.chapter1;

public class Rotate07 {
	
	public static void Rotate(int[][] matrix, int n){
		for(int layer=0;layer<n/2;++layer){
			int first=layer;
			int last = n-1-layer;
			for(int i=first;i<last;++i){
				int offset = i-first;
				//save top
				int top=matrix[first][i];
				//left to top
				matrix[first][i]=matrix[last-offset][first];
				
				//bottom->left
				matrix[last-offset][first]=matrix[last][last-offset];
				
				//right ->bottom
				matrix[last][last-offset]=matrix[i][last];
				
				//top->right
				matrix[i][last]=top;
			}
		}
	}

}