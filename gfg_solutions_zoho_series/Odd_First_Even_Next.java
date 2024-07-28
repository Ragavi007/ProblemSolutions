package gfg_Solutions;
/*Given an array arr[] of positive integers.
Your task is to sort them so that the first part of the array contains odd numbers sorted in descending order,
and the rest of the portion contains even numbers sorted in ascending order.
*/

import java.util.Arrays;

public class Odd_First_Even_Next {
	 public static void segregateOddEven(int[] arr) {
		 for(int i =0;i<arr.length;i++) {
			 if(arr[i]%2 == 1)
				 arr[i] *= -1;
			 }
		 Arrays.sort(arr);
		 for(int i =0;i<arr.length;i++) {
			 arr[i] = Math.abs(arr[i]);
			 System.out.print(arr[i] + " ");
		 }
		 }

/*	public static void main(String[] args) {
		Odd_First_Even_Next o = new Odd_First_Even_Next();
		int[] arr = {12, 34, 45, 9, 8, 90, 3};
		o.segregateOddEven(arr);

	}
*/
}
