package Arrays;

import java.util.Scanner;

// O(n) if we want to insert at the beginning we have traverse the whole array to 1 position right

public class InsertionInArray {

	public static void main(String[] args) {
		int[] arr= new int[5];
		arr[0]=5;
		arr[1]=7;
		arr[2]=10;
		arr[3]=20;
		Scanner scn = new Scanner(System.in);
		int x=scn.nextInt();
		int pos=scn.nextInt();
		int idx=pos-1;
		
		for(int i=arr.length-2;i>=idx;i--) {
			arr[i+1]=arr[i];
		}
		arr[idx]=x;
		
		for(int val : arr) {
			System.out.println(val);
		}
	}

}
