package Hashing;

import java.util.HashSet;

public class HSet {

	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();
		h.add("Ashish");
		h.add("Anand");
		h.add("Varma");
		System.out.println(h.size());
		h.remove("Anand");
		System.out.println(h.size());
		for(String s : h) {
			System.out.print(s+ " ");
		}
		System.out.println(h.isEmpty());
	}

}
