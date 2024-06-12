package Dynamic;

import java.util.Arrays;
import java.util.Comparator;

class Box
{
	int height,width,depth,basearea;

	public Box(int height, int width, int depth) {
		super();
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	
}

public class BoxStacking {

	public static void main(String[] args) {
		 
		Box[] arr= {new Box(4,6,7),new Box(1,2,3),new Box(4,5,6),new Box(10,12,32)};
		 
		Box[] rot=new Box[arr.length*3];
		
		int cnt=arr.length*3;
		
		for(int i=0;i<arr.length;i++)
		{
			rot[3*i+0]=new Box(arr[i].height,Math.max( arr[i].width, arr[i].depth),Math.min( arr[i].width, arr[i].depth));
			
			rot[3*i+1]=new Box(arr[i].width,Math.max( arr[i].height, arr[i].depth),Math.min( arr[i].height, arr[i].depth));
			
			rot[3*i+2]=new Box(arr[i].depth,Math.max( arr[i].width, arr[i].height),Math.min( arr[i].width, arr[i].height));
			
		}
		 
		for(int i=0;i<cnt;i++)
		{
			rot[i].basearea=rot[i].depth*rot[i].width;
		}
		
		Arrays.sort(rot,new Comparator<Box>() {

			@Override
			public int compare(Box o1, Box o2) { 
				
				if(o1.basearea>o2.basearea)
					return -1;
				else if(o1.basearea<o2.basearea)
					return 1;
				
				return 0;
			}
			
		});
		
		
		int[] msh=new int[cnt];
		for(int i=0;i<cnt;i++)
		{
			msh[i]=rot[i].height; 
			System.out.print( msh[i]+"\t");
		}
		
		System.out.println();
		for(int i=0;i<cnt;i++)
		{
			Box currentBox=rot[i];
			int value=0; 
			for(int j=0;j<i;j++)
			{
				Box prevBox=rot[j];
				
				if(currentBox.width<prevBox.width && currentBox.depth<prevBox.depth)
				{
					value=Math.max( value, msh[j]);
				}
				
			}
			msh[i]=value+rot[i].height;
		}
		
		int maxHeight=0;
		for(int i=0;i<cnt;i++)
			maxHeight=Math.max(maxHeight, msh[i]);
		
		System.out.println(maxHeight);
	}

}
