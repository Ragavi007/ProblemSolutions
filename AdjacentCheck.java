package zq;

public class AdjacentCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] mat= {
				{1,2,3},
				{4,2,5},
				{4,6,9}
		};
		
		int[] x= {-1,1,0,0,-1,1,-1,1};
		int[] y= {0,0,-1,1,-1,1,1,-1};
		
		 
		
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<3;j++) {
				 
				
				for(int k=0;k<8;k++) {
					
					int p=x[k]+i;
					int q=y[k]+j;
					
					if(p>=0&&q>=0&&p<3&&q<3&&mat[i][j]+mat[p][q]==8)
						System.out.println(mat[i][j]+"---"+mat[p][q]);
					
				}
				
				
			}
			
		}
		
	}

}
