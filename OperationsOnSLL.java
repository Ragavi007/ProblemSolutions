package linkedList;

import java.util.Arrays;

import java.util.HashSet;
import java.util.Stack;

import linkedList.MyLinkedList;
import linkedList.Node;
 
public class OperationsOnSLL {

	public  static MyLinkedList intersection(Node head1,Node head2) {
		
		HashSet<Integer> hs=new HashSet<>();
	 	MyLinkedList intersection=new MyLinkedList();
		 
		while(head1!=null) {
		 
			hs.add( head1.data); 
			head1=head1.next;
			
		}
		
		while(head2!=null) {
			
			if(hs.contains(head2.data)) 
				intersection.insertAtEnd( head2.data);
	 
			head2=head2.next;
		}
		 
		return intersection;
	}
	
	
	public  static MyLinkedList union(Node head1,Node head2) {
		
		HashSet<Integer> hs=new HashSet<>();
		MyLinkedList union=new MyLinkedList();
		 
		while(head1!=null) {
		 
			hs.add( head1.data);
			union.insertAtEnd( head1.data);
			head1=head1.next;
			
		}
		
		while(head2!=null) {
			
			if(!hs.contains(head2.data)) 
				union.insertAtEnd( head2.data);
	 
			head2=head2.next;
		}
		 
		return union;
	}
	
	public static int length(Node head) {
		
		int cnt=0;
		while(head!=null) {
			cnt++;
			head=head.next;
		}
		return cnt;
		
	}
	
	public static void print(Node head) {
		
		while(head!=null) {
			System.out.print(head.data+"-->");
			head=head.next;
		}
		System.out.println();
		
	}
	
	public static void zigzag(Node head) {
		  
	 
		Node value=head;
		boolean flag=true;
		while(value.next.next!=null) {
			
			if(flag) {
				if(value.data>value.next.data) {
					int temp=value.data;
					value.data=value.next.data;
					value.next.data=temp;	
				}	
			}
			else
			{
				if(value.data<value.next.data) {
					 
					int temp=value.data;
					value.data=value.next.data;
					value.next.data=temp;
					
				}
			}
			
			flag=!flag;
			value=value.next;
			 
		}
		 
		print(head);
	}
	
	
	public static Node middleElement(Node head) {
		
		if(head==null)
			return head;
		
		Node slowPointer=head,fastPointer=head;
		
		while(slowPointer.next!=null && fastPointer.next.next!=null) {
			
			slowPointer=slowPointer.next;
			fastPointer=fastPointer.next.next;
		 	
		}
		
		return slowPointer;
	}
	
	public static void removeDuplicateFromSortedLL(Node head) {
		
		Node curr=head;
		
		while(curr!=null) {
			 
			Node temp=curr;
			
			while(temp!=null&& temp.data==curr.data) {
				temp=temp.next;
			}
			
			curr.next=temp;
			curr=curr.next;
		}
		
		print(head);
		
	}
	
	public static void removeDuplicateFromUnSortedLL(Node head) {
		
		Node curr=head;
		Node prev=null;
		
		HashSet<Integer> hs=new HashSet<>();
		
		while(curr!=null) {
			 
			int currval=curr.data;
			 
			if(hs.contains(currval)) {
				prev.next=curr.next;
			}else {
				hs.add( currval);
				prev=curr;
			}
			
			curr=curr.next;
			
		}
		
		print(head); 
		
	}
	
	public static void nthNodeFromEndofLL(Node head,int n) {
		
		Node pointer1=head,pointer2=head;int cnt=0;
		
		while(cnt<n) {
			 pointer1=pointer1.next;
			 cnt++;
		}
		
		while(pointer1!=null) {
			 
			pointer1=pointer1.next;
			pointer2=pointer2.next;
			
		}
		
		System.out.println(pointer2.data);
	}
	
	public static Node reverseLLUtil(Node curr,Node prev) {
	
		Node head=null;
		if(curr.next==null) {
			
			curr.next=prev;
			head=curr;
			 return head;
			 
		}
		 
		Node temp=curr.next;
		curr.next=prev;
		
		head=reverseLLUtil(temp,curr);
		return head;
	}
	
	public static Node reverseLL(Node head) {
		
	 
		return reverseLLUtil(head,null) ;
		
	}
	
	public static void rotateLL(Node head,int k) {
		
		int cnt=1;
		Node current=head;
		while(cnt<k) {
			current=current.next;
			cnt++;
		}
		
		if(current==null)
			return;
		
		Node kthNode=current;
		
		while(current.next!=null) {
			current=current.next;
		}
		
		current.next=head;
		
		head=kthNode.next;
		
		kthNode.next=null;
		
		print(head);
		
	}
	
	public static void sortingLL(Node head) {
		
		Node temp1=head;
		
		while(temp1!=null) {
			
			Node temp2=temp1.next;
			while(temp2!=null) {
				
				if(temp1.data>temp2.data) {
					
					int t=temp1.data;
					temp1.data=temp2.data;
					temp2.data=t;
					
				}
				
				temp2=temp2.next;
				
			}
			temp1=temp1.next;
		}
		
		print(head);
		
	}
	
	
	public static void add2NumbersRepresentedByLL(MyLinkedList L1,MyLinkedList L2,MyLinkedList res) {
		
		Node head1=L1.head,head2=L2.head; 
		 
		int len1=length(head1),len2=length(head2);
		
		if(len1>len2) {
			
			int diff=Math.abs( len1-len2);
			
			while(diff>0) {
				
				L2.insertAtBeg(0);
				diff--;
			}
			
		}
		else if(len2>len1) {
	 		
			int diff=Math.abs( len1-len2);
			
			while(diff>0) {
				
				L1.insertAtBeg(0);
				diff--;
			}
		 
		}	
		 
		Node sum=add2NumbersRepresentedByLLUtil(L1.head,L2.head,res);
		 
		if(carry==1) {
			res.insertAtBeg( 1);
			sum=res.head;
		}
		
		print(L1.head);
		print(L2.head);
		print(sum);
		
	}
	
	public static int carry=0;
	 
	
	public static Node add2NumbersRepresentedByLLUtil(Node head1,Node head2, MyLinkedList res) {
		
		if(head1==null && head2==null) {
			 return null;
		}
		
		add2NumbersRepresentedByLLUtil(head1.next,head2.next,res);
		
		int sum=head1.data+head2.data+carry;
		
		if(sum>10) {
			carry=1;
			sum=sum%10;
		}
		else {
			carry=0;
		}
		
		res.insertAtBeg( sum);
		 
		return res.head;
	}
	
	public static void reverseLLByGroupOfGivenSize( MyLinkedList list,int k) {
		
		Stack<Node> st=new Stack<>();
		
		Node current=list.head,prev=null;
		
		Node res=null;
		
		while(current!=null) {
			
			int cnt=0;
			while(cnt<k && current!=null) {
				
				cnt++;
				st.push(current);
				current=current.next;
			}
			
			while(!st.isEmpty()) {
				
				if(prev==null) {
					
					Node temp=st.peek();
					res=temp;
					prev=res;
					st.pop();
					
				}
				else
				{
					Node temp=st.peek();
					prev.next=temp;
					prev=temp;
					st.pop();
				}
				
			}
			
			
		}
		prev.next=null;
		
		print(res);
	}
	
	
	public static boolean isPalindrome(Node head) {
		
		Stack<Integer> s=new Stack<>();
		
		Node temp=head;
		
		while(temp!=null) {
			s.push( temp.data);
			temp=temp.next;
		}
		
		temp=head;
		
		while(!s.empty()) {
			
			if(s.peek()!=temp.data)
				return false;
			
			s.pop();
			temp=temp.next;
		}
		
		
		return true;
	}
	
	public static void deleteNodeWithoutHeadPointer(Node head,Node deleteNode) {
		 
		Node temp=deleteNode;
		temp.data=temp.next.data;
		temp.next=temp.next.next;
		
		
		print(head);
		
	}
	
	
	public static void detectAndRemoveLoop(Node head) {
		
		HashSet<Node> hs=new HashSet<>();
		
		Node temp=head,prev=null;
		
		while(temp!=null) {
			
			if(hs.contains( temp)) {
	
				System.out.println("detected loop...");
				prev.next=null; 
				break;
			}
			else {
				prev=temp;
				hs.add( temp);
			}
			
			temp=temp.next;
		}
		
		print(head);
		
	}
	
	public static Node Sorted(Node a,Node b) {

		Node result=null;
		
		if(a==null)
			return b;
		if(b==null)
			return a;
		
		if(a.data<=b.data) {
			
			result=a;
			result.next=Sorted(a.next,b);
			
		}
		else {
			
			result=b;
			result.next=Sorted(b.next,a);
			
		}
		
		return result;
	}
	
	
	public static Node MergeSortOnLL(Node head) {
		
		if(head==null||head.next==null)
			return  head;
		
		Node middle= middleElement(head);
		
		Node temp=middle.next;
		
		middle.next=null;
		
		Node left=MergeSortOnLL(head);
		
		Node right=MergeSortOnLL(temp);
		
		Node sortedList=Sorted(left,right);
		
		return sortedList; 
		
	}
	
	 
	
	
	public static void insertNodeInSortedLL(Node head,int data) {
		
		
		Node temp=head;
		Node node=new Node(data); 
		
		if(head==null)
			head=node;
		else if(head.next==null)
			head.next=node;
		else {
			
			Node prev=null;
			while(temp.data<data && temp.next!=null) {
				prev=temp;
				temp=temp.next;
			}
			prev.next=node;
			node.next=temp;
		}
		
		print(head);
	}
	
	
	public static void sortLLZerosOnesTwos(Node head) {
		
		Node temp=head;
		int[] count=new int[3];
		Arrays.fill( count, 0);
		
		while(temp!=null) {
			
			count[temp.data]++;
			temp=temp.next;
		}
		
		int i=0;
		temp=head;
		while(temp!=null) {
			 
			if(count[i]<=0) {
				i++;
			}
			else
			{ 
				temp.data=i;
				count[i]--;
				temp=temp.next;
			}
		}
		 
		print(head);
	}
	
	
	public static void pairwiseSwap(Node head) {
		
		Node temp=head;
		
		while(temp!=null && temp.next!=null) {
			
			int k=temp.data;
			temp.data=temp.next.data;
			temp.next.data=k;
			temp=temp.next.next;
			
		}
		
		print(head);
	}
	
	
	public static void intersectionPoint2LL(Node head1,Node head2) {
		
		Node temp1=head1,temp2=head2;
		HashSet<Node> hs=new HashSet<>();  
		
		while(temp1!=null) {
			
			hs.add( temp1);
			temp1=temp1.next;
		}
		
		
		while(temp2!=null) {
			
			if(hs.contains( temp2)) {
				
				System.out.println(temp2.data);
				break;
			}
			temp2=temp2.next;
		}
		
		
	}
	
	
	public static void rearrangeLL(Node head) {
		
		Node middle=middleElement(head);
		Node temp2=middle.next;
		middle.next=null;
		Node temp1=head;
		
		Node reversedTemp2=reverseLL(temp2);
		
		MyLinkedList l=new MyLinkedList();
		
		print(temp1);
		print(reversedTemp2);
		
		while(temp1!=null || reversedTemp2!=null) {
			
			if(temp1!=null) {
				 l.insertAtEnd( temp1.data);
				 temp1=temp1.next;
			}
			
			if(reversedTemp2!=null) {
				l.insertAtEnd( reversedTemp2.data);
				reversedTemp2=reversedTemp2.next;
			}
			
		}
		
		print(l.head);
	}
	
	public static void main(String[] args) {
 
/*		
		// union and intersection
		
		MyLinkedList list1=new  MyLinkedList();
		  
		list1.insertAtEnd(10);
		list1.insertAtEnd(4);
		list1.insertAtEnd(5);
		list1.insertAtEnd(7);

		list1.insertAtEnd(14);
		list1.insertAtEnd(25);
		list1.insertAtEnd(72);
	 
		list1.print();
		
		MyLinkedList list2=new MyLinkedList();
 		
		list2.insertAtEnd(10);
		list2.insertAtEnd(2);
		list2.insertAtEnd(4);
		list2.insertAtEnd(8);
	 
		list2.print();
 		
		MyLinkedList intersection=intersection(list1.head,list2.head);
		intersection.print();
		
		MyLinkedList union=union(list1.head,list2.head);
		union.print();
 		
		// zigzag and middle element
		
		MyLinkedList list3=new MyLinkedList();
 		
		list3.insertAtEnd(11);
		list3.insertAtEnd(15);
		list3.insertAtEnd(20);
		list3.insertAtEnd(5);
		list3.insertAtEnd(10);
		
		System.out.println("Middle ele is "+middleElement(list3.head));
		
		zigzag(list3.head);
		
		// remove duplicate from sorted LL
		 
		MyLinkedList list4=new MyLinkedList();
 		
		list4.insertAtEnd(11);
		list4.insertAtEnd(11);
		
		list4.insertAtEnd(21);
		list4.insertAtEnd(43);
		list4.insertAtEnd(11);
		list4.insertAtEnd(43);
		list4.insertAtEnd(60);
		
		removeDuplicateFromUnSortedLL(list4.head);
		
		nthNodeFromEndofLL(list4.head,1);
		
		reverseLL(list4.head);
		
		rotateLL(list1.head,3);
		 
		sortingLL(list1.head);
		
 
		
		MyLinkedList list5=new MyLinkedList(); 
		
		list5.insertAtBeg( 9);
		list5.insertAtBeg( 3);
		list5.insertAtBeg( 9);
	
		MyLinkedList result=new MyLinkedList();
		
		add2NumbersRepresentedByLL(list1,list5,result);
		
		print(list1.head);
		reverseLLByGroupOfGivenSize(list1,3);
		
		
		MyLinkedList d=new MyLinkedList();
		d.insertAtEnd( 10);
		d.insertAtEnd( 20);
		d.insertAtEnd( 30);
		d.insertAtEnd( 40);
		d.insertAtEnd( 50);
		deleteNodeWithoutHeadPointer(d.head,d.head.next.next);
		
		MyLinkedList palin=new MyLinkedList();
		palin.insertAtEnd(1);
		palin.insertAtEnd(2);
		palin.insertAtEnd(3);
		palin.insertAtEnd(2);
		palin.insertAtEnd(2);
		
		 System.out.println(isPalindrome(palin.head));
		
		 MyLinkedList loop=new MyLinkedList();
		 loop.insertAtEnd( 20);
		 loop.insertAtEnd( 4);
		 loop.insertAtEnd( 15);
		 loop.insertAtEnd( 10);
		 
		 loop.head.next.next.next.next = loop.head; 
		 
		 detectAndRemoveLoop(loop.head);
		 
		
		 Node temp=MergeSortOnLL(list1.head);
		 print(temp);
		 

		
		 MyLinkedList list8=new MyLinkedList();
		 list8.insertAtEnd( 1);
		 list8.insertAtEnd( 2);
		 list8.insertAtEnd( 3);
		 list8.insertAtEnd( 5);
		 list8.insertAtEnd( 6);
		 insertNodeInSortedLL(list8.head,4);
	
		 
		 MyLinkedList list9=new MyLinkedList();
		 list9.insertAtEnd( 2);
		 list9.insertAtEnd( 2);
		 list9.insertAtEnd( 1);
		 list9.insertAtEnd( 0);
		 list9.insertAtEnd( 1);
		 list9.insertAtEnd( 1);
		 
		 sortLLZerosOnesTwos(list9.head); 
		 
*/
		MyLinkedList list10=new MyLinkedList();
		 list10.insertAtEnd( 1);
		 list10.insertAtEnd( 2);
		 list10.insertAtEnd( 3);
		 list10.insertAtEnd( 4);
		 list10.insertAtEnd( 5);
		 list10.insertAtEnd( 6);
		 list10.insertAtEnd( 7);
		 
		 zigzag(list10.head);
		 
		 pairwiseSwap(list10.head);
		 
		 
		MyLinkedList list11=new MyLinkedList();
		MyLinkedList list12=new MyLinkedList();
		 
		list11.insertAtEnd( 1);
		list11.insertAtEnd( 2);
		list11.insertAtEnd( 3);
		list11.insertAtEnd( 13);
		list11.insertAtEnd( 5);
		
		list12.insertAtEnd( 11);
		list12.insertAtEnd( 12);
		list12.insertAtEnd( 13);
		list12.insertAtEnd( 14);
		
		list11.head.next.next.next=list12.head.next.next;
		
		 intersectionPoint2LL(list11.head,list12.head);
		  
		 rearrangeLL(list12.head);
		 
		 
		/*
		list1.insertAtBeg(1);
		list1.insertAtMiddle(44,5);
		System.out.println("----");
		list1.deleteAtBeg();
		list1.print();
		System.out.println("----");
		list1.deleteAtEnd();
		list1.print();
		System.out.println("----");
		list1.deleteAtMiddle(1);
		list1.print();
	

		 */
	}

}
