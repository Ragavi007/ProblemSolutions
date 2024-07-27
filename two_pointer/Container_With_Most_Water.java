package two_pointers;
/* 11.Container With Most Water
You are given an integer array height of length n.
There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.
Notice that you may not slant the container.

*/

public class Container_With_Most_Water {
	public int maxArea(int[] height) {
		int i =0;
		int j =height.length-1;
		int maxArea = 0;
		while(i<j) {
			int currentArea = Math.min(height[i],height[j]) * (j-1);
			maxArea = Math.max(maxArea, currentArea);
			if(height[i]<height[j]) {
				i++;
			}else {
				j--;
			}
		}
		return maxArea;
	}

/*	public static void main(String[] args) {
		Container_With_Most_Water o = new Container_With_Most_Water();
		int[] height = {1,8,6,2,5,4,8,3,7};
		System.out.println(o.maxArea(height));

	}
*/
}
