package NumberSystem;

public class AddHexaDecimalStrings {

	public static int convert(char c) {
		
		int n1=0;
	    if(c>='0'&&c<='9') {
	    	n1=c-'0';
	    }
	    else {
	    	n1=c-55;
	    }
		return n1;
	}
	
	public static char convert(int c) {
		
		char n1;
	    if(c>=0&&c<=9) {
	    	n1=(char) (c+'0');
	    }
	    else {
	    	n1=(char)(c+55);
	    }
		return n1;
	}

	public static void main(String[] args) { 
		
		char[] str1="12A".toCharArray(),str2="CD3".toCharArray();

		String result="";int carry=0;
		for(int i=str1.length-1;i>=0;i--) {
			
		int n1=convert(str1[i]);	
	    int n2=convert(str2[i]);
	    
	    int sum=n1+n2+carry;
	    
	    if(sum>=14) {
	    	sum-=14;
	    	carry=1;
	    }
	    else 
	    {
	    	carry=0;
	    }
	    
	     result=convert(sum)+result;
		}
		
		if(carry==1) 
			result="1"+result;
		
		System.out.println(result);
	}

}
