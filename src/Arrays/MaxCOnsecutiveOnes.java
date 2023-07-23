package Arrays;

public class MaxCOnsecutiveOnes {
	
	public static void main(String[] args) {
		int[] arr= {1,0,1,1,1,1,0,1,1,1,1,1};
		max(arr);
	}

	public static void max(int[] arr) {
		
		int curr=0,ans=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				curr++;
				ans = Math.max(ans, curr);
			}else {
				curr=0;
			}
		}
		System.out.println(ans);
	}
}
