package Arrays;

public class LargestElement {

	public static void main(String[] args) {
		int[] arr= {40,8,50,100};
		largest(arr);

	}

	public static void largest(int[] arr) {
		int maxEle=Integer.MIN_VALUE;
		int ans =0;
		for(int i=0;i<arr.length;i++) {
			if(maxEle < arr[i] ) {
				maxEle=arr[i];
				ans=i;
			}
			
		}
		System.out.println(ans);
	}

}
