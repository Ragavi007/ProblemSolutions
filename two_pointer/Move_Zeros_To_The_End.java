package two_pointers;

	public class Move_Zeros_To_The_End {
		public void moveZeroes(int[] nums) {
			if(nums.length == 0 || nums.length == 1 )
				return ;
			
			int nz = 0;
			int z = 0;
			while(nz<nums.length) {
				if(nums[nz] != 0) {
					int temp = nums[nz];
					nums[nz] = nums[z];
					nums[z] = temp;
					
					nz++;
					z++;
				}else {
					nz++;
				}
			}
		}
	
/*		public static void main(String[] args) {
			Move_Zeros_To_The_End o = new Move_Zeros_To_The_End();
			int[] nums = {1,2,3,0,0,7,0,8,9};
			o.moveZeroes(nums);
			for(int i : nums) {
				System.out.print(i+ " ");
			}
			
		}
*/	
	}
