package graph;

//	Find length of the largest region in Boolean Matrix

public class Unit_area_of_largest_1s {

	static int cnt=0;

	static  boolean isSafe(int[][] mat,boolean[][] visited,int m,int n,int i,int j)
	{
		return i>=0 && i<m && j>=0 && j<n && !visited[i][j] && mat[i][j]==1;
	}
	
	static void dfs(int[][] mat,boolean[][] visited,int m,int n,int i,int j)
	{
		int[] x= {1,0,-1,0,1,-1,-1,1};
		int[] y= {0,1,0,-1,1,1,-1,-1};
		 
		visited[i][j]=true;
		
		for(int k=0;k<8;k++)
			if(isSafe(mat,visited,m,n,i+x[k],j+y[k])) {
				cnt++;
				dfs(mat,visited,m,n,i+x[k],j+y[k]);
			}
		
	}
	
	static int  countLargestIslands(int[][] mat,int m,int n)
	{
		int res=0;
 		boolean[][] visited=new boolean[m][n];
		
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				if(mat[i][j]==1 && visited[i][j]==false)
				{
					cnt=1;
					dfs(mat,visited,m,n,i,j);
					res=Math.max(res,cnt);
				}
					
		return res;
	}
	
	public static void main(String[] args) {
		 
		 
		int[][] mat=   {
				{0, 0, 1, 1, 0},  
                {1, 0, 1, 1, 0},  
                {0, 1, 0, 0, 0},  
                {0, 0, 0, 0, 1}};  
         
		System.out.println(countLargestIslands(mat,4,4));
		
	}

}
