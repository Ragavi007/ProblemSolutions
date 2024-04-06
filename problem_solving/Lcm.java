package problem_solving;
//Find the LCM of the given two numbers
////Time Complexity = O(a*b) a,b given two numbers 

public class Lcm {

	public static void main(String[] args) {
		int a = 35,b=32;
		int ans = a > b ? a: b;
		while(true) {
			if(ans % a == 0 && ans % b == 0) 
				break;
				
			ans++;	
			
		}
		
		System.out.println("LCM of the given two numbers is "+ans);

	}

}
