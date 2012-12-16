package cmu.edu.jinguanz.amazon;

public class BSTDoublyLink {
	// http://cslabprograms.blogspot.com/2011/02/convert-binary-tree-to-doubly-linked.html
	/**
	 * The problem can be solved recursively.
       1. Convert the left subtree into a doubly linked list
       2. Convert the right subtree into doubly linked list
       3. root.left= the rightmost node of the left subtree in the doubly linked list
       4. root.right=the leftmost node of the right subtree in the doubly linked list
       5. return root.
       At the end of recursion, from the main routine, traverse to the leftmost node
       which gives the headnode of the doubly linked list.
	 * @param root
	 * @return
	 */

	public TreeNode treeToDoublyLinkedList(TreeNode root) {
		// Converts a tree to doubly linked list, in place

		if (root == null) {// Stop condition for recursion
							// If the tree is null, resulting DLL is also null
			return null;
		}

		TreeNode leftsubtree = treeToDoublyLinkedList(root.left);
		TreeNode rightsubtree = treeToDoublyLinkedList(root.right);

		if (leftsubtree != null) {
			while (leftsubtree.right != null) {
				leftsubtree = leftsubtree.right;
			}
			leftsubtree.right = root;
		}
		root.left = leftsubtree;

		if (rightsubtree != null) {
			while (rightsubtree.left != null) {
				rightsubtree = rightsubtree.left;
			}
			rightsubtree.left = root;
		}
		root.right = rightsubtree;

		return root;

	}

}
