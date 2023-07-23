package Arrays;

public class MajorityElement {

	public static void main(String[] args) {
		int[] arr= {8,7,6,8,8,8,6,6};
		majority(arr);

	}

	public static void majority(int[] arr) {
		int res=0;
		int count=1;
		for(int i=1;i<arr.length;i++) {
			if(arr[res] == arr[i]) {
				count++;
			}else {
				count--;
			}
			if(count == 0) {
				res =i;
				count =1;
			}
		}
		System.out.println(arr[res]);
		
	}

}
