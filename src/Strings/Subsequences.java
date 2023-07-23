package Strings;

public class Subsequences {

	public static void main(String[] args) {
		String s1 = "abcd";
		String s2 = "ac";
		System.out.println(subsequence(s1,s2));
	}

	public static boolean subsequence(String s1, String s2) {
		int i = 0;
		int j = 0;
		while(i != s1.length() && j != s2.length()) {
			if(s1.charAt(i) != s2.charAt(j)) {
				i++;
			} else {
				i++;
				j++;
			}
		}
		if(j == s2.length()) {
			return true;
		} 
		return false;
		
	}
}
