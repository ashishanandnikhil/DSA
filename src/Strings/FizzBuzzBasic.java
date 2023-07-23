package Strings;

import java.util.Scanner;

public class FizzBuzzBasic {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String[] ans = fizzBuzz(n);
		for(int i=1;i<ans.length;i++) {
			System.out.println(ans[i]);
		}

	}

	public static String[] fizzBuzz(int n) {
		
		String[] temp = new String[n+1];
		for(int i=1;i<=n;i++) {
			if(i%3 == 0 && i%5 == 0) {
				temp[i] = "FizzBuzz";
			}
			else {
				if(i%3 == 0) {
					temp[i] = "Fizz";
				} else if(i%5 == 0) {
					temp[i] = "Buzz";
				} else {
					temp[i] = Integer.toString(i);
				}
			}
		}
		return temp;
	}

}
