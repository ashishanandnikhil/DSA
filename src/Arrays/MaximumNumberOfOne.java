package Arrays;

public class MaximumNumberOfOne {

	public static void main(String[] args) {
		int[] nums = {1,1,0,1};
		System.out.println(findMaxConsecutiveOnes(nums));
	}
	
	public static int findMaxConsecutiveOnes(int[] nums) {
		 int res =0;
	        for(int i=0;i<nums.length;i++) {
	            int curr=0;
	            for(int j=0;j<nums.length;j++) {
	                if(nums[j]==1){
	                    curr++;
	                }else {
	                    break;
	                }
	            }
	            res = (int) Math.max(res,curr);
	        }
	        return res;    
    }

}
