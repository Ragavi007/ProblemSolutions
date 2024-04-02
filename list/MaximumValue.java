package list;

import java.util.Arrays;
import java.util.List;

public class MaximumValue {
	public static void main(String[] args) {
		List<Integer> arrayList = Arrays.asList(5,3,15,234,123);
		int maxValue = Integer.MIN_VALUE;
		
		for(Integer integer : arrayList) {
			if(integer > maxValue)
				maxValue = integer;
		}
		System.out.println("The Maximum Value "+maxValue);
	}

}
