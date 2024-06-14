package linkedList;
 

class Node{
	int data;
	Node next;
	
	Node down;
	
	Node(int data){
		this.data=data;
	}
}
 


public class MyLinkedList {

	 Node head;
 	 
		public Node create(int data) {
			
			Node temp=new Node(data);
			temp.next=null;
			return temp;
		}
		
		public void insertAtEnd(int data) {
			
			Node temp=create(data);
			
			if(head==null) {
				head=temp;
			}else {
				
				Node traverser=head;
				while(traverser.next!=null) { 
					traverser=traverser.next;
				}
				traverser.next=temp;
			}
			
		}
		
		public void insertAtBeg(int data) {	
			
			Node temp=create(data);
			
			if( head==null) {
				 head=temp;
			}else {
				temp.next=head;
				 head=temp;
			}
			
		}
		
		public  void insertAtMiddle(int data,int position) {
			
			Node temp=create(data);
			if( head==null) {
				 head=temp;
			}else {
				
				Node traverser= head;
				Node Prev=null;
				for(int i=1;i<position;i++) {
					Prev=traverser;
					traverser=traverser.next;
				}
				Prev.next=temp;
				temp.next=traverser;
			}
			
		}
		
		public void deleteAtBeg() {
			 head=head.next;
		}
		
		public void deleteAtEnd() {
			
			Node temp=head;
			
			while(temp.next.next!=null) {
				temp=temp.next;
			}
			temp.next=null;
			
		}
		
		public void deleteAtMiddle(int position) {
			
			Node temp=head;Node Prev=null;
			
			for(int i=1;i<position;i++) {
				Prev=temp;
				temp=temp.next;
			}
			Prev.next=temp.next;
			
		}
		
		public void print() {
			
			Node traverser= head;
			while(traverser!=null) {
				System.out.print(traverser.data+"-->");
				traverser=traverser.next;
			}
			System.out.println();
		}
		
		
}
