package Arrays;

import java.util.Arrays;

public class Deletion {
	public static void main(String[] args) {
		int[] nums = {1,2,2,4};
		int val = 2;
		removeElement(nums, val);
//		for(int ans : nums) {
//			System.out.println(ans);
//		}
	}
	
	public static void removeElement(int[] nums, int val) {
		Arrays.sort(nums);
		int[] temp= new int[nums.length];
	       temp[0]=nums[0];
	       int res=1;
         for(int i=1;i<nums.length;i++) {
             if(temp[res-1] != val) {
            	 temp[res]=nums[i];
            	 res++;            	 
             }
         }
         for(int i=0;i<res;i++) {
        	 nums[i]=temp[i];
         }
        
	}
}
            