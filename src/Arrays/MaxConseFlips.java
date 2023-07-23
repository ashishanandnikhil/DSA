package Arrays;

public class MaxConseFlips {

	public static void main(String[] args) {
		int[] arr= {1,1,0,0,0,1,0,0,0,0,1,1,1,0,0,0};
		max(arr);

	}

	public static void max(int[] arr) {
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i] != arr[i-1]) {
				if(arr[i] != arr[0]) {
					System.out.print(i + " - ");
				}else {
					System.out.println(i-1);
				}
			}
		}
		if(arr[0] != arr[arr.length-1]) {
			System.out.println(arr.length-1);
		}
		
	}

}
