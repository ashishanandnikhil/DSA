package Hashing;

import java.util.HashMap;

public class Frequency {

	public static void main(String[] args) {
		int[] arr = {10,12,10,15,10,20,12,12};
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			int key = arr[i];
			if(hm.containsKey(key)) {
				hm.put(arr[i], hm.get(arr[i]) +1);
			} else {
				hm.put(arr[i], 1);
			}
		}
		
		System.out.println(hm);
	}

}
