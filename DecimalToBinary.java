package problem_solving;
//Convert the Decimal number to Binary Number
public class DecimalToBinary {
    public static void decToBin(int n) {
    	int[] binNum = new int[1000];
    	int i=0;
    	while(n>0) {
    		binNum[i] = n%2;
    		n=n/2;
    		i++;
    	}
    	for(int j=i-1;j>=0;j--) {
    		System.out.print(binNum[j]);
    	}
    	
    }
	public static void main(String[] args) {
		int n = 1234;
		decToBin(n);

		
	}

}
