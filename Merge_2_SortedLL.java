package linkedList;

public class Merge_2_SortedLL {

	static Node merge2LL(Node A,Node B)
	{
		if(A==null)
			return B;
		
		if(B==null)
			return A;
		
		if(A.data<B.data)
		{
			A.next=merge2LL(A.next,B);
			return A;
		}
		else
		{
			B.next=merge2LL(A,B.next);
			return B;
		}
		
	}
	
	public static void main(String[] args) {
	 
		MyLinkedList l1=new MyLinkedList();
		
		l1.insertAtBeg( 15);
		l1.insertAtBeg( 10);
		l1.insertAtBeg( 5);
		
		MyLinkedList l2=new MyLinkedList();
		
		l2.insertAtBeg( 20);
		l2.insertAtBeg( 3);
		l2.insertAtBeg( 2);
		
		Node merged=merge2LL(l1.head,l2.head);
		
		while(merged!=null)
		{
			System.out.print(merged.data+"-->");
			merged=merged.next;
		}
		
	}

}
