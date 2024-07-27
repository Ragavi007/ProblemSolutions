package two_pointers;
/* 125.Valid Palindrome
     A phrase is a palindrome if, after converting all uppercase letters into lowercase letters 
    and removing all non-alphanumeric characters, 
      it reads the same forward and backward. Alphanumeric characters include letters and numbers.

    Given a string s, return true if it is a palindrome, or false otherwise.*/

public class Is_Valid_Palindrome {
	public boolean isPalindrome(String s) {
		 
		s = s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
		int i = 0,j = s.length()-1;
		while(i<j) {
			if(s.charAt(i) != s.charAt(j) ) {
				return false;
			}
			i++;
			j--;
		}
		return true;
		
	}

/*	public static void main(String[] args) {
		Is_Valid_Palindrome o = new Is_Valid_Palindrome();
		String s = "A man, a plan, a canal: Panama";
		System.out.println(o.isPalindrome(s));

	}
*/
}
