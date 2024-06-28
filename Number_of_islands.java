package graph;

public class Number_of_islands {

	static  boolean isSafe(int[][] mat,boolean[][] visited,int m,int n,int i,int j)
	{
		return i>=0 && i<m && j>=0 && j<n && !visited[i][j] && mat[i][j]==1;
	}
	
	static void dfs(int[][] mat,boolean[][] visited,int m,int n,int i,int j)
	{ 
		
		int[] x= {1,0,0,-1};
		int[] y= {0,1,-1,0};
		
		visited[i][j]=true;
		
		for(int k=0;k<4;k++)
			if(isSafe(mat,visited,m,n,i+x[k],j+y[k]))
				dfs(mat,visited,m,n,i+x[k],j+y[k]);
		
	}
	
	static int  countIslands(int[][] mat,int m,int n)
	{
		int cnt=0;
		boolean[][] visited=new boolean[m][n];
		
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				if(mat[i][j]==1 && visited[i][j]==false)
				{
					cnt++;
					dfs(mat,visited,m,n,i,j);
				}
					
		return cnt;
	}
	
	public static void main(String[] args) {
		 
		int[][] mat={ { 1, 1, 0, 0, 0 }, 
                	  { 0, 1, 0, 0, 1 }, 
                	  { 1, 0, 0, 1, 1 }, 
                	  { 0, 0, 0, 0, 0 }, 
                	  { 1, 0, 1, 0, 1 } };
		
		int[][] mat1= {
				{1,1,1,1},
				{0,0,1,1},
				{1,0,1,1},
				{1,1,0,1}
					};
		
		System.out.println(countIslands(mat1,4,4));
	}

}
