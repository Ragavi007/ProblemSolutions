package patterns;

public class Diamond {

	public static void printNumbers(int n) {
		  
		int number=1,temp=0;
		
		for(int i=1;i<=n;i++ ) {
			
			for(int space= i;space< n;space++) { 
				System.out.print( " " );
			}
			  
			int t=number;
			for(int j=1;j<=i  ;j++) {
				System.out.print(  t--      +" "); 
			}  
	 		
			number =number+i+1  ;
			System.out.println();
			temp= i;
		} 
		
		
		number-=(temp+1);
		for(int i=n ;i>=1 ;i--  ) {
			
			for(int space= n-1;space >=i;space-- ) { 
				System.out.print( " ");
			}
			
			for(int j=1;j<= i;j++) {
				System.out.print( number-- +" "  );
			}
			System.out.println();
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n=  4;
		
		printNumbers(n);
		
		for(int i=1;i<=n;i++ ) {
			
			for(int space= i;space<=n;space++) { 
				System.out.print( " " );
			}
			
			for(int j=1;j<= 2*i-1;j++) {
				System.out.print("*" );
			}
			
			System.out.println();
		}
		
		for(int i=n-1;i>=1 ;i--  ) {
			
			for(int space= n;space >=i;space-- ) { 
				System.out.print( " ");
			}
			
			for(int j=1;j<= 2*i-1;j++) {
				System.out.print("*" );
			}
			System.out.println();
		}

	}

}
