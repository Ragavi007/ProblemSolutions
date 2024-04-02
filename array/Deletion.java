package array;
//Delete an Element in an Unsorted Array
//Time Complexity = O(N) 
public class Deletion {
	public static int findElement(int n,int[] arr,int key) {
		for(int i =0;i<n;i++) {
			if(arr[i] == key)
				return i;
		}
		return -1;	
	}
	
    public static int deleteElement(int n,int[] arr,int key) {
		int pos = findElement(n,arr,key);
		if(pos == -1) {
			System.out.print("Element not found ");
			return n;
		}
		for(int i = pos;i<n-1;i++)
			arr[i] = arr[i+1];
		
		return n-1;
	}
    
	public static void main(String[] args) {
     int[] arr = {1,2,3,4,5,6,7,8,9,10};
     int n = arr.length;
     int key = 9;
     
     System.out.println("Array before deletion");
     for (int i = 0; i < n; i++)
         System.out.print(arr[i] + " ");
     
     System.out.println();
     n = deleteElement(n,arr,key);
     System.out.println("Array after deletion");
     for (int i = 0; i < n; i++)
         System.out.print(arr[i] + " ");

	}
}
