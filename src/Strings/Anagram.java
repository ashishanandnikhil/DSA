package Strings;

public class Anagram {
	static final int CHAR = 256;

	public static void main(String[] args) {
		System.out.println(anagram("listen","silent"));
		
	}
	
//	public static boolean anagram(String s1,String s2) {
//		char[] a1 = s1.toCharArray();
//		Arrays.sort(a1);
//		s1 = new String(a1);
//		char[] a2 = s2.toCharArray();
//		Arrays.sort(a2);
//		s2 = new String(a2);
//		return s1.equals(s2);
//		
//	}
	
	public static boolean anagram(String s1,String s2) {
		
		if(s1.length() != s2.length()) {
			return false;
		}
		int[] count = new int[256];
		for(int i=0;i<s1.length();i++) {
			count[s1.charAt(i)]++;
			count[s2.charAt(i)]--;
		}
		for(int i=0;i<count.length;i++) {
			if(count[i] != 0) {
				return false;
			}
		}
		return true;
	}
}
