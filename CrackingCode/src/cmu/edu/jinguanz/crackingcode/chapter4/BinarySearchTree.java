package cmu.edu.jinguanz.crackingcode.chapter4;

public class BinarySearchTree {
	
	//in-order traverse
	public static int index=0;
	public static void copyBST(TreeNode node, int[] array){
		copyBST(node.left, array);
		array[index++]=node.data;
		copyBST(node.right,array);
	}
	
	public boolean isBinarySearchTree(TreeNode node){
		int[] array = new int[node.size];
		copyBST(node,array);
		
		for(int i=1;i<array.length;i++){
			if(array[i]<array[i-1])
				return false;
		}
		return true;
	}
	
	//in-order traverse
	public static int last=Integer.MIN_VALUE;
	public boolean isBinarySearch(TreeNode node){
		if(node==null) return true;
		if(!isBinarySearch(node.left)) return false;
		if(node.data<last) return false;
		last=node.data;
		if(!isBinarySearch(node.right)) return false;
		return true;
	}
	
	public boolean checkBST(TreeNode node){
		return checkBST(node, Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	
	public boolean checkBST(TreeNode node, int min, int max){
		if(node==null) return true;
		
		if(node.data<min || node.data >max)
			return false;
		
		if(!checkBST(node,min,node.data) || !checkBST(node,node.data,max))
			return false;
		
		return true;
	}

}
