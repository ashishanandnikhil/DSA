package Strings;

public class Frequency {

	public static void main(String[] args) {
		String s = "geeksforgeeks";
		int[] arr = new int[26];
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i) - 'a']++;
		}
		
		for(int i=0;i<26;i++) {
			if(arr[i] > 0) {
				System.out.println((char)(i+'a') + " " + arr[i]);
			}
		}

	}

}
