package Strings;

import java.util.Scanner;

public class PyramidPrinting {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String[] pattern = pyramidPrinting(n);
		for(int i=0;i<n;i++) {
			System.out.println(pattern[i]);
		}

	}

	public static String[] pyramidPrinting(int n) {
		String[] res = new String[n];
		for(int row=0;row<n;row++) {
			String colStars = new String();
			for(int col=0;col<=row;col++) {
				colStars = colStars + "*" + " ";
			}
			res[row] = colStars;
		}
		return res;
	}

}
