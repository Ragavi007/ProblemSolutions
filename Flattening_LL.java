package linkedList;
 

public class Flattening_LL {

	
	static Node merge2LL(Node A,Node B)
	{
		if(A==null)
			return B;
		
		if(B==null)
			return A;
		
		if(A.data<B.data)
		{
			A.down=merge2LL(A.down,B);
			return A;
		}
		else
		{
			B.down=merge2LL(A,B.down);
			return B;
		}
	}
	
	static Node flatten(Node root)
	{
		
		if(root==null || root.next==null)
			return root;
		
		
		Node right=flatten(root.next);
		
		root=merge2LL(root,right);
		
		return root;
		
	}
	
	public static void main(String[] args) {
	 
		Node root=new Node(5);
		root.down=new Node(7);
		root.down.down=new Node(8);
		root.down.down.down=new Node(30); 
		
		//
		root.next=new Node(10);
		root.next.down=new Node(20);
		
		
		//
		
		root.next.next=new Node(19);
		root.next.next.down=new Node(22);
		root.next.next.down.down=new Node(50);
		
		//
		
		root.next.next.next=new Node(28);
		root.next.next.next.down=new Node(35);
		root.next.next.next.down.down=new Node(40); 
		root.next.next.next.down.down.down=new Node(45);
		
		Node temp=flatten(root);
		
		while(temp!=null)
		{
			System.out.print( temp.data+" ");
			temp=temp.down;
		}
		
	}

}
