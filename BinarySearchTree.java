package tree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class Node{
	
	int data;
	Node left,right;
	
}


public class BinarySearchTree {

	Node root=null;
	
	public Node create(int data) {
		Node temp=new Node();
		temp.data=data;
		temp.left=null;
		temp.right=null;
		return temp;
	}
	 
	public void insert(int data ) {
		 
		root= insertUtil(data,root);
		
	}
 	
	public Node insertUtil(int data,Node root) {
		
		if(root==null) {

			Node  node=create(data);
			root=node;
			return node;
		}
		
		if(root.data<data) {
			root.right=insertUtil(data,root.right);
		}
		else if(root.data>data) {
			root.left=insertUtil(data,root.left);
		}
		
		return root;
		
	}
	
	public void delete(int data) {
		root=deleteUtil(data,root);
	}
	 
	public Node deleteUtil(int data,Node root) {
		
		if(root==null)
			return root;
		
		if(root.data>data)
			root.left=deleteUtil(data,root.left);
		else if(root.data<data)
			root.right=deleteUtil(data,root.right);
		else {
			
			if(root.left==null)
				return root.right;
			
			if(root.right==null)
				return root.left;
			
			root.data=getMinimum(root.right);
			
			root.right=deleteUtil(root.data,root.right);
		}
		return root;
		
	}
	
	public int getMinimum(Node root) {
		
		int minimum=root.data;
		
		while(root!=null) {
			
			minimum=root.data;
			root=root.left;
			
		}
		
		return minimum;
	}
	

	public int getMaximum(Node root) {
		
		int maximum=root.data;
		
		while(root!=null) {
			
			maximum=root.data;
			root=root.right;
			
		}
		
		return maximum;
	}
	
	public void inOrderTraversal(Node root) {
		
		if(root!=null) {
		
		inOrderTraversal(root.left);
		System.out.print(root.data+"\t");
		inOrderTraversal(root.right); 
		
		} 
	}
	
	public void preOrderTraversal(Node root) {
		
		if(root!=null) {
			
			System.out.print( root.data+"\t");
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
			
		}		
	}
 
	public void postOrderTraversal(Node root) {
		
		if(root!=null) {
		
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			System.out.print( root.data+"\t");

		}		
	}
	
	
	 
	public static void main(String[] args) {
	 
		BinarySearchTree b=new BinarySearchTree();
		
		b.insert( 8);
		b.insert( 3);
		b.insert( 6);
		b.insert( 1);
		b.insert( 4);
		b.insert( 7); 
		
 		
		b.insert( 10);
		b.insert( 14);
		b.insert( 13);
 
		b.inOrderTraversal( b.root);
		System.out.println();
		b.preOrderTraversal(b.root);
		System.out.println();
		b.postOrderTraversal( b.root);
		System.out.println();
		b.delete( 8);
		b.inOrderTraversal( b.root);
		System.out.println();

		
	}

}
 