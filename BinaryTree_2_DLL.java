package tree;

public class BinaryTree_2_DLL {

	static Nodee prev=null,head=null;
	
	static void convert(Nodee root)
	{
		if(root==null)
			return;
		
		convert(root.left);
		
		if(prev==null)
			head=root;
		else
		{
			prev.right=root;
			root.left=prev;
		}
		
		prev=root;
		
		convert(root.right);
	}
	
	public static void main(String[] args) {
		 
		Nodee root=null;
		
		Nodee leaf1=new Nodee(4,null,null);
		Nodee leaf2=new Nodee(5,null,null);
		Nodee leaf3=new Nodee(6,null,null); 
		Nodee leaf5=new Nodee(8,null,null);
		
		Nodee p1=new Nodee(7,null,leaf5);
		Nodee gp1=new Nodee(2,leaf1,leaf2);
		Nodee gp2=new Nodee(3,leaf3,p1);
		root=new Nodee(1,gp1,gp2);

		convert(root);
		
		Nodee temp=head;
		while(temp.right!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.right;
		}
		System.out.print(temp.data+" ");
		
		System.out.println();
		while(temp.left!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.left;
		}
			
		System.out.print(temp.data+" ");
	}

}
