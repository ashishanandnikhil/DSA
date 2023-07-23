package Arrays;

import java.util.Scanner;

public class DigitFrequency {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
		int d=scn.nextInt();
		int res=df(n,d);
		System.out.println(res);

	}

	public static int df(int n, int d) {
		int count=0;
		for(int i=n;i>0;i=i/10) {
			int ld=i%10;
			if(ld==d) {
				count++;
			}
		}
		return count;
	}

}
