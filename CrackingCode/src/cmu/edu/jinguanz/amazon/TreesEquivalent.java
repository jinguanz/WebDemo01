package cmu.edu.jinguanz.amazon;
/**
 * Describe rules that would define whtether or not these two trees are equivalent
 * @author jinguangzhou
 *
 */

public class TreesEquivalent {
	
	public boolean isEquivalent(TreeNode node1, TreeNode node2){
		if(node1==null && node2==null)
			return true;
		if(node1==null||node2==null)
			return false;
		return isEquivalent(node1.left,node2.left) && isEquivalent(node1.right,node2.right);
	}

}

class TreeNode{
	TreeNode left;
	TreeNode right;
	double data;
}
