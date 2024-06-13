package array;

import java.util.HashMap;

class Point
{
	int i,j;
	public Point(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}
}

public class FourElementsSum {

	public static void main(String[] args) {
	 
		int arr[]=  {10, 20, 30, 40, 1, 2};int k=91;
		
		HashMap<Integer,Point> hs=new HashMap<>();
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				hs.put(arr[i]+arr[j],new Point(i,j));
			}
		}
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(hs.containsKey(k-(arr[i]+arr[j]))) {
					
					Point temp=hs.get(k-(arr[i]+arr[j]));
					
					if(temp.i!=i && temp.j!=i && temp.i!=j && temp.j!=j) {
						
						System.out.println(arr[temp.i]+"--"+arr[temp.j]+"--"+arr[i]+"--"+arr[j]);
						return;
					}
					
				}
			}
		}

	}

}
