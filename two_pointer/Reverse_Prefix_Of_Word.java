package two_pointers;

public class Reverse_Prefix_Of_Word {
	public String reversePrefix(String word, char ch) {
		StringBuilder sb = new StringBuilder();
		int i ;
		for(i=0;i<word.length();i++) {
			sb.append(word.charAt(i));
		if(word.charAt(i) == ch) {
			sb.reverse();
			break;
		}
		}
		
		if(i == word.length()) {
			return word;
		}
		
		return sb.toString() + word.substring(i+1);
		
	}

/*	public static void main(String[] args) {
		Reverse_Prefix_Of_Word o = new Reverse_Prefix_Of_Word();
		System.out.println(o.reversePrefix("abcdefg", 'd'));

	}
*/
}
