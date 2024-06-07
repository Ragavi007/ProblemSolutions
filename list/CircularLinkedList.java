package linkedList;
 
public class CircularLinkedList {
 
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
				temp.next=head;
			}else {
				
				Node traverser=head;
				while(traverser.next!=head) { 
					traverser=traverser.next;
				}
				traverser.next=temp;
				temp.next=head;
			}
			
		}
		
		public void insertAtBeg(int data) {	
			
			Node temp=create(data);
			if( head==null) {
				 head=temp;
				 temp.next=head;
			}else {
				
				Node local=head;
				while(local.next!=head) {
					local=local.next;
				}
				temp.next=head;
				head=temp;
				local.next=head;
			}
			
		}
		
		public  void insertAtMiddle(int data,int position) {
			
			Node temp=create(data);
			if( head==null) {
				 head=temp;
				 temp.next=head;
			}else {
				
				Node traverser= head;Node Prev=null;
				for(int i=0;i<position;i++) {
					Prev=traverser;
					traverser=traverser.next;
				}
				Prev.next=temp;
				temp.next=traverser;
			}
			
		}
		
		public void deleteAtBeg() {
			
			Node local=head;
			
			while(local.next!=head) {
				local=local.next;
			}
			
			 head=head.next;
			 local.next=head;
		}
		
		public void deleteAtEnd() {
			
			Node temp=head ;
			
			while(temp.next.next!=head) {
			 
				temp=temp.next;
			}
			temp.next=head; 
		}
		
		public void deleteAtMiddle(int position) {
			
			Node temp=head;Node Prev=null;
			
			for(int i=0;i<position;i++) {
				Prev=temp;
				temp=temp.next;
			}
			Prev.next=temp.next;
			
		}
		
		public void print() {
			
			Node traverser= head;
			while(traverser.next!=head) {
				System.out.print(traverser.data+"-->");
				traverser=traverser.next;
			}
			System.out.print( traverser.data);
			System.out.println();
		}
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CircularLinkedList cll=new CircularLinkedList();
		cll.insertAtBeg( 1);
		cll.insertAtBeg( 0);
		cll.print();
		cll.insertAtEnd( 2);
		cll.print();
		cll.insertAtMiddle( 3, 2);
		cll.print();
		cll.deleteAtBeg();
		cll.print();
		cll.deleteAtEnd();
		cll.print();
		
	}

}
