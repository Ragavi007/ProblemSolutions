package patternPrinting;

public class TriPattern3 {
/*	    *
	   ***
	  *****
	 *******
*/
	public static void print05(int n) {
		for(int i = 1;i<=n;i++) {
			for(int s = n-i;s>0;s--) {
				System.out.print(" ");
			}
			for(int j = 0;j<2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
/* Diamond pattern	
 	    * 
	   * * 
	  * * * 
	 * * * * 
	  * * * 
	   * * 
	    * 
*/
	public static void print06(int n) {
		for(int i =1;i<2*n;i++) {
			int col = i>n ? 2 * n -i:i;
			int space = n- col;
			for(int j = 0;j<space;j++) {
				System.out.print(" ");
			}
			for(int j = 0;j<col;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
	
	public static void main(String[] args) {
		int n = 4;
		print05(4);
		System.out.println();
		print06(4);
		

}

}
