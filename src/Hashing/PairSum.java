package Hashing;

import java.util.HashSet;

public class PairSum {

	public static void main(String[] args) {
		int[] arr = {8,3,2,5};
		int sum = 6;
		System.out.println(pairSum(arr,sum));
	}
	public static boolean pairSum(int[] arr,int sum) {
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i: arr) {
			if(hs.contains(sum-i)) {
				return true;
			} else {
				hs.add(i);
			}
		}
		return false;
	}
}
