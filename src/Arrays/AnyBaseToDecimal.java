package Arrays;

import java.util.Scanner;

public class AnyBaseToDecimal {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
		int b=scn.nextInt();
		
		int res=0;
		int count=0;
		while(n>0) {
			int rem=n%10;
			res=res+ rem * (int)Math.pow(b, count);
			count++;
			n=n/10;
		}
		System.out.println(res);

	}

}
