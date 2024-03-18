package problem_solving;

public class SecondLargest {

	public static void main(String[] args) {
		int[] arr = {12,13,5,6,18,43};
		int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>first) {
				second = first;
				first = arr[i];
			}else if(arr[i]>second && arr[i]!= first) {
				second = arr[i];
			}
		}
		
		if(second != Integer.MIN_VALUE) {
			System.out.println(second);
		}

	}

}
