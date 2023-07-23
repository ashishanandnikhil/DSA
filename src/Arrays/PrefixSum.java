package Arrays;

public class PrefixSum {

	public static void main(String[] args) {
		int[] arr = {2,8,3,9,6,5,4};
		int s=2;
		int e=6;
		getSum(arr,s,e);

	}

	public static void getSum(int[] arr, int s, int e) {
		int sum=0;
		for(int i=s;i<=e;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
		
	}

}
