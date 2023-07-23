package Arrays;

public class MaxSumSubArray {

	public static void main(String[] args) {
		int[] arr = {2,3,-8,7,-1,2,3};
		sum(arr);

	}

	// Kadane's algorithm
	public static void sum(int[] arr) {
		int res =arr[0];
		int maxEnding=arr[0];
		for(int i=1;i<arr.length;i++) {
			maxEnding=Math.max(maxEnding + arr[i],arr[i]);
			res = Math.max(res, maxEnding);
		}
		System.out.println(res);
	}

}
