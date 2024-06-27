package NumberSystem;

public class Binary2Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char[] num="10001".toCharArray();
		
		int base=1,decimal=0;
		
		for(int i=num.length-1;i>=0;i--) {
			
			decimal+=(num[i]-'0')*base;
			base=base*2;
			
		}
		
		System.out.println(decimal);
		
	}

}
