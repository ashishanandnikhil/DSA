package Arrays;

public class DeletionFromSortedArray {

	public static void main(String[] args) {
		int[] nums= {1};
		removeDuplicates(nums);
		for(int val : nums) {
			System.out.println(val);
		}

	}
	 public static int removeDuplicates(int[] nums) {
	     
	     int j=0;
	     for(int i=0;i<nums.length-1;i++) {
	    	 if(nums[i] != nums[i+1]) {
	    		 nums[j] = nums[i];
	    		 j++;
	    	 }
	     }
	    	 nums[j]=nums[nums.length-1];
	    	 return j;
	     }
	 }
