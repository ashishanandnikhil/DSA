package Arrays;

public class LastOccurenceInArray {

	public static void main(String[] args) {
		int[] arr= {5,6,5,3,5,4};
		int x=5;
		int ans = -1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == x) {
				ans = i;
			}
		}
		System.out.println(ans);
		
	}

}
