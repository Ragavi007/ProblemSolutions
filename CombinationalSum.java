package Difficulty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;

public class CombinationalSum {

	static void printComb(List<Integer> original,Vector<Integer> resultSubList,int index,int sum)
	{
		if(sum<0)
			return;
		
		if(sum==0)
		{ 
			for(int i=0;i<resultSubList.size();i++)
			{
				System.out.print(resultSubList.get( i));
			}
			System.out.println();
			return;
		}
		
		while(index<original.size() && sum-original.get( index)>=0)
		{
			
			resultSubList.add( original.get( index));
			
			printComb(original,resultSubList,index,sum-original.get( index));
			 
			resultSubList.remove( resultSubList.size()-1); 
			  
			index++;
			
		}
		
	}
	
	public static void main(String[] args) { 
		 
		int arr[]= {6, 5 ,7 ,1 ,8 ,2 ,9 ,9 ,7 ,7 ,9};
		 
		TreeSet<Integer> hs=new TreeSet<>();
		 
		for(int i=0;i<arr.length;i++)
			hs.add( arr[i]);
		
		int sum=6;
		
		printComb(new ArrayList<>(hs),new Vector<>(),0,sum);
		
		
		 
	}

}
