package Arrays;

public class MajorityElementArray {

	public static void main(String[] args) {
		int[] arr= {7,3,4,8,8,8,8,4};
		majority(arr);

	}

	public static void majority(int[] arr) {
		
		int res=0,count=1;
		for(int i=1;i<arr.length;i++) {
			if(arr[res] == arr[i]) {
				count++;
			}else {
				count--;
			}
			if(count == 0) {
				res=i;
				count =1;
			}
		}
		System.out.println(count);
	}

}
