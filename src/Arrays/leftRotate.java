package Arrays;

public class leftRotate {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		rotate(arr);

	}

	public static void rotate(int[] arr) {
		int k=arr[0];
		for(int i=1;i<arr.length;i++) {
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=k;
		for(int val: arr) {
			System.out.println(val);
		}
	}

}
