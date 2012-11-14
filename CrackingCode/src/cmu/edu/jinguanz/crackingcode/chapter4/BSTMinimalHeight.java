package cmu.edu.jinguanz.crackingcode.chapter4;

public class BSTMinimalHeight {
	public TreeNode createMinimalBST(int[] array){
		return createMinimalBST(array,0,array.length-1);
	}
	
	public TreeNode createMinimalBST(int[] array,int start,int end){
		if(start>end) return null;
		int mid = (start + end)/2;
		TreeNode n = new TreeNode(array[mid]);
		n.left=createMinimalBST(array,start,mid-1);
		n.right=createMinimalBST(array,mid+1,end);
		return n;
	}
	

}
