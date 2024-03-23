package problem_solving;
//Find the color of the Chessboard Square picked
//Time Complexity = O(1)

public class ChessBoardPick {

	public static void main(String[] args) {
		String s = "b2";
		
		int num1 = (int)s.charAt(0)-'a'+1;
		int num2 = (int)s.charAt(1)-'1';
		
		if((num1+num2)%2 == 0) {
			System.out.println("Black");
		}
		else {
			System.out.println("White");
		}

	}

}
