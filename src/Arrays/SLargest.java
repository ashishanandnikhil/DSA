package Arrays;

public class SLargest {

	public static void main(String[] args) {
		int[] arr= {10,5,8,20,40,50,65,5,87};
		large(arr);

	}

	public static void large(int[] arr) {
		int max=-1,sMax=-1;
		if(arr[0] < arr[1]) {
			max=arr[1];
			sMax=arr[0];
		} else {
			max=arr[0];
			sMax=arr[1];
		}
		int res=max;
		for(int i=2;i<arr.length;i++) {
			res=Math.max(res, arr[i]);
			sMax=Math.max(sMax, Math.min(max, res));
			max=Math.max(max, arr[i]);
		}
		System.out.println(sMax);
	}

}
