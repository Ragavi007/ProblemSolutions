package gfg_Solutions;
//Given a non null integer matrix Grid of dimensions NxM.Calculate the sum of its elements.
public class Sum_Of_Elements_Matrix {
	 int sumOfMatrix(int N, int M, int[][] Grid) {
		int sum = 0;
		for(int i=0;i<N;i++) {
			for(int j = 0;j<M;j++) {
				sum += Grid[i][j];
			}
		}
		return sum;
	 }

/*	public static void main(String[] args) {
		Sum_Of_Elements_Matrix o = new Sum_Of_Elements_Matrix();
		int N=2,M=3;
		int[][] Grid= {{1,0,1},{-8,9,-2}};
		
		System.out.println(o.sumOfMatrix(N,M,Grid));

	}
*/
}
