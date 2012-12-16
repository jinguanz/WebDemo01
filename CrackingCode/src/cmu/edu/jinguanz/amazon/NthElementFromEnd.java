package cmu.edu.jinguanz.amazon;
/**
 * Nth largest element in a binary search tree
 * @author jinguangzhou
 *
 */

public class NthElementFromEnd {
    private BinaryTree tree=null;
    int currCount=0;
    public NthElementFromEnd(int[] dataArray) {
        this.tree=new BinaryTree(dataArray);

    }
    private void getElementFromEnd(int n){
        getElementFromEnd(this.tree.getRoot(),n);
    }
    private void getElementFromEnd(BinaryTreeNode node,int n){
        if(node!=null){
            if(currCount<n){
            getElementFromEnd(node.getRightChild(),n);//reverse inorder
            currCount++;
            }

            if(currCount==n)// if the question is that get two highset number, then set currCount<=2
            {
                System.out.print(" "+node.getData());
                return;
            }
            if(currCount<n){
            getElementFromEnd(node.getLeftChild(),n);
            currCount++;
            }
            
        }
    }

    public static void main(String args[]){
        int data[]={1,2,3,4,5,6,7,8,9};
        int n=2;
        new NthElementFromEnd(data).getElementFromEnd(n);
    }
}
