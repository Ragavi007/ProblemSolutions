package problem_solving;

public class SegregateOddEve {

	public static void main(String[] args) {
		int j =-1;
		int[] arr = {12,13,5,6,18,43};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2 == 0) {
				j++;
				int t= arr[i];
				arr[i] = arr[j];
				arr[j] = t;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
