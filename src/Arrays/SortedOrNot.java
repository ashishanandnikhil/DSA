package Arrays;

import java.util.Scanner;

public class SortedOrNot {

	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		
		int n=scn.nextInt();
		int[] arr= new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		System.out.println(isSorted(arr));

	}

    public static boolean isSorted(int[] arr) {
		boolean check = true;
		for(int i=1;i<arr.length;i++) {
			if(arr[i] < arr[i-1]) {
				check =false;
				break;
			}
		}
		return check;
	}

}
