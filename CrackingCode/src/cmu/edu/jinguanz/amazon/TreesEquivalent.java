package cmu.edu.jinguanz.amazon;
/**
 * Describe rules that would define whether or not these two trees are equivalent
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
	
	public boolean isSameTree(TreeNode p, TreeNode q) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        return (p.data==q.data)&&isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        
    }

}

class TreeNode{
	TreeNode left;
	TreeNode right;
	double data;
}
