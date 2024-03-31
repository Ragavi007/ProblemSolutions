package array;
//Reverse the given Array
//Time Complexity = O(n)
public class ReverseArray {
    public static void revArr(int[] arr) {
    	int n = arr.length;
    	int[] reversedArr = new int[n];
    	for(int i=0,j=n-1;i<n && j>=0;i++,j--) {
    		reversedArr[i]= arr[j];
    	}
    	System.out.print("Reversed Array : ");
    	for(int i : reversedArr) {
    		System.out.print(i + " ");
    	}
    	
    }
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		revArr(arr);
	}

}
