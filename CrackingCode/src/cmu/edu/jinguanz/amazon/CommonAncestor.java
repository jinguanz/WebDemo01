package cmu.edu.jinguanz.amazon;
/**
 * Find the least common ancestor for any two given nodes in a Binary search tree
 * @author jinguangzhou
 * This is a  BST
 */

public class CommonAncestor {
	/**
	 * BST
	 * @param root
	 * @param n1
	 * @param n2
	 * @return
	 */
	public Node LCA(Node root, Node n1, Node  n2) {
		if ( root == null ) return root;
		if ( n1 == null ) return n2;
		if ( n2 == null ) return n1; 
		if (( n1.value < root.value ) && ( n2.value > root.value )) return root;//different branches
		if (( n1.value > root.value ) && ( n2.value < root.value )) return root;//different branches
		if (( n1.value < root.value ) && ( n2.value < root.value )) return LCA(root.left, n1,n2);//same branch
		if (( n1.value > root.value ) && ( n2.value > root.value )) return LCA(root.right, n1,n2);//same branch
		return null;
		}

      /**
       * The node has link to its parent node
       * @param n1
       * @param n2
       * @return
       */

   public Node LCA1(Node n1,Node n2){
	   Node parent1 = n1.parent;
	   Node parent2 = n2.parent;
	   while(parent1!=null && parent2!=null){
		   if(parent1==parent2)
			   return parent1;
		   parent1=parent1.parent;
		   parent2=parent2.parent;
	   }
	   return null;
	   
	   
   }
   
   /**
    * Not a BST
    * @param root
    * @param p
    * @param q
    * @return
    */
   
   public Node commonAncestor(Node root, Node p, Node q){
	   if(!covers(root,p)||!covers(root,q))
		   return null;
	   return commonAncestorHelper(root,p,q);
   }
   /*Return true if p is a descendent of root*/
   public boolean covers(Node root,Node p){
	   if(root==null) return false;
	   if(root==p) return true;
	   return covers(root.left,p)||covers(root.right,p);
   }
   
   public Node commonAncestorHelper(Node root, Node p, Node q){
	   if(root==null) return null;
	   if(root==p||root==q) return null;
	   boolean is_p_on_left=covers(root.left,p);
	   boolean is_q_on_left=covers(root.left,q);
	   
	   /*If p and q are on different side, return root*/
	   if(is_p_on_left!=is_q_on_left) return root;
	   
	   /*If p and q are on same side, Traverse this side*/
	   Node child_side = is_p_on_left ? root.left:root.right;
	   return commonAncestor(child_side,p,q);
	   
			   
   }
   

class Node{
	public int value;
	public Node left;
	public Node right;
	public Node parent;
	
}
}
