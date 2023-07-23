package Arrays;

public class LeftRotateByD {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int d=2;
		rotate(arr,d);

	}

	public static void rotate(int[] arr,int d) {
		int[] temp= new int[d];
		
		for(int i=0;i<d;i++) {
			temp[i]=arr[i];
		}
		for(int i=d;i<arr.length;i++) {
			arr[i-d]=arr[i];
		}
		for(int i=0;i<d;i++) {
			arr[arr.length-d+i]=temp[i];
		}
		for(int val : arr) {
			System.out.println(val);
		}
	}

}
