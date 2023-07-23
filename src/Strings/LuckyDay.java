package Strings;

public class LuckyDay {

	public static void main(String[] args) {
		String s = "taylor";
		System.out.println(check(s));
	}

	public static String check(String s) {
		if(s.startsWith("T") || s.startsWith("t")) {
			return s + " is eligible";
		}
		return s + " is not eligible";
	}

}
