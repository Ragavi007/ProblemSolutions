package array;
//Print a Matrices of the 2D Array
//Time Complexity = O(size^2)
class TwoDArrayPrint{
    public static void printMatrix(int M[][],int rsize,int csize){
        for(int i = 0;i<rsize;i++){
            for(int j = 0;j<csize;j++){
                System.out.print(M[i][j]);
            }
             System.out.println();
        }
    }
    

    
    public static void main(String[] args){
        int size = 4;
           int A[][] = { { 1, 1, 1, 1 },
                      { 2, 2, 2, 2 },
                      { 3, 3, 3, 3 },
                      { 4, 4, 4, 4 } };
        System.out.println("\nMatrix A:");
        printMatrix(A, size, size);
        int B[][] = { { 5, 5, 5, 5 },
                      { 6, 6, 6, 6 },
                      { 7, 7, 7, 7 },
                      { 8, 8, 8, 8 } };
        System.out.println("\nMatrix B:");
        printMatrix(B,size,size);
        
        
        
    }
}