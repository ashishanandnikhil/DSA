package Arrays;

public class EquilibriumPoint {

	public static void main(String[] args) {
		int[] arr= {-7, 1, 5, 2, -4, 3, 0};
		int n= arr.length;
		equi(arr,n);

	}

//	public static void equi(int[] arr, int n) {
//		int leftSum=0;
//		for(int i=0;i<n-1;i++) {
//			leftSum=leftSum+arr[i];
//			int rightSum=0;
//			for(int j=i+1;j<n;j++) {
//				rightSum=rightSum+arr[j];
//			}
//			if(leftSum-arr[i] == rightSum) {
//				System.out.println(i);
//			}
//		}
//	}
	
	public static void equi(int[] arr, int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		int leftSum=0;
		for(int i=0;i<n-1;i++) {
			int rightSum=0;
			leftSum=leftSum+arr[i];
			rightSum=sum-(leftSum-arr[i]);
			if(leftSum == rightSum) {
				System.out.println(i);
			}
		}
		
	}

}
