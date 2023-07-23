package Arrays;

import java.util.Scanner;

public class Factorial {
	
	public static int fact(int x) {
		int f=1;
		for(int i=1;i<=x;i++) {
			f=f*i;
		}
		return f;
	}
	public static void display(int fn, int nmrf, int npr) {
		System.out.println(npr);
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		int r=scn.nextInt();
		
		int fn=fact(n);
		int nmrf=fact(n-r);
		int npr=fn/nmrf;
		display(fn,nmrf,npr);

	}

}
