package string;
//Reverse the given String 
//Time Complexity =  O(n)
public class ReverseS {

	public static void main(String[] args) {
		String s = "Ragz";
        char[] c = s.toCharArray();
        for(int i = c.length-1;i>=0;i--)
         System.out.print(c[i]);
	}

}
