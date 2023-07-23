package Arrays;

public class TrappingRainWater {

	public static void main(String[] args) {
		int[] arr= {3,0,1,2,5};
		trapping(arr);

	}

	public static void trapping(int[] arr) {
		
		int[] prefixMax= new int[arr.length];
		int[] suffixMax=new int[arr.length];
		
		prefixMax[0]=arr[0];
		for(int i=1;i<arr.length;i++) {
			prefixMax[i]=Math.max(prefixMax[i-1], arr[i]);
		}
		
		suffixMax[arr.length-1]=arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--) {
			suffixMax[i]=Math.max(suffixMax[i+1], arr[i]);
		}
		
		int ans =0;
		for(int i=1;i<arr.length-1;i++) {
			ans = ans + Math.min(prefixMax[i],suffixMax[i]) - arr[i];
		}
		System.out.println(ans);
	}

}
