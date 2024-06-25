package zq;

public class AlphabetFromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		print("1233","");
		System.out.println(countDecoding("1233".toCharArray(),4));

	}
	
	public static int countDecoding(char[] digits,int n) {
		
		if(n==0||n==1)
			return 1;
		
		if(digits[0]=='0')
			return 0;
		
		int cnt=0;
		
		if(digits[n-1]>'0')
			cnt+=countDecoding(digits,n-1);
		
		if(digits[n-2]=='1'||digits[n-2]=='2'&&digits[n-1]<'7')
			cnt+=countDecoding(digits,n-2);
		return cnt;
	}
	
	
	public static void print(String digits,String words) {
		
		if(digits.isEmpty()) {
			System.out.println(words);
		}
		else {
			
			int num=Integer.parseInt( digits.substring( 0,1));
			print(digits.substring( 1),words+(char)('A'+num-1));
			
			if((digits.length())>=2&&(num=Integer.parseInt( digits.substring( 0,2)))<=26) {
				
				print(digits.substring( 2),words+(char)('A'+num-1));
				
			}
			
		}
	}

}
