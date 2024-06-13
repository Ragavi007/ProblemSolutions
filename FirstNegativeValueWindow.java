package array;

import java.util.LinkedList;

public class FirstNegativeValueWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {12, -1, -7, 8, -15, 30, 16, 28}; 
	    int n = arr.length; 
	    int k = 3; 

	    LinkedList<Integer> dq=new LinkedList<>(); 
	    
	    int i;
	    for(i=0;i<k;i++)
	    { 
	    	if(arr[i]<0)
	    		dq.addLast( i);
	    }
	    
	    for(;i<arr.length;i++)
	    {
	    	if(!dq.isEmpty())
	    		System.out.print(arr[dq.peek()]+" ");
	    	else
	    		System.out.print("0");
	    	
	    	while(!dq.isEmpty() && dq.peekFirst()<=i-k)
	    		dq.removeFirst();
	    	
	    	if(arr[i]<0)
	    		dq.addLast( i);
	    }
	     
	    if(!dq.isEmpty())
    		System.out.print(arr[dq.peek()]+" ");
    	else
    		System.out.print("0");
	    
	}

}
