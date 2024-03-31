package problem_solving;
//Convert the given Decimal number into Octal number
//Time Complexity = O(log N)

public class DecimalToOctal {
	public static void decToOct(int n)
	{
		int[] octNum = new int[100];
		int i =0;
		while(n>0) {
			octNum[i] = n%8;
			n = n/8;
			i++;
		}
		for(int j = i-1;j>=0;j--) {
			System.out.print(octNum[j]);		}
	}
	public static void main(String[] args) {
		int n = 65;
		decToOct(n);

	}

}

//Integer.toOctalString(n)
//Time Complexity = O(1)
