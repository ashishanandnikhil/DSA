package Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int x=25;
		System.out.println(search(arr,x));

	}

	public static int search(int[] arr, int x) {
		int l=0,r=arr.length-1;
		while(l<=r) {
			int mid=(l+r)/2;
			if(arr[mid]==x) 
				return mid;
			else if(arr[mid] < x) {
				l=mid+1;
			}
			else if(arr[mid] > x) {
				r=mid-1;
			}
		}
		return -1;
	}

}
