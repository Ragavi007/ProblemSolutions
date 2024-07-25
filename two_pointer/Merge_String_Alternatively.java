package two_pointers;

public class Merge_String_Alternatively {
	
	public String mergeAlternately(String word1, String word2) {
		StringBuilder sb =  new StringBuilder();
		int  min = Math.min(word1.length(), word2.length());
		for(int i = 0;i<min;i++) {
			sb.append(word1.charAt(i)).append(word2.charAt(i));
		}
		
		if(word1.length()>min) {
			sb.append(word1.substring(min));
		}
		if(word2.length()>min) {
			sb.append(word2.substring(min));
		}
		
		return sb.toString();
	}

/*	public static void main(String[] args) {
		Merge_String_Alternatively o = new Merge_String_Alternatively();
		System.out.println(o.mergeAlternately("ragavi","nivedhitha"));

	}
*/
}
