package Arrays;

public class DeletionInArray {

	public static void main(String[] args) {
		int[] arr= {3,8,12,5,6};
		int x=12;
		int n=arr.length;
		delete(arr,n,x);

	}

	public static void delete(int[] arr, int n, int x) {
		int idx=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==x) {
				idx=i;
				break;
			}
		}
		for(int i=idx+1;i<n;i++) {
			arr[i-1]=arr[i];
		}
		for(int val : arr) {
			System.out.println(val);
		}
		
	}

}
