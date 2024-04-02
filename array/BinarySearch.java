package array;
//Find an array element by using Binary Search
///Time Complexity = O(log n), where n is the number of elements in the array.
public class BinarySearch {
	public static int binSearch(int[] arr,int l,int r,int key) {
		while(l<=r) {
			int m = (l+r)/2;
			if(arr[m] == key ) {
				return m;
			}else if(arr[m]>key){
				r = m-1;
				
			}else if (arr[m]<key) {
				 l = m+1;
			}
		       
		}
	  return -1;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,33,44,55,66,77};
		int r = arr.length,l=0;
		int key = 99;
		int result = binSearch(arr,l,r,key);
		if(result == -1)
			System.out.println("Element is not found");
		else 
			System.out.println("Element is found at the index"+result);
			
		
	}

}
