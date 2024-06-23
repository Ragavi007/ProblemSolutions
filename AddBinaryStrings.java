package NumberSystem;

public class AddBinaryStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] str1="01010".toCharArray(),str2="11001".toCharArray();
		
		int carry=0;
		
		String result="";
		
		for(int i=str1.length-1;i>=0;i--) {
			
			int n1=str1[i]-'0',n2=str2[i]-'0';
			 		
			int sum=n1^n2^carry;
			
			result=String.valueOf(sum)+result;
			
			carry=((n1&n2)|(n2&carry)|(carry&n1));
			
		}
		
		if(carry==1)
			result='1'+result;

		System.out.println(result);
	}

}
