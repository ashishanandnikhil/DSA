package Arrays;

public class SlidingWindowTech {

	public static void main(String[] args) {
		int[] arr = {1,8,30,-5,20,7};
		int k=4;
		slidingTech(arr,k);

	}

//	public static void slidingTech(int[] arr,int k) {
//		
//		int count=0;
//		for(int i=0;i<arr.length-k;i++) {
//			int res=0;
//			for(int j=i+1;j<=i+k;j++) {
//				res=res+arr[j];
//				count=Math.max(count, res);
//			}
//		}
//		System.out.println(count);
//		
//	}
	
	// Optimised Sliding Window Technique
	
	public static void slidingTech(int[] arr, int k) {
		
		int curr=arr[0];
		int count=1;
		int res=0;
		for(int i=1;i<arr.length;i++) {
			if(count <= k) {
				curr = curr+arr[i];
				count++;
			} else {
				curr=curr+arr[i]-arr[i-k];
				res = Math.max(res, curr);
				count=1;
			}
		}
		System.out.println(res);
	}
}

