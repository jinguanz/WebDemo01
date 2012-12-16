package cmu.edu.jinguanz.amazon;

/**
 * Binary search tree find the second max
 * @author jinguangzhou
 *
 */

public class SecondMax {
	
	public int findLargestValueInTree(BSTNode root) {
	    while (root.right != null) {
	     root = root.right;
	    }
	    return root.data;
	  }
	
	public int findSecondLargest(BSTNode root, int largest, int current) {
		   while (root != null) {
		    if (root.data < largest) {
		      current = root.data;
		      root = root.right;
		    } else {
		      root = root.left;
		   }
		   }
		  return current;
		 }
	
	public BSTNode findSecondMax(BSTNode root){
		BSTNode node =root;
		BSTNode secondMax=null;
		while(node!=null){
			if(node.right==null){
				node=node.left;
				
			}
			secondMax=node;
			node=node.right;
		}
		return secondMax;
		
	}

}

class BSTNode{
	BSTNode left;
	BSTNode right;
	int data;
}
