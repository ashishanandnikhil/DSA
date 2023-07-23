package Arrays;

public class MoveZeroToEnd {

	public static void main(String[] args) {
		int[] arr= {8,5,0,10,5,0,63};
		rem(arr);

	}

	public static void rem(int[] arr) {
		
		int k=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != 0) {
				arr[k++]=arr[i];
			}
		}
		while(k < arr.length) {
			arr[k]=0;
			k++;
		}
		for(int val : arr) {
			System.out.println(val);
		}
	}

}
