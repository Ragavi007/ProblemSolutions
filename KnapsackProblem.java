package Dynamic;

public class KnapsackProblem {

	public static int max1(int a,int b) {
		if(a>b)
			return a;
		else 
			return b;
	}
	
	public static void main(String[] args) {
 
		int weight=7;int[] wt= {1,3,4,5},val= {1,4,5,7};
		
		int[][] T=new int[wt.length+1][weight+1];
		
		
		for(int i=0; i <= wt.length; i++){
            T[i][0] = 0;
        }
		
		for(int i=0; i <= weight; i++){
            T[0][i] = 0;
        }
		
		for(int i=1;i<=wt.length;i++) {
			
			for(int w=1;w<=weight;w++){
				 
				if(wt[i-1]<=w)
					T[i][w]=max1(T[i-1][w],T[i-1][w-wt[i-1]]+val[i-1]);
				else
					T[i][w]=T[i-1][w];
				
				System.out.print(T[i][w]+"\t");
		}
			System.out.println();
		}

		System.out.println(T[wt.length][weight]);
		
	}

}
