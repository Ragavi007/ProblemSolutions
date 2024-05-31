package patternPrinting;

public class TriPattern2 {
	public static void print04(int n) {
		for(int i =1;i<2*n;i++) {
			int col = i>n ? 2 * n -i:i;
			for(int j = 0;j<col;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		int n = 4;
		print04(4);
		

}
}