package patternPrinting;
//Print the Fading hello world pattern
///Time Complexity = O(n^2),n-length of string 

public class HelloWorldPattern {

	public static void main(String[] args) {
		String s = "Helo World Ragz";
		for(int i = s.length();i>0;i--) {
			System.out.println(s.substring(0,i));
		}

	}

}
