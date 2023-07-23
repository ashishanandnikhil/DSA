package Arrays;

public class MaxDiff {

	public static void main(String[] args) {
		int[] arr= {2,3,10,6,4,8,1};
		diff(arr);

	}

	public static void diff(int[] arr) {
		
		int[] prefixMin= new int[arr.length];
		int[] suffixMax= new int[arr.length];
		
		prefixMin[0]= arr[0]; 
		for(int i=1;i<arr.length;i++) {
			prefixMin[i]=Math.min(arr[i], prefixMin[i-1]);
		}
		
		suffixMax[arr.length-1]=arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--) {
			suffixMax[i]=Math.max(arr[i], suffixMax[i+1]);
		}
		
		int i=0,j=0,res=0;
		while(i<arr.length && j<arr.length) {
			if(suffixMax[j] > prefixMin[i]) {
				res = Math.max(res, suffixMax[j] - prefixMin[i]);
			}
			i++;
			j++;
		}
		System.out.println(res);
	}

}
