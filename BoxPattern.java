package patterns;

public class BoxPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=6;
		int t=2*n-1;int temp=t;
		int p=n;int m=0;
		int[][] arr=new int[t][t];
		 
		for(int k=0;k<p;k++) {
			
			for(int i=m;i<t;i++) {
				
				for(int j=m;j<t;j++) {
				
					arr[i][j]=n;
					if(n==1)
						break;
				}
				
			}
			m++;
			t--;
			n--;
		}
	
		
		for(int i=0;i<temp;i++) {
			for(int j=0;j<temp;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}

}

