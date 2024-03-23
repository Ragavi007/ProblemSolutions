package array;
//Find an array element using Linea Search
//Time Complexity = O(n)

public class LinearSearch {
	
	public static int search(int arr[],int x) {
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]==x)
				return i;
		}
		return -1;
		
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		int x = 5;
		int index = search(arr,x);
		if(index == -1)
			System.out.println("The Element"+x+" is not present in the array");
		else
			System.out.println("The Element "+x+"is  present in the array at "+index);

	}

}
