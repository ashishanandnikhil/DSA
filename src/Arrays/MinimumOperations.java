package Arrays;

public class MinimumOperations {

	public static void main(String[] args) {
		int[] arr = {10,3,8};             // 10,3,8
		int k=2;
		System.out.println(op(arr,k));

	}

	public static int op(int[] arr, int k) {
		
		int curr=0,curri=0,ans=0;
		for(int i=0;i<k;i++) {
			curr=curr+arr[i];
			curri = curr;
		}
		for(int i=k;i<arr.length;i++) {
			curr = curr + arr[i] - arr[i-k];	
			ans = ans + Math.abs(curr - curri);
			
		}
			
		
		return ans;
	}

}
