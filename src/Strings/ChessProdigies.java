package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChessProdigies {

	public static void main(String[] args) {
		int[] arr = {-33,-10,-97};
		List<Integer> ans = chessProdigy(arr);
		for(int val : ans) {
			System.out.println(val);
		}

	}
	
	static List<Integer> chessProdigy(int[] rating) {
        List<Integer> temp = new ArrayList<Integer>();
        int sum = 0;
        for(int i=rating.length-1;i>=0;i--) {
            if(rating[i] >= sum) {
                temp.add(rating[i]);
            }
            sum = sum+rating[i];
        }
        Collections.reverse(temp);
        return temp;
    }

}
