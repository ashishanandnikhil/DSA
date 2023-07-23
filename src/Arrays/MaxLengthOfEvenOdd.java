package Arrays;

public class MaxLengthOfEvenOdd {

	public static void main(String[] args) {
		int[] arr = {10,12,8,4};
		max(arr);

	}

	public static void max(int[] arr) {
		
		int curr=1,ans=-1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i] %2 == arr[i-1] %2) {
				curr=1;
			}
			else {
				curr++;
			}
			ans=Math.max(ans, curr);
		}
		System.out.println(ans);
	}

}
