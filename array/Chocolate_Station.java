package array;
/*
 An array arr, where arr[i] denotes the number of chocolates corresponding to each station. From station i to station i+1 a Person 
 gets arr[i] + arr[i+1] chocolates for free, if this number is negative, he/she looses that many chocolates also.
He/She can only move from station i to station i+1, if he/she has non-negative number of chocolates with him/her

   Find the minimum Number of Chocolates needed to Buy for reaching the last station from the first station .
   //Cost */
  
//Time Complexity = O(n) n = size of the array
//Space Complexity = O(1)

public class Chocolate_Station {

	public static void main(String[] args) {
	   int arr[] = {2,3,-5,7,8};
	   int chocoBuy = arr[0];
	   int chocoBalance = 0;
	      for(int i =0;i<arr.length-1;i++) {
	    	  chocoBalance += (arr[i]-arr[i+1]); 
	    	  if(chocoBalance <0) {
	    		  chocoBuy += Math.abs(chocoBalance) ;
	    		  chocoBalance =0;
	    	  }
	      }
	   System.out.println("The Amount for buying chocolates to reach the last Station is : " +chocoBuy);

	}

}
