package Arrays;

public class MaxCircularSumSubArray {

	public static void main(String[] args) {
		int[] arr= {1,-2,3,-2};
		int ans = normalsum(arr);
		circularSum(arr,ans);

	}
	
	public static int normalsum(int[] arr) {
		int maxEnding=arr[0];
		int res=arr[0];
		for(int i=1;i<arr.length;i++) {
			maxEnding=Math.max(maxEnding, maxEnding+ arr[i]);
			res=Math.max(res, maxEnding);
		}
		return res;
		
	}
	
	public static void circularSum(int[] arr, int normalSum) {
		
		int minEnding=arr[0];
		int res=arr[0];
		for(int i=1;i<arr.length;i++) {
			minEnding =Math.min(minEnding, minEnding+arr[i]);
			res=Math.min(res, minEnding);
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		int cSum=sum-res;
		if(normalSum > cSum) {
			System.out.println(normalSum);
		}
		else {
			System.out.println(cSum);
		}
		
	}

}
