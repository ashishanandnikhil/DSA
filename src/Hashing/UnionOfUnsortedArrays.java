package Hashing;

import java.util.HashSet;

public class UnionOfUnsortedArrays {

	public static void main(String[] args) {
		int[] a = {5,20,5,15};
		int[] b = {15,15,15,20,10};
		HashSet<Integer> hs =  new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++) {
			hs.add(a[i]);
		}
		for(int i=0;i<b.length;i++) {
			hs.add(b[i]);
		}
		
		System.out.println(hs.size());
	}

}
