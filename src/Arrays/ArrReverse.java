package Arrays;

public class ArrReverse {

	public static void main(String[] args) {
		int[] arr= {10,5,8};
		rev(arr);
	}

	public static void rev(int[] arr) {
		int l=0;
		int r=arr.length-1;
		int temp=0;
		while(l<r) {
			temp=arr[l];
			arr[l]=arr[r];
			arr[r]=temp;
			l++;
			r--;
		}
		for(int val:arr) {
			System.out.println(val);
		}
	}

}
