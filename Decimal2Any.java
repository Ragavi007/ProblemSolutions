package NumberSystem;

public class Decimal2Any {

	public static void toBinary(int n) {
		
		char  binary[]=new char[100];	
		int i=0;
		
		while(n>0) {
			
			int rem=n%2;
			binary[i]=(char) (rem+'0');
			n=n/2;
			i++;
		}
		
		for(int j=i-1;j>=0;j--) {
			System.out.print(binary[j]);
		}
		
	}
	
	public static void toHexaDecimal(int n) {
		
		char hexadecimal[]=new char[100];
		int i=0;
		
		while(n>0) {
			
			int rem=n%16;
			
			if(rem>=0&&rem<=9) {
				hexadecimal[i]=(char)(rem+'0');
			}
			else if(rem>=10&&rem<=15) {
				hexadecimal[i]=(char)(rem+55);
			}
			i++;
			n=n/16;
		}
		
		for(int j=i-1;j>=0;j--) {
			System.out.print( hexadecimal[j]);
		}
	}
	
	public static void main(String[] args) { 
		
		toBinary(2545);
		System.out.println();
		toHexaDecimal(2545);
		
	}

}
