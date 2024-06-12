package Dynamic;

import java.util.*;

public class CoinChange {
	 
	static int totalNoOfWays(int total,int[] coins)
	{ 
		Arrays.sort(coins);
		int[] dp=new int[total+1];
		
		dp[0]=1;
		
		for(int i=0;i<coins.length;i++)
		{
			for(int j=coins[i];j<=total;j++)
			{
				dp[j]+=dp[j-coins[i]];
			}
		}
		
		System.out.println(dp[total]);
		return dp[total];
	}
	
	static int minimumNoOfWays(int total,int[] coins)
	{
		if(total==0)
			return 0;
		
		int res=Integer.MAX_VALUE;
		
		for(int i=0;i<coins.length;i++)
		{
			if(coins[i]<=total)
			{
				int subResult=minimumNoOfWays(total-coins[i],coins);
				
				if(subResult!=Integer.MAX_VALUE && subResult+1<res)
				{
					res=subResult+1;
				}
				
			}
		}
		 
		return res;
	}
	
	public static void main(String[] args) {
 
		int total=11;int[] coins= {9, 6, 5, 1}; ;
		
		System.out.println(minimumNoOfWays(total,coins));
		System.out.println(totalNoOfWays(total,coins));
	}

}
