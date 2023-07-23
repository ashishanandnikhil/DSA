package Strings;

import java.util.Arrays;

public class LeftMostNonRepeating {

	public static void main(String[] args) {
		String s = "geeksforgeeks";
		System.out.println(left(s));

	}

//	public static int left(String s) {
//		int[] count = new int[256];
//		Arrays.fill(count, -1);
//		for(int i=0;i<s.length();i++) {
//			count[s.charAt(i)]++;
//		}
//		for(int i=0;i<s.length();i++) {
//			if(count[s.charAt(i)] == 0) 
//				return i;
//		}
//		return -1;
//	}
	
	public static int left(String s) {
		int[] count = new int[256];
		Arrays.fill(count, -1);
		int res = Integer.MAX_VALUE;
		for(int i=0;i<s.length();i++) {
			if(count[s.charAt(i)] == -1) {
				count[s.charAt(i)] = i;
			} else {
				count[s.charAt(i)] = -2;
			}
		}
		for(int i=0;i<count.length;i++) {
			if(count[i] >= 0) {
				res = Math.min(res, count[i]);
			}
		}
		return res;
	}
}
