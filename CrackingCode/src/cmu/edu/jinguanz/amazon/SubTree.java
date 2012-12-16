package cmu.edu.jinguanz.amazon;

/**
 * write a function isSubtree(tree t1, tree t2) to check if one tree is sub tree
 * of other.
 * 
 * @author jinguangzhou
 * 
 */

public class SubTree {
	public void preOrder(StringBuffer buffer, TreeNode t) {
		if (t != null)
			buffer.append(t.data);
		else
			buffer.append("x");// leaf node
		preOrder(buffer, t.left);
		preOrder(buffer, t.right);

	}

	public boolean isSubTree(TreeNode t1, TreeNode t2) {
		StringBuffer buffer1 = new StringBuffer();
		StringBuffer buffer2 = new StringBuffer();
		preOrder(buffer1, t1);
		preOrder(buffer2, t2);
		return isSubString(buffer1.toString(), buffer2.toString());
	}

	public boolean isSubString(String str1, String str2) {
		boolean match = true;
		if (str1.length() < str2.length())
			return false;
		if (str1.length() == str2.length() && str1.equals(str2))
			return true;
		for (int j = 0; j < str1.length() - str2.length() + 1; j++) {// condition
																		// is
																		// important
			for (int i = 0; j < str2.length(); i++) {
				if (str1.charAt(j) == str2.charAt(i)) {
					j++;
				} else {
					match = false;
					break;
				}
			}
			if (match)
				break;

		}
		return match;

	}

	public boolean containsTree(TreeNode t1, TreeNode t2) {
		if (t2 == null)
			return true;
		return subTree(t1, t2);
	}

	public boolean subTree(TreeNode r1, TreeNode t2) {
		if (r1 == null)
			return false;
		if (r1.data == t2.data) {
			if (matchTree(r1, t2))
				return true;
		}

		return (subTree(r1.left, t2)) || (subTree(r1.right, t2));

	}

	public boolean matchTree(TreeNode t1, TreeNode t2) {
		if (t1 == null && t2 == null)
			return true;
		if (t1 == null || t2 == null)
			return false;
		if (t1.data != t2.data)
			return false;
		return matchTree(t1.left, t2.left) && matchTree(t1.right, t2.right);
	}

	public static void main(String args[]) {

	}

	class TreeNode {
		TreeNode left;
		TreeNode right;
		double data;
	}

}
