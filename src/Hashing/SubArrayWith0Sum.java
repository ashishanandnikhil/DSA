package Hashing;

import java.util.HashSet;

public class SubArrayWith0Sum {

	public static void main(String[] args) {
		int[] arr = {1,4,13,-3,-10,5};
		System.out.println(ispair(arr));
	}
	public static boolean ispair(int[] arr) {
		HashSet<Integer> hs = new HashSet<Integer>();
		int prefixSum = 0;
		hs.add(prefixSum);
		for(int i=0;i<arr.length;i++) {
			prefixSum = prefixSum + arr[i];
			if(hs.contains(prefixSum)) {
				return true;
			}
			if(prefixSum == 0) {
				return true;
			}
				hs.add(prefixSum);
		}
		return false;
	}

}
