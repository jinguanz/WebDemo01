package cmu.edu.jinguanz.google;

import java.util.ArrayList;
import java.util.LinkedList;


public class BinaryTreeTest {
	 private int currCount=0;
	 private ArrayList<Integer> list=null;
	  public static void main(String[] args) {
	    BinaryTreeTest tree=new BinaryTreeTest();
	    tree.run();
	    
	  }
	 
	  static class Node {
	    Node left;
	 
	    Node right;
	 
	    int value;
	 
	    public Node(int value) {
	      this.value = value;
	    }
	  }
	 
	  public void run() {
	    // build the simple tree from chapter 11.
	    Node root = new Node(5);
	    list= new ArrayList<Integer>();
	    System.out.println("Binary Tree Example");
	    System.out.println("Building tree with root value " + root.value);
	    insert(root, 1);
	    insert(root, 8);
	    insert(root, 6);
	    insert(root, 3);
	    insert(root, 9);
	    insert(root,10);
	    System.out.println("Traversing tree in order");
	    printInOrder(root);
	    System.out.println("Traversing tree front-to-back from location 7");
	    printFrontToBack(root, 7);
	    getElementFromEnd(root, 2);
	    for(Integer in:list){
	    	System.out.print("List: " + in);
	    }
	    this.levelOrder(root);
	    this.levelOrderDepth(root);
	  }
	 
	  public void insert(Node node, int value) {
	    if (value < node.value) {
	      if (node.left != null) {
	        insert(node.left, value);
	      } else {
	        System.out.println("  Inserted " + value + " to left of "
	            + node.value);
	        node.left = new Node(value);
	      }
	    } else if (value > node.value) {
	      if (node.right != null) {
	        insert(node.right, value);
	      } else {
	        System.out.println("  Inserted " + value + " to right of "
	            + node.value);
	        node.right = new Node(value);
	      }
	    }
	  }
	 
	  public void printInOrder(Node node) {
	    if (node != null) {
	      printInOrder(node.left);
	      System.out.println("  Traversed " + node.value);
	      printInOrder(node.right);
	    }
	  }
	 
	  /**
	   * uses in-order traversal when the origin is less than the node's value
	   * 
	   * uses reverse-order traversal when the origin is greater than the node's
	   * order
	   */
	  public void printFrontToBack(Node node, int camera) {
	    if (node == null)
	      return;
	    if (node.value > camera) {
	      // print in order
	      printFrontToBack(node.left, camera);
	      System.out.println("  Traversed " + node.value);
	      printFrontToBack(node.right, camera);
	    } else if (node.value < camera) {
	      // print reverse order
	      printFrontToBack(node.right, camera);
	      System.out.println("  Traversed " + node.value);
	      printFrontToBack(node.left, camera);
	    } else {
	      // order doesn't matter
	      printFrontToBack(node.left, camera);
	      printFrontToBack(node.right, camera);
	    }
	  }
	  private ArrayList<Integer> getElementFromEnd(Node node,int n){
	        if(node!=null){
	            if(currCount<n)
	            getElementFromEnd(node.right,n);//reverse inorder
	            currCount++;
	            

	            if(currCount<=n)// if the question is that get two highset number, then set currCount<=2
	            {
	                System.out.println(" Largest value: "+node.value);
	                list.add(node.value);
	                return list;
	            }
	            if(currCount<n)
	            getElementFromEnd(node.left,n);
	            
	            
	        }
			return list;
	    }
	  
	  public void levelOrder(Node root){
		  if(root==null) return;
		  LinkedList<Node> list = new LinkedList<Node>();
		  list.add(root);
		  System.out.println("Level order: ");
		  while(!list.isEmpty()){
			  Node current = list.remove();
			  System.out.print(current.value+", ");
			  if(current.left!=null)
				  list.add(current.left);
			  if(current.right!=null)
				  list.add(current.right);
		  }
	  }
	  
	  public int levelOrderDepth(Node root){
		  int hp=0; //number of visited nodes
		  int tp=1 ;//history in 
		  int lc=1; // mark of last node in each level
		  int depth=0;
		  if(root==null) return 0;
		  LinkedList<Node> list = new LinkedList<Node>();
		  list.add(root);
		  System.out.println("Level order: ");
		  while(!list.isEmpty()){
			  Node current = list.remove();
			  hp++;
			  System.out.print(current.value+", ");
			  if(current.left!=null){
				  list.add(current.left);
				  tp++;  
			  }
			  if(current.right!=null){
				  list.add(current.right);
				  tp++;
			  }
			  if(hp==lc){//finished current level nodes
				  depth++;
				  lc=tp;//update next level node 
			  }
				  
		  }
		  System.out.println("Depth: " + depth);
		  return depth;
	  }
	 
	}
