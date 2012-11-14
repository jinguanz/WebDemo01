package cmu.edu.jinguanz.amazon;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class BinaryTreeUtils {
	
		 
	    /**
	     * Takes the root node of one tree, and the root node of another tree and
	     * determines if they're structurally the same (i.e. do they have the same
	     * structure and same values in each of the nodes).
	     */
	    public static boolean isSame( Node a, Node b ) 
	   {
	        // Both trees are empty, and thus equal.
	        if( a == null && b == null ) 
	        {
	            return true;
	        }
	        // Both trees are not empty, so that's check in detail if they match.
	        else if( a != null && b != null ) 
	        {
	            // Check first if the current nodes have the same data, before
	            // checking recursively their left subtree and/or right subtree.
	            return a.data.equals( b.data ) && 
	                isSame( a.left, b.left ) && isSame( a.right, b.right );
	        }
	        // One of the trees is, so no need to check in detail.
	        else 
	        {
	            return false;
	        }
	    }
	 
	    /** Serializes the tree pointed out by the node */
	    public static void serialize( final OutputStream out, Node node ) throws IOException
	    {
	 
	        if( node == null )
	        {
	            out.write( "()".getBytes( ) );// leaf node
	        } 
	         else 
	        {
	            out.write( "(".getBytes( ) );// Encodes this String into a sequence of bytes using the platform's default charset, storing the result into a new byte array.
	            out.write( ( node.data + "" ).getBytes( ) );//Writes b.length bytes from the specified byte array to this output stream.
	            serialize( out, node.left ); //preOrder
	            serialize( out, node.right );
	            out.write( ")".getBytes( ) );
	        }
	    }
	 
	    /** Deserializes the tree and returns its root node */
	    public static Node deserialize( final BufferedInputStream reader ) throws IOException {
	 
	        if( reader.available( ) > 0 ) {//Returns the number of bytes that can be read (or skipped over) from this input stream without blocking by the next caller of a method for this input stream. The next caller might be the same thread or or another thread.
	            char c = ( char ) reader.read( );
	 
	            if( c == '(' )
	            {
	                     if( reader.available( ) > 0 ) 
	                     {
	 
	                          c = ( char ) reader.read( );//Marks the current position in this input stream. A subsequent call to the reset method repositions this stream at the last marked position so that subsequent reads re-read the same bytes.
	                          if( c == ')' ) {
	                          return null;
	                     }
	 
	                    StringBuffer sb = new StringBuffer( );
	                    while( c != ')' && c != '(' ) {
	                        sb.append( c );
	 
	                        if( reader.available( ) > 0 ) {
	                            reader.mark( 1 );
	                            c = ( char ) reader.read( );
	                        } else {
	                            break;
	                        }
	                    }
	 
	                    Node newNode = new Node( sb.toString( ) );
	 
	                    if( c == '(' ) {
	                        reader.reset( );//Repositions this stream to the position at the time the mark method was last called on this input stream.
	                        newNode.left = deserialize( reader );
	                        newNode.right = deserialize( reader );
	                    }
	 
	                    if( reader.available( ) > 0 ) {
	                        reader.mark( 1 );
	                        c = ( char ) reader.read( );
	                        if( c != ')' ) {
	                            reader.reset( );
	                        }
	                    }
	 
	                    return newNode;
	                }
	            }
	        }
	 
	        // There's nothing to process.
	        return null;
	    }
	 
	    /** Test Method */
	    public static void main( String[ ] args ) throws Exception {
	 
	        BinarySearchTree bst = new BinarySearchTree( );
	        String[ ] input = 
	            { "mlb", "cpe", "cma", "wno", "btu", "keh", "gaj", "yft", "lcu", "sgy" };
	 
	        // Populate the tree
	        for( String inputString : input )
	        {
	            bst.insert( inputString );
	        }
	 
	        bst.preorder(bst.root);
	 
	        OutputStream f0 = new FileOutputStream("/Users/jinguangzhou/Desktop/tree.txt"); 
	        // Serialize the tree, and print the output to the screen.
	        try {
	            System.out.println( "Serialization Output:" );
	            BinaryTreeUtils.serialize( f0, bst.root );
	        } catch( IOException e ) {
	            e.printStackTrace( );
	        }
	 
	        
	 
	        // Deserialize the tree located in c:/java/tree.txt and check if it's the same. 
	        try {
	            BinarySearchTree bst2 = new BinarySearchTree( );
	            bst2.root = BinaryTreeUtils.deserialize( 
	                new BufferedInputStream( new FileInputStream( "/Users/jinguangzhou/Desktop/tree.txt" ) ) );
	 
	            System.out.println( "\n\nDeserialization Confirmation:" );
	            System.out.println( "bst2 is the same as bst1? " + 
	                ( BinaryTreeUtils.isSame( bst.root, bst2.root ) ? "Yes!" : "No." ) );
	 
	        } catch( FileNotFoundException e ) {
	            e.printStackTrace( );
	        } catch( IOException e ) {
	            e.printStackTrace( );
	        }
	    }
	}
	/** Node of a Binary Search Tree */
	class Node {
	    Node parent, left, right;
	    String data;
	    public Node( String data ) {
	        this.data = data;
	    }
	}
	 
	/** Binary Search Tree */
	class BinarySearchTree 
	{
	 
	    /** Root node of the binary search tree. */
	    public Node root;
	 
	    /**
	     * Inserts a new node that has the specified data. The insert starts from
	     * the root of the tree and goes all the way down until it finds a spot to
	     * place the new node.
	     */
	    public void insert( String data )
	    {
	        root = insert( root, data );
	    }
	 
	    /**
	     * Inserts a new node that has the specified data. The insert starts from
	     * the specified node of the tree and goes all the way down until it finds 
	     * a spot to place the new node.
	     */
	    public Node insert( Node node, String data ) {
	        if( node == null ) {
	            // Found a spot to insert new node.
	            node = new Node( data );
	        } else if( data.compareTo( node.data ) < 0) {
	            // Insert in left subtree
	            node.left = insert( node.left, data );
	            node.left.parent = node;
	        } else {
	            // Insert right subtree.
	            node.right = insert( node.right, data );
	            node.right.parent = node;
	        }
	        // Done!
	        return node;
	    }
	    void preorder(Node n)
	    {
	        if(n==null) return;
	        System.out.println(n.data);
	        preorder(n.left);
	        preorder(n.right);
	    }
	 
	    // ...
	}


