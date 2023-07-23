package Arrays;

import java.util.Scanner;

public class SpanOfArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();	
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		span(arr);
		}

	public static void span(int[] arr) {
		int min = Integer.MAX_VALUE,max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > max) {
				max=arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		int res= max-min;
		System.out.println(res);
		
	}

}
