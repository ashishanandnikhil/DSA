package Arrays;

public class FrequencyInSortedArray {

	public static void main(String[] args) {
		int[] nums = {10,10,10,25,30,30};
		int n= nums.length;
		frequency(nums,n);
		

	}

	public static void frequency(int[] nums, int n) {
		int freq=1,i=1;
		while(i<n) {
			while(i<n && nums[i] == nums[i-1]) {
				freq++;
				i++;
			}
			System.out.println(nums[i-1] + " " + freq);
			i++;
			freq=1;
		}
	}
}
