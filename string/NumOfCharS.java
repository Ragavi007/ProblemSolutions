package string;
//Count the number of Characters in a string
//Time Complexity = O(n) 
public class NumOfCharS {

	public static void main(String[] args) {
		String s = "Ragz";
        int count = 0;
        char[] c = s.toCharArray();
        for(int i = 0;i<c.length;i++)
        count++;
        System.out.println(count);

	}

}


