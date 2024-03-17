package problem_solving;

public class ChessBoardPrint {

	public static void main(String[] args) {
		int n = 8;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i+j)%2 == 0)
					System.out.print("1\t");
				else
					System.out.print("0\t");
			}
			System.out.println();
		}

	}

}
