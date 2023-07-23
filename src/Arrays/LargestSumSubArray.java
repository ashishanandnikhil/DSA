package Arrays;

public class LargestSumSubArray {

	public static void main(String[] args) {
		int[] arr= {-3,4,-1,-2,1,5};
		int n=arr.length;
		largestSubArray(arr,n);

	}

	public static void largestSubArray(int[] arr, int n) { 
		
		int res = arr[0];
		int maxEnding = arr[0];
		for(int i=1;i<n;i++) {
			maxEnding=Math.max(maxEnding+arr[i],arr[i]);
			res=Math.max(res, maxEnding);
		}
		System.out.println(res);
		
	}
		
		
		

}
