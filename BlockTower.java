package zq;

import java.util.Arrays;

public class BlockTower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int ele[]={1,2,5,4,3,6};int h1=6,h2=15;
		int n=ele.length;
		
		check(ele,h1,n);
		check(ele,h2,n);

	}

	public static void check(int[] arr,int h,int n)
	{
		Arrays.sort(arr);
		for(int i=n-1;i>=2;i--)
		{
			int l=0,r=i-1;
			while(l<r)
			{
				if(arr[l]+arr[r]+arr[i]==h)
				{
					System.out.println(arr[l]+"--"+arr[r]+"--"+arr[i]);
					return;
				}
				else if(arr[l]+arr[r]+arr[i]<h)
				{
					l++;
				}
				else
				{
					r--;
				}
			}
		}
	}
	
/*	
    public static void check(int ele[],int h,int n){
        
		for(int i=0;i<n-1;i++){
		    
		    for(int j=i+1;j<n;j++){
		        
		        for(int k=0;k<n;k++){
		            
		            if(k!=i&&k!=j){
		                
		                int temp=ele[i]+ele[j]+ele[k];
		                if(temp==h){
		                    System.out.println(ele[i]+" "+ele[j]+" "+ele[k]);
		                    return;
		                }
		            }
		            
		        }
		    }
		}
    }
    
 */   
}
