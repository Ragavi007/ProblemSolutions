package array;
//Find the number of inversions in an Array
//Time Complexity = O(n^2)

public class InversionOfArray {

	public static void main(String[] args) {
		int arr[] = {2,1,4,3,5};
		int count = 0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j])
					count++;
			}
		}
     System.out.println(count);
	}

}
