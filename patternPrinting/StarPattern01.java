package patternPrinting;

public class StarPattern01 {
/*	      *
	    * * * 
	  * * * * * 
	* * * * * * * 
*/
	private static void printa(int n) {
		int i,j;
		  for(i =1;i<=n;i++) {
			  for(j = n-i;j>0;j--) {
				  System.out.print("  ");
			  }
			  for(j = 1;j<=(2*i-1);j++) {
				  System.out.print("* ");
			  }
			  System.out.println();
		  }
		  System.out.println();
	}
	
	
/*	* * * * * * *
	 * * * * *
	   * * *
	     *
*/	private static void printb(int n) {
		  for(int i =n;i>=1;i--) {
			  for(int j = 1;j<=n-i;j++) {
				  System.out.print("  ");
			  }
			  for(int j = 2*i-1;j>=1;j--) {
				  System.out.print(" *");
			  }
			  System.out.println();
		  }
	}
    public static void main(String[] args) {
         	int n = 4;
	        printa(4);
	        printb(4);
}
}
