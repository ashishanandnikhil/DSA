package Arrays;

public class RemDuplicates {

	public static void main(String[] args) {
		int[] arr= {10,20,20,30,30,30,30};
		rem(arr);

	}

//	public static void rem(int[] arr) {
//		int[] temp=new int[arr.length];
//		temp[0]=arr[0];
//		int k=1;
//		for(int i=1;i<arr.length;i++) {
//			if(arr[i] != arr[i-1]) {
//				temp[k++]=arr[i];
//			}
//		}
//		for(int val : temp) {
//			System.out.println(val);
//		}
//	}
	
	public static void rem(int[] arr) {
		
		int k=1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i] != arr[i-1]) {
				arr[k++] = arr[i];
			}
		}
		for(int val:arr) {
			System.out.println(val);
		}
	}

}
