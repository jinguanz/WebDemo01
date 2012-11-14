package cmu.edu.jinguanz.crackingcode.chapter4;

import java.util.Stack;

public class BinaryTreeTraverse {
	
	public void inOrderRe(Node root){
		inOrderRe(root.leftChild);
		root.display();
		inOrderRe(root.rightChild);
	}
	
	public void inOrder(Node root){
		if(root==null) return;
		Stack stack = new Stack();
		Node node = root;
		while(true){
			if(node!=null){
				stack.push(node);
				node=node.leftChild;
			}else{
				if(!stack.isEmpty()){
					node=stack.pop();
					node.display();
					node=node.rightChild;
				}else{
					break;
				}
			}
		}
	}
	
	public void preOrderRe(Node node){
		node.display();
		preOrderRe(node.leftChild);
		preOrderRe(node.rightChild);
	}
	
	public void preOder(Node root){
		if(root ==null) return;
		Stack stack = new Stack();
		Node node =root;
		while(true){
			if(node!=null){
				node.display();
				stack.push(node);
				node=node.leftChild;
			}else{
				if(!stack.isEmpty()){
					node=stack.pop();
					node=node.rightChild;
				}else{
					break;
				}
			}
		}
	}
	
	public void levelOrder(Node root){
		if(root==null) return;
		Queue queue = new Queue();
		queue.deQueue(root);
		while(!queue.isEmpty()){
			Node node = queue.enQueue();
			if(node.leftChild!=null)
				queue.deQueue(node.leftChild);
			if(node.rightChild!=null)
				queue.deQueue(node.rightChild);
		}
		
	}
	
	public void postOrderRe(Node root){
		psotOrderRe(root.leftChild);
		postOrderRe(root.rightChild);
		root.display();
	}
	
	public void postOrder(Node root){
		if(node==null) return;
		Stack stack = new Stack();
		Stack output = new Stack();
		Node node = root;
		while(!stack.isEmpty() || node!=null){
			if(node!=null){
				stack.push(node);
				output.push(node);
				node=node.rightChild;
			}else{
				node=stack.pop();
				node=node.leftChild;
			}
		}
		while(!output.isEmpty()){
			display(output.pop());
		}
	}

}
