package Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int[] arr1 = {1,3,4,6};
		int[] arr2 = {2,5,7,8};
		merge(arr1,arr2);

	}

	public static void merge(int[] arr1, int[] arr2) {
		int[] arr= new int[arr1.length + arr2.length];
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i] < arr2[j]) {
				arr[k]=arr1[i];
				i++;
			}else {
				arr[k]=arr2[j];
				j++;
			}
			k++;
		}
		while(i<arr1.length) {
			arr[k]=arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length) {
			arr[k]=arr2[j];
			j++;
			k++;
		}
		for(int val : arr) {
			System.out.println(val);
		}
		
	}

}
