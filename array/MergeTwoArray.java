package array;
//Merge the given two array into a single array
//Time Complexity = O(M + N) Here, M is the length of array a and N is the length of array b.

import java.util.Arrays;

public class MergeTwoArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int b[] = {6,7,8,9,10};
		int a1 = a.length;
		int b1 = b.length;
		int c1 = a1+b1;
		int[] c = new int[c1];
		
		//System.arraycopy(a,0,c,0,a1);
		//System.arraycopy(b,0,c,a1,b1);
		//System.out.print(Arrays.toString(c));
		for(int i = 0;i<a1;i++) {
			c[i] = a[i];
		}
		for(int i = 0;i<b1;i++) {
			c[a1+i] = b[i];
		}
		
		System.out.print(Arrays.toString(c));
		//for(int i = 0;i<c1;i++) {
		//System.out.println(c[i]);
		//}

	}

}
