package Strings;

public class CapitalizeChar {

	public static void main(String[] args) {
		String s = "abcDef";
        int[] ind = new int[] { 1, 3, 5 };
        System.out.println(indexCapitalisation(s,ind));

	}
	public static String indexCapitalisation(String s, int[] ind) {
		StringBuilder sb = new StringBuilder();
		int p=0;
		for(int i=0;i<s.length();i++) {
			if(i == ind[p]) {
				sb.append(Character.toUpperCase(s.charAt(i)));
				p++;
			} else {
				sb.append(s.charAt(i));
			}
			if(p == ind.length) {
				sb.append(s.substring(i+1, s.length()));
				break;
			}
			
		}
		return sb.toString();
	}
}
