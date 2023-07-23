package Hashing;

import java.util.HashMap;
import java.util.Map;

public class HMap {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Ashish", 1);
		hm.put("Anand", 2);
		hm.put("Varma", 3);
		System.out.println(hm);
		if(hm.containsKey("Varma")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		hm.remove("Varma");
		if(hm.containsKey("Varma")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		if(hm.containsValue(2)) {
			System.out.println("yes");
		} else {
			System.out.println("No");
		}
		System.out.println(hm.size());
		System.out.println(hm.get("Ashish"));
		for(Map.Entry<String, Integer> e : hm.entrySet()) {
			System.out.print(e.getKey() + " " + e.getValue() + " ");
		}

	}	

}
