package array;

public class AddTwoDArray {
	public static void printMatrix(int[][] M,int rsize,int csize) {
		for(int i = 0;i<rsize;i++) {
			for(int j = 0;j<csize;j++) {
				System.out.print(M[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
    public static int[][] addMatrices(int[][] A,int[][] B,int size){
    	int[][] C = new int[size][size];
    	for(int i = 0;i<size;i++) {
    		for(int j = 0;j<size;j++) {
    			C[i][j] = A[i][j]+B[i][j];
    		}

    	}
    	return C;
    }
    
	public static void main(String[] args) {
		int size = 5;
		int[][] A = {{1,2,3,4,5},{2,3,4,5,6},{3,4,5,6,7},{4,5,6,7,8},{5,6,7,8,9}};
		System.out.println("\nMatrix A :");
		printMatrix(A,size,size);
		
		int[][] B = {{1,2,3,4,5},{2,3,4,5,6},{3,4,5,6,7},{4,5,6,7,8},{5,6,7,8,9}};
		System.out.println("\nMatrix B :");
		printMatrix(B,size,size);
		
		
		int[][] C = addMatrices(A,B,size);
		System.out.println("\nMatrix C :");
		printMatrix(C,size,size);
	}

}
