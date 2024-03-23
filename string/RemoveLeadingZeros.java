package string;
//Remove the leading Zeros in a String
//Timecomplexity = O(n)

public class RemoveLeadingZeros {
	public static void removeleadzero(String s) {
		int i = 0;
		while(s.charAt(i)== '0') {
			i++;
		}
		System.out.println(s);
		System.out.println(s.substring(i));
	}

	public static void main(String[] args) {
		String s = "00000123065";
		removeleadzero(s);

	}

}
//while (i < str.length() && str.charAt(i) == '0') 
//return (i == str.length()) ? "0" : str.substring(i);