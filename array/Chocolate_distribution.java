package array;
/*
    Given an array A[ ] of positive integers of size N, 
   where each value represents the number of chocolates in a packet. 
   Each packet can have a variable number of chocolates.
    There are M students, the task is to distribute chocolate packets among M students such that :
              1. Each student gets exactly one packet.
              2. The difference between maximum number of chocolates given to a student and
               minimum number of chocolates given to a student is minimum.

 */
//Time Complexity = O(n log n) n = size of the array
//Space Complexity = O(1)

import java.util.Arrays;

public class Chocolate_distribution {
	public static int minDiff (int[]arr,int m,int n) {
		Arrays.sort(arr);
		int min = Integer.MAX_VALUE;
		if(m>n) {
			return -1;
		}else if(m==0||n==0) {
			return 0;
		}else {
			
			for(int i=0;i+m-1<n;i++) {
				int diff = arr[i+m-1]-arr[i];
				if(diff<min)
					min=diff;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		int arr[] = {7,8,5,4,67,89,34,100};
		int m = 5;
		int n = arr.length-1;
		
		System.out.println("The Chocolate Distribution that has minimum difference :"+minDiff(arr,5,arr.length-1));
		

	}

}
