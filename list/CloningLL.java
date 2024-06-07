package linkedList;

import java.util.HashMap;

class CloneNode{
	
	int data;
	CloneNode next,random;
	
}
 
public class CloningLL {

	CloneNode head;

	HashMap<CloneNode,CloneNode> hs=new HashMap<>();
	
	public CloneNode create(int data) {
		
		CloneNode node=new CloneNode();
		node.data=data;
		node.next=null;
		node.random=null;
		
		return node;
	}
	
	public void push(int data) {
		
		CloneNode temp=create(data);
		if(head==null) {
			head=temp;
		}
		else {
			temp.next=head;
			head=temp;
		}
		
	}
	
	public void print(CloneNode temp) {
		 
		while(temp!=null) {
		
			System.out.print("Data "+temp.data+"\t");
			
			CloneNode random=temp.random;
			
			if(random==null) {
				System.out.println("random  -1");
			}
			else {
			System.out.println("random "+random.data);
			}
			temp=temp.next;
		}
		
	}
	
	
	public void makeClone() {
		
		CloneNode original=head;
		while(original!=null) {
			
			CloneNode node=new CloneNode();
			node.data=original.data;
			hs.put(original, node);
			original=original.next;
		}
		
		original=head;
		CloneNode clonecurr;
		
		while(original!=null) {
			
			clonecurr=hs.get( original);
			clonecurr.next=hs.get( original.next);
			clonecurr.random=hs.get(original.random);
			original=original.next;
			
		}
		
		print(hs.get(head));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CloningLL list=new CloningLL();
		list.push( 5);
		list.push( 4);
		list.push( 3);
		list.push( 2);
		list.push( 1);
		
		list.head.random = list.head.next.next; 
        list.head.next.random = 
            list.head.next.next.next; 
        list.head.next.next.random = 
            list.head.next.next.next.next; 
        list.head.next.next.next.random = 
            list.head.next.next.next.next.next; 
        list.head.next.next.next.next.random = 
            list.head.next; 
  
        list.print(list.head);
        list.makeClone();
	}

}
