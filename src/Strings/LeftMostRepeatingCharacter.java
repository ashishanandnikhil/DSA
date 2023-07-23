package Strings;

import java.util.Arrays;

public class LeftMostRepeatingCharacter {

	
	public static void main(String[] args) {
		String s = "abbcd";
		System.out.println(leftMost(s));

	}

//	
//	public static int leftMost(String s) {
//		int[] count = new int[256];
//		int ans = 0;
//		for(int i=0;i<s.length();i++) {
//			count[s.charAt(i)]++;
//		}
//		for(int i=0;i<count.length;i++) {
//			if(count[i] == 2) {
//				ans = i;
//				break;
//			}
//		}
//		for(int i=0;i<s.length();i++) {
//			if(s.charAt(i) == ans) {
//				return i;
//			}
//		}
//		return -1;
//	
//	public static int leftMost(String s) {
//		int[] count = new int[256];
//		Arrays.fill(count,-1);
//		int res = Integer.MAX_VALUE;
//		for(int i=0;i<s.length();i++) {
//			int CIdx = count[s.charAt(i)];
//			if(CIdx == -1) {
//				count[s.charAt(i)] = i;
//			}else {
//				res = Math.min(res, CIdx);
//			}
//		}
//		return res;
	
	public static int leftMost(String s) {
		boolean[] bool = new boolean[256];
		int res = Integer.MIN_VALUE;
		for(int i=s.length()-1;i>=0;i--) {
			if(bool[s.charAt(i)]) {
				res = i; 
			} else {
				bool[s.charAt(i)] = true;
			}
		}
		return res;
	}
}
