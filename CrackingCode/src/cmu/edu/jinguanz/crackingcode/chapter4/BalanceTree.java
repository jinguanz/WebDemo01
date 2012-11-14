package cmu.edu.jinguanz.crackingcode.chapter4;

public class BalanceTree {
	public static int getHeight(TreeNode node) {
      if(node==null) return 0;
      return Math.max(getHeight(node.left), getHeight(node.right))+1;
	}
	
	public static boolean isBalance(TreeNode node){
		if(node==null) return true;
		int differenceHeight = getHeight(node.left)-getHeight(node.right);
		if(Math.abs(differenceHeight)>2)
			return false;
		else
			return isBanlance(node.left) && isBanlance(node.right);
		
	}
	
	public static int checkHeight(TreeNode node){
		if(node==null) return 0;
		
		//check left is balanced
		int leftHeight = checkHeight(node.left);
		if(leftHeight==-1)
			return -1;
		
		//check right is balanced
		int rightHeight =checkHeight(node.right);
		if(rightHeight==-1)
			return -1;
		
		int differenceHeight=leftHeight-rightHeight;
		
		//check current node is balanced
		if(Math.abs(differenceHeight)>1)
			return -1;
		else
			return Math.max(leftHeight, rightHeight)+1;
		
	}
	
	public boolean isBalance(TreeNdoe node){
		if(checkHeight(node)!=-1)
			return true;
		else 
			return false;
	}
}
