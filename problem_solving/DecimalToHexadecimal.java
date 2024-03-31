package problem_solving;
//Convert the given Decimal number into HexaDecimal number
//Time Complexity = O(log16n)

public class DecimalToHexadecimal {
	
	public static void decToHex(int n) {
	    	char[] hexaDecNum = new char[100];
	    	int i =0;
	    	while(n>0) {
	    		int temp = n%16;
	    		if(temp<10) {
	    			hexaDecNum[i] = (char)(temp + 48); 
	    			i++;
	    		}else {
	    			hexaDecNum[i] = (char)(temp + 55);
	    			i++;
	    		}
	    		n = n/16;
	    	}
	    	for(int j=i-1;j>=0;j--) {
	    		System.out.print(hexaDecNum[j]);
	    	}
	}
	public static void main(String[] args) {
		int n = 34;
		decToHex(n);

	}

}
//Integer.toHexString(n)
//Time Complexity: O(log16(n))