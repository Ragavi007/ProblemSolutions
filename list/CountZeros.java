package array;

public class CountZeros {

	public static int binary(int[] arr,int l,int r)
	{ 
		while(l<=r)
		{
			int mid=(l+r)/2;
			
			if(arr[mid]==0 && arr[mid-1]==1)
				return mid;
			
			if(arr[mid]==0)
				r=mid-1;
			
			if(arr[mid]==1)
				l=mid+1;
			
		}
		 
		return -1;
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1 ,1 ,1, 1, 1, 1, 1, 1, 1, 0, 0, 0 };
		System.out.println(arr.length-binary(arr,0,arr.length-1)); 
		
	}

}
