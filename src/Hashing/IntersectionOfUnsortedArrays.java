package Hashing;

import java.util.HashSet;

public class IntersectionOfUnsortedArrays {

	public static void main(String[] args) {
		int[] a1 = {10,15,20,25,30,50};
		int[] a2 = {30,5,15,80};
		HashSet<Integer> hs = new HashSet<Integer>();

		for(int i=0;i<a2.length;i++) {
			hs.add(a2[i]);
		}
		for(int i=0;i<a1.length;i++) {
			if(hs.contains(a1[i])) {
				System.out.println(a1[i]);
			}
		}
	}

}
