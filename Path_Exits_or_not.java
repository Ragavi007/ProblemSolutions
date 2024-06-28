package graph;

public class Path_Exits_or_not {

	static int n=3,m=3;
	
	static boolean isSafe(int i,int j)
	{
		if(i>=0 && i<n && j>=0 && j<m)
			return true;
		return false;
	}
	
	static boolean isPath(int[][] matrix,int i,int j,boolean[][] visited)
	{
		if(isSafe(i,j) && matrix[i][j]!=0 && !visited[i][j])
		{
			visited[i][j]=true;
			
			if(matrix[i][j]==3)
				return true;
			
			boolean up=isPath(matrix,i-1,j,visited);
			
			if(up==true)
				return true;
			
			boolean down=isPath(matrix,i+1,j,visited);
			
			if(down==true)
				return true;
			
			boolean left=isPath(matrix,i,j-1,visited);
			
			if(left==true)
				return true;
			
			boolean right=isPath(matrix,i,j+1,visited);
			
			if(right==true)
				return true;
			 
		}
		return false;
	}
	
	public static void main(String[] args) {
		 
		int matrix[][] =  {{ 0 , 3 , 2 },
                { 3 , 3 , 0 },
                { 1 , 3 , 0 }};; 
		
		
		boolean[][] visited=new boolean[n][m];
		
		boolean flag=false;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(matrix[i][j]!=1 && !visited[i][j])
				{
					if(isPath(matrix,i,j,visited))
					{
						flag=true;break;
					}
				}
			}
		}
		
		if(flag==true)
			System.out.println("Yes..");
		
	}

}
