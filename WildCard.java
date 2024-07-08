package Dynamic;

public class WildCard {

	public static void main(String args[]) {
		
		String pat="ba*a?",txt="baaabab";
		
	 
		int n=pat.length(),m=txt.length();
		
		boolean[][] T=new boolean[m+1][n+1];
		
		for(int i=0;i<=m;i++) {
			
			for(int j=0;j<=n;j++) {
				T[i][j]=false;
			}
		}
		
		T[0][0]=true;
		
		for(int i=1;i<=m;i++) {
			
			for(int j=1;j<=n;j++) {
				
				if(pat.charAt(j-1)=='*') {
					T[i][j]=T[i-1][j]||T[i][j-1];
				}
				else if(pat.charAt(j-1)=='?'||txt.charAt(i-1)==pat.charAt(j-1)) {
					T[i][j]=T[i-1][j-1];
				}
			}
		}
		
		System.out.println(T[m][n]);
	}
}
