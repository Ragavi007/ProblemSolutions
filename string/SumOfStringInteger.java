package string;

import java.math.BigInteger;

//Given two numbers as strings, find sum of these two numbers
//Time Complexity = O(1)

public class SumOfStringInteger {

	public static void main(String[] args) {
		String s = "3333311111111111";
		String s1 = "7777555511111111";
		
		BigInteger a = new BigInteger(s);
		BigInteger b = new BigInteger(s1);
        
		System.out.println(a.add(b));
	}

}
