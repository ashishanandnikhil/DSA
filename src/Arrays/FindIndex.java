package Arrays;

import java.util.Scanner;

// Time Complexity is O(n) since in the worst case we'll have to traverse the whole array

public class FindIndex {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();	
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int d=scn.nextInt();
		System.out.println(findEle(arr,d));

	}
	
	public static int findEle(int[] arr, int d) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == d) {
				return i;
			}
		}
		return -1;
	}

}
