package array;
//Insert an Element in an Unsorted Array
//Time Complexity = O(1) 

public class Insertion {
	public static int inserAtEnd(int n,int[]arr,int size,int key) {
		if(n>=size)
			return n;
	arr[n] = key;
	return (n+1);
	
	}

	public static void main(String[] args) {
		int[] arr = new int[12];
		arr[0] =10;
		arr[1] =1;
		arr[2] =2;
		arr[3] =3;
		arr[4] =4;
		
		int n=5,key = 64;
		int size = 12;
		System.out.print("Before insertion : ");
		for(int i =0;i<n;i++) {
			System.out.print(arr[i]+" ");
			}
		System.out.println();
		System.out.print("After insertion : ");
		n = inserAtEnd(n,arr,size,key);
		for(int i =0;i<n;i++) {
			System.out.print(arr[i]+" ");
			}
		
	}

}
