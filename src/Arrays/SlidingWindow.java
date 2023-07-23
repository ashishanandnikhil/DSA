package Arrays;

public class SlidingWindow {

	public static void main(String[] args) {
		int[] arr = {1,8,30,-5,20,7};
		int k=3;
		sliding(arr,k);

	}

	public static void sliding(int[] arr,int k) {
		
		int curr=0,res=0;
		for(int i=0;i<k;i++) {
			curr=curr+arr[i];
		}
		for(int i=k;i<arr.length;i++) {
			curr=curr+arr[i]-arr[i-k];
			res=Math.max(curr, res);
		}
		System.out.println(res);
	}

}
