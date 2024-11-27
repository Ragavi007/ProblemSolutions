package zq1;

public class DeletingStringWithSubstring {

	public static boolean check(int[] freq,String str) {
		
		int cnt=0,temp=0;
		for(int i=0;i<26;i++) {
			
			if(freq[i]>0 && cnt==0) {
				 temp=freq[i];
			}
			else if(freq[i]>0 && cnt!=0) {	
				if(freq[i]!=temp)
					return false;
			}
			
		}
		
		System.out.println(temp);
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "abcdaabcdbcd";
		
		int[] freq=new int[26];
		
		for(int i=0;i<str.length();i++) {
			
			
			if(str.charAt(i)>=97&&str.charAt(i)<=122) {
				freq[str.charAt(i)-97]++;
			}
			
			
		}
		System.out.println(check(freq,str));

	}

}
