package array;
 
import java.util.Arrays;

public class Count_pairs_difference_equal_k {

	public static void main(String[] args) {
		 
		 int arr[] =  {1, 5, 3, 4, 2};int k=3; 
		 
		 Arrays.sort(arr);
		 
		 int left=0,right=0,cnt=0;
		 
		 while(right<arr.length)
		 {
			 if(arr[right]-arr[left]==k)
			 {
				 cnt++;left++;right++;
			 }
			 else if(arr[right]-arr[left]>k)
				 left++;
			 else
				 right++;
			 
		 }

		 System.out.println(cnt); 
	}

}
