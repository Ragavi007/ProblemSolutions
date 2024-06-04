package patternPrinting;

/* 
     * 
    * * 
   * * * 
  * * * * 
   * * * 
    * * 
     * 

*/


public class StarPattern03 {
    public static void print(int n) {
	  for(int i =1;i<=(2*n-1);i++) {
		  int sp = i >n ? i-n: n-i;
		  int col = i>n ? 2*n-i:i;
		for(int j = 1;j<=sp;j++) {
			System.out.print(" ");
		}
		for(int j = 1;j<=col;j++) {
			System.out.print("* ");
		}
		
		System.out.println();
	}
	}
    public static void main(String[] args) {
     	int n = 4;
	        print(4);
}
}
