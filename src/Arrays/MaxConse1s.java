package Arrays;

public class MaxConse1s {

	public static void main(String[] args) {
		int[] arr= {1,0,0,1,1,1,1,0,1,1,0};
		max(arr);

	}

	public static void max(int[] arr) {
		
		int res=0;
		int currMax=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 1) {
				currMax++;
			}else if(arr[i] == 0) {
				currMax=0;
			}
			res = (int) Math.max(res, currMax);
			
		}
		System.out.println(res);
		
	}

}
