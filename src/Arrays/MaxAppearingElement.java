package Arrays;

public class MaxAppearingElement {

	public static void main(String[] args) {
		int[] arr = {8,8,1,2,5,7,9,6,8,8,5};
		majority(arr);
	}

	public static void majority(int[] arr) {
		int max=arr[0],count=1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i] == arr[i-1]) {
				count++;
			}else {
				count--;
			}
			if(count==0) {
				max=arr[i];
				count=1;
			}
		}
		System.out.println(max);
	}

}
