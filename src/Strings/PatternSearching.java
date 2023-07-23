package Strings;

public class PatternSearching {

	public static void main(String[] args) {
		String s ="geeksforgeeks";
		String p = "eks";
		pattern(s,p);
		

	}

	public static void pattern(String s, String p) {
		int p1 = 0;
		int p2 = 0;
		int count = 0;
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(p1) != s.charAt(p2)) {
				p1++;
			} else {
				p1++;
				p2++;
			}
			if(p2>p.length()) {
				p2=0;
				count++;
			}
		}
		System.out.println(count);
	}

}
