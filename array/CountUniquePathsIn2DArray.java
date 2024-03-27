package array;
//Find all unique possible paths from the top left to the bottom right of a M X N matrix
//Time Complexity = O(2N)

public class CountUniquePathsIn2DArray {
    public static int numberOfPaths(int m,int n) {
    	if(m == 1 || n == 1)
    		return 1;
    	
     return numberOfPaths(m-1,n)+numberOfPaths(n-1,m);
    }
	public static void main(String[] args) {
	
		System.out.println(numberOfPaths(3,8));

	}

}
