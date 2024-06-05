package patternPrinting;

public class NumericalPattern02 {
/*	
	4 4 4 4 
	3 3 3 
	2 2 
	1 
*/	public static void printa(int n) {
		for(int i = n;i>=1;i--) {
			for(int j = 1;j<=i;j++) {
				System.out.print(i+ " ");
			}
			System.out.println();
		}
		System.out.println();
		}
/* 
    1 2 3 4 
    1 2 3 
    1 2 
    1 
*/
	public static void printb(int n) {
		for(int i = n;i>=1;i--) {
			for(int j = 1;j<=i;j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		
		System.out.println();
	}
	  public static void main(String[] args) {
	      	int n = 4;
	        printa(4);
	        printb(4);
	        
	}
}
