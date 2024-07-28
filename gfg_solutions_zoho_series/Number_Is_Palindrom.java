package gfg_Solutions;
// Given an integer, check whether it is a palindrome or not.

public class Number_Is_Palindrom {
	public String is_palindrome(int n)
    {
		int reverse = 0,temp = n;
		while(temp > 0) {
			reverse = (reverse*10) + (temp%10);
			temp = temp/10;
		}
		return (reverse == n ? "Yes" : "No");
		
    }

/*	public static void main(String[] args) {
		Number_Is_Palindrom o = new Number_Is_Palindrom();
		int n = 555;
		System.out.println(o.is_palindrome(n));

	}
*/
}
