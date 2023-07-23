package Strings;

public class Palindrome {

	public static void main(String[] args) {
		String s = "ABCDCBA";
	//	String s = "Ashishanand";
		System.out.println(palindrome(s));
	}

	public static boolean palindrome(String s) {
		int start = 0;
		int end = s.length()-1;
		while(start < end) {
			if(s.charAt(start) != s.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

}
