package patternPrinting;

public class StarPattern00 {
/*	    *
	   * *
	  * * *
	 * * * *
*/
	private static void printa(int n) {
		  for(int i =1;i<=n;i++) {
			  for(int j = n-i;j>0;j--) {
				  System.out.print(" ");
			  }
			  for(int j = 1;j<=i;j++) {
				  System.out.print(" *");
			  }
			  System.out.println();
			  
		  }
		  System.out.println();
	}
	
/*  * * * *
     * * *
      * *
       *
*/
   private static void printb(int n) {
         for(int i =1;i<=n;i++) {
	         for(int j = 1;j<=i-1;j++) {
		         System.out.print(" ");
	     }
	     for(int j = n;j>=i;j--) {
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
