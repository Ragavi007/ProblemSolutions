package patternPrinting;

public class NumericalPattern {
/*	1 
	2 2 
	3 3 3 
	4 4 4 4 
*/
	private static void printa(int n) {
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(i+ " ");
			}
			System.out.println();
		}
		System.out.println();
		}
/*	1
	1 2
	1 2 3
	1 2 3 4
*/
	private static void printb(int n) {
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		
		System.out.println();
	}
/*	1             1
	1 2         2 1
	1 2 3     3 2 1
	1 2 3 4 4 3 2 1
	
	*/
	private static void printc(int n) {
		  for(int i =1;i<=n;i++) {
			  for(int j = 1;j<=i;j++) {
					  System.out.print(j+" ");
			  }
			  for(int s = 1;s<=2*(n-i);s++) {
				  System.out.print("  ");
		  }
			  for(int j = i;j>0;j--) {
				  System.out.print(j+" ");
		  }
			  
			  System.out.println();
		  }
	}		
	  public static void main(String[] args) {
	      	int n = 4;
	        printa(4);
	        printb(4);
	        printc(4);
	}	

}
