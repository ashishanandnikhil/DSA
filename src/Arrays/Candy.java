package Arrays;

public class Candy {

	public static void main(String[] args) {
		int[] arr = {1,0,2};
		System.out.println(candy(arr));

	}

	public static int candy(int[] arr) {
		int sum =0;
		int[] child = new int[arr.length];
		for(int i=0;i<child.length;i++) {
			child[i]=1;
		}
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1] > arr[i]) {
				child[i+1]++;
			}
		}
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i] > arr[i+1] && child[i] <= child[i+1]) {
				child[i]++;
			}
			sum = sum + child[i];
		}
		sum = sum + child[arr.length - 1];
		return sum;
	}

}
