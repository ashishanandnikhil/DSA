package Hashing;

import java.util.Arrays;
import java.util.HashSet;

public class CountDistinctElements {

	public static void main(String[] args) {
//		int[] arr = {15,12,13,12,13,13,18};
//		HashSet<Integer> hs = new HashSet<Integer>();
//		for(int i=0;i<arr.length;i++) {
//			hs.add(arr[i]);
//		}
//		System.out.println(hs.size());
		
		Integer[] arr = {15,12,13,12,13,13,18};
		HashSet<Integer> hs = new HashSet<>(Arrays.asList(arr));
		System.out.println(hs.size());
	}

}
