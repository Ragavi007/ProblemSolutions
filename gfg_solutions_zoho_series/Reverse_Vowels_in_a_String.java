package gfg_Solutions;
/*
  Given a string s, reverse only all the vowels in the string and return it.
  The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
*/
public class Reverse_Vowels_in_a_String {
	public String reverseVowels(String s) {
		char[] word = s.toCharArray();
		int i = 0,j=word.length-1;
		String vowel ="aeiouAEIOU";
		while(i<j) {
			while(i<j && vowel.indexOf(word[i]) == -1) {
				i++;
			}
			while(i<j && vowel.indexOf(word[j]) == -1) {
				j--;
			}
			char temp = word[i];;
			word[i] = word[j];
			word[j] = temp; 
			i++;
			j--;
		}
		String answer = new String(word);
		return answer;
	}

	public static void main(String[] args) {
		Reverse_Vowels_in_a_String o = new Reverse_Vowels_in_a_String();
		String s = "string a word";
		System.out.println(o.reverseVowels(s));

	}

}
