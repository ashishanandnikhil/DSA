package Arrays;

public class MaxLengthEvenOddSubArray {

	public static void main(String[] args) {
		int[] arr= {7,10,13,14};
		max(arr);

	}

	public  static void max(int[] arr) {
		int res=1;
		int curr=1;
		for(int i=1;i<arr.length;i++) {
			if((arr[i]%2==0 && arr[i-1]%2!=0) || (arr[i]%2!=0 && arr[i-1]%2==0) ) {
				curr++;
				res = Math.max(res, curr);
			}
			else {
				curr=1;
			}
		}
		System.out.println(res);
	}

}
