package patternPrinting;

public class TriPattern {
	
/*  print00
  	****
	****
	****
	****
	*/
	
  	public static void print00(int n) {
		for(int i =0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
 /*  print01
  	*
	**
	***
	****
	
	*/
	public static void print01(int n) {
		for(int i =0;i<=n;i++) {
			for(int j = 0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
/*  print02
 
  	****
	***
	**
	*
	
	*/
	public static void print02(int n) {
		for(int i =0;i<=n;i++) {
			for(int j =0;j<(n-i);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
/*  print03
  	1
	12
	123
	1234*/
	public static void print03(int n) {
		for(int i =1;i<=n;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	} 
	
	public static void main(String[] args) {
		int n = 4;
		print00(4);
		print01(4);
		print02(4);
		print03(4);

	}

}
              