package array;
//Insert an Element in an Unsorted Array
//Time Complexity = O(N) 


public class InsertionAtPos{
	public static void insertAtPos(int n,int[] arr,int key,int pos) {
		for(int i=n-1;i>=pos;i--) 
			arr[i+1]=arr[i];
		
		arr[pos]=key;
		
	}

	public static void main(String[] args) {
		int[] arr = new int[12];
		arr[0] =10;
		arr[1] =1;
		arr[2] =2;
		arr[3] =3;
		arr[4] =4;
		
		int n=5,key = 64,pos = 2;
		int size = 12;
		System.out.print("Before insertion : ");
		for(int i =0;i<n;i++) {
			System.out.print(arr[i]+" ");
			}
		System.out.println();
		System.out.print("After insertion : ");
		insertAtPos(n,arr,key,pos);
		n += 1;
		for(int i =0;i<n;i++) {
			System.out.print(arr[i]+" ");
			}

	}

}
