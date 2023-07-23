package Strings;

public class ReverseStringInWords {

	public static void main(String[] args) {
		String s = "  ashish  anand   varma  ";
		char[] str = s.toCharArray(); 
		reverse(str);
		System.out.println(str);

	}

//	public static void reverse(String s) {
//		int curr = s.length() - 1;
//		int end = s.length() - 1;
//		String ans = "";
//		for (int i = s.length() - 1; i > 0; i--) {
//			if (s.charAt(i) == ' ') {
//				ans = ans + s.substring(curr + 1, end + 1) + " ";
//				end = curr - 1;
//			}
//			curr--;
//		}
//		ans = ans + s.substring(0, end + 1);
//	//	System.out.println(ans);
//		
	
	public static void reverse(char[] s) {
		int start = 0;
		for(int end=0;end<s.length;end++) {
			if(s[end] == ' ') {
				rev(s,start,end);
				start = end+1;
			}
		}
		rev(s,start,s.length-1);
		rev(s,0,s.length-1);
		
	}
	public static void rev(char[] count, int low,int high) {
		while(low <= high) {
			char temp = count[low];
			count[low] = count[high];
			count[high] = temp;
			low++;
			high--;
		}
	}
}
