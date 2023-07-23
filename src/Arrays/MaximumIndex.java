package Arrays;

public class MaximumIndex {

	public static void main(String[] args) {
		int[] arr= {35 ,98 ,95, 94, 75, 8 ,47, 28, 75, 91, 28, 83, 72, 54, 67, 9 ,34};
		max(arr);
	}

//	public static void max(int[] arr) {
//		int res=Integer.MIN_VALUE;
//		for(int i=0;i<arr.length-1;i++) {
//			for(int j=arr.length-1;j>i;j--) {
//				if(arr[j] >= arr[i]) {
//					res = Math.max(res, j-i);
//					break;
//				}
//			}
//		}
//		 System.out.println(res);
//	}
	
	
	public static void max(int[] arr) {
		
		int[] prefixMin=new int[arr.length];
		int[] suffixMax=new int[arr.length];
		
		prefixMin[0]=arr[0];
		for(int i=1;i<arr.length;i++) {
			prefixMin[i]=Math.min(prefixMin[i-1], arr[i]);
		}
		
		suffixMax[arr.length-1]=arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--) {
			suffixMax[i]=Math.max(arr[i], suffixMax[i+1]);
		}
		int i=0,j=0,ans = -1;
		while(i<arr.length && j<arr.length) {
			if(prefixMin[i] <= suffixMax[j]) {
				ans= Math.max(ans, j-i);
				j++;
			}
			else {
				i++;
			}
		}
		System.out.println(ans);
	}
	
	
	
	
	
}
