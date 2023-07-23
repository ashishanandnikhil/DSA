package Arrays;

public class MaxCircularSum {

	public static void main(String[] args) {
		int[] arr= {5,-2,3,4};
		int sum = normalSum(arr);
		overallSum(arr,sum);

	}

	private static int normalSum(int[] arr) {
		
		int ans=-1;
		int currMax=arr[0];
		for(int i=1;i<arr.length;i++) {
				currMax = Math.max(currMax+arr[i], arr[i]);
				ans=Math.max(ans, currMax);
		}
		return ans;
	}

	private static void overallSum(int[] arr, int normalSum) {
		
		int arraySum=0;
		for(int i=0;i<arr.length;i++) {
			arraySum = arraySum + arr[i];
		}
		
		int ans=-1;
		int minEnding=arr[0];
		for(int i=1;i<arr.length;i++) {
			minEnding=Math.min(minEnding+arr[i], arr[i]);
			ans=Math.min(ans,minEnding );
		}
		int circularSum = arraySum-ans;
		if(normalSum > circularSum) {
			System.out.println(normalSum);
		}else {
			System.out.println(circularSum);
		}
		
	}

}
