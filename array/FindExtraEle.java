package array;
//find the index of the extra element in the array1 by Comparing the elements in array2
//Time Complexity =  O(n) 

public class FindExtraEle {
	public static int findExtra(int[] a,int[] b,int n) {
		for(int i =0;i<n;i++)
			if(a[i] != b[i])
				return i;
	
		return n;
	}

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6};
		int[] b = {1,2,3,4,5,6,7};
		int n = a.length;
		int extra = findExtra(a,b,n);
		System.out.println(extra);
	}

}
