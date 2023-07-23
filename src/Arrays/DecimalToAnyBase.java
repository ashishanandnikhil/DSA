package Arrays;

import java.util.Scanner;

public class DecimalToAnyBase {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		int b= scn.nextInt();
		
		int res=0;
		int count=0;
		while(n>0) {
			int rem = n%b;
			res=res+ rem * (int)Math.pow(10, count);
			count++;
			n=n/b;
		}
		System.out.println(res);

	}

}
