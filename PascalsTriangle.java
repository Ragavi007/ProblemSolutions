package problem_solving;

public class PascalsTriangle {
    public int factorial(int n) {
    	if(n == 0 || n == 1 )
    		return 1;
    	
    	return n*factorial(n-1);
    }
	public static void main(String[] args) {
		int k = 4;
		int n,r;
		PascalsTriangle o = new PascalsTriangle();
		for(n = 0;n<=k;n++) {
			for(r = 0; r<=k-n;r++) {
				System.out.print(" ");
			}
			for(r = 0; r<=n;r++) {
				System.out.print(" " +o.factorial(n)/(o.factorial(r)*o.factorial(n-r)));
			
			}
			System.out.println();
		}

	}

}
