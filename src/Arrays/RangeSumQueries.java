package Arrays;

public class RangeSumQueries {

	public static void main(String[] args) {
		int[] arr= {4,5,3,2,5};
		int l=1;
		int r=3;
		range(arr,l,r);

	}

	public static void range(int[] arr, int l, int r) {
		int[] prefixSum=new int[arr.length];
		prefixSum[0]=arr[0];
		for(int i=1;i<arr.length;i++) {
			prefixSum[i]=prefixSum[i-1] + arr[i];
		}
		if(l==0) {
			System.out.println(prefixSum[r]);
		}else {
			int ans = prefixSum[r]-prefixSum[l-1];
			System.out.println(ans);
		}
		
	}

}
