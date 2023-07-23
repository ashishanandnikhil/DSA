package Arrays;

public class CheckSortness {

	public static void main(String[] args) {
		int[] arr= {5,100,51,65};
		check(arr);

	}

	public static void check(int[] arr) {
		
		boolean flag=true;
		for(int i=1;i<arr.length;i++) {
			if(arr[i] < arr[i-1]) {
				flag=false;
				System.out.println(flag);
				break;
			}
		}
		if(flag== true) {
			System.out.println("true");
		}
	}

}
