package Arrays;

public class MinConseFlips {

	public static void main(String[] args) {
		int[] arr = {0,0,1,1,1,0,0,1,1,0};
		conseFlips(arr);

	}

	public static void conseFlips(int[] arr) {
		
		int idx=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[idx] != arr[i]) {
				if(arr[idx]==1) {
					arr[i]=1;
				}else {
					arr[i]=0;
				}
			}
		}
		for(int val : arr) {
			System.out.println(val);
		}
	}
}