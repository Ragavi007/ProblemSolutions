package patternPrinting;
// Print the Square Hollow Pattern
//Timecomplexity = O(n^2)
public class SquareHollow {
	public static void square(int n) {
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				if(i == 0||j==0||i==n-1||j==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n = 6;
		square(n);

	}

}
