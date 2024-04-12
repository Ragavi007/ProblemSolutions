package string;
//Given a String , Remove the elements of the Odd Indexed
//Time Complexity = O(n)

public class RemoveOddIndexed {
	public static String removeOddIndexed(String s) {
		String new_String = "";
		for(int i = 0;i<s.length();i++) {
			if(i%2 == 1)
				continue;
		
			new_String	+= s.charAt(i);
		}
		return 	new_String;	
	}

	public static void main(String[] args) {
		String s = "Ragavi";
		s = removeOddIndexed(s);
		System.out.print(s);

	}

}
