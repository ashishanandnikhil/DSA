package Arrays;

public class RighttRotateByOne {

	public static void main(String[] args) {
		int[] nums = {-1,-100,3,99};
		int k = 2;
		rotate(nums, k);

	}

	public static void rotate(int[] nums, int k) {
		int[] temp = new int[k];
		for(int i=0;i<k;i++) {
			temp[i]=nums[i+k];
		}
		for(int i=k;i>=0;i--) {
		nums[i+k]=nums[i];
		}
		for(int i=0;i<k;i++) {
		nums[i]=temp[i];
		}
		for(int val : nums) {
			System.out.print(val + " ");
		}
	}
}

//	public static void rotate(int[] nums, int k) {
//		for(int c=1;c<=k;c++) {
//	        int count =0;
//	        int l=nums[nums.length-1];
//	        int j=nums.length-1;
//	        for(int i=nums.length-2;i>=0;i--) {
//	            nums[j]=nums[i];
//	            j--;
//	        }
//	        nums[0]=l;
//	        count++;
//	        }
//	}
