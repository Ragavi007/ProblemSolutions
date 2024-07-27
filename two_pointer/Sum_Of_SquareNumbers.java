package two_pointers;
/*  633.Sum Of Square Numbers
    Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.
*/
public class Sum_Of_SquareNumbers {
	public boolean judgeSquareSum(int c) {
		long a = 0;
		long b = (int)Math.sqrt(c);
		while(a<b) {
			long sum = (a*a)+(b*b);
			if(sum == c) {
				return true;
			}else if(sum < c) {
				a++;
			}else {
				b--;
			}
		}
		return false;
	}

/*	public static void main(String[] args) {
		Sum_Of_SquareNumbers o = new Sum_Of_SquareNumbers();
		int c =5;
		System.out.println(o.judgeSquareSum(c));

	}
*/
}
