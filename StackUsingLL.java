package linkedList;

import linkedList.MyLinkedList;
import linkedList.Node;

public class StackUsingLL {

	static Node top=null;
	
	public static int peek() {		 
		return top.data;
	}
	 
	public static void pop() {
		top=top.next;
	}
	 
	public static void push(int data) {
		
		Node node=new Node(data);
		node.next=top;
		top=node;
		
	}
	
	public static void display(Node head) {
		 
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		 
		StackUsingLL obj=new StackUsingLL();
		obj.push( 1);
		obj.push( 2);
		obj.push( 3);
		obj.push( 4);
		
		display(obj.top);
		System.out.println(obj.peek());
		 
	}
}
