package Strings;

public class HidePhoneNumber {

	public static void main(String[] args) {
		String s = "8084135911";
		System.out.println(hidePhoneNumber(s));
		

	}
	
	public static String hidePhoneNumber(String s) {
		String ans ="";
		int count = 0;
		for(int i=s.length()-1;i>=0;i--) {
			if(count >= 3) {
				ans = "*" + ans;
			} else {
				ans = s.charAt(i) + ans;
			}
			count++;
		}
		return ans;
	}

}
