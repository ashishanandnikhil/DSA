package Arrays;

import java.util.Scanner;

public class StrictlyGreaterToX {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n=scn.nextInt();
		int[] arr= new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int x= scn.nextInt();
		
		strictly(arr,x);

	}

	public static void strictly(int[] arr, int x) {
		int count =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > x) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
