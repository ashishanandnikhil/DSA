package Strings;

import java.util.ArrayList;
import java.util.List;

public class ListInStrings {

	public static void main(String[] args) {
		List<String> lines = new ArrayList<String>();
		lines.add("budapest");
		lines.add("");
		lines.add("seattle");
		List<String> ans = atlas(lines);
		for (String val : ans) {
			System.out.println(val);
		}

	}

	public static List<String> atlas(List<String> words) {
		List<String> temp = new ArrayList<String>();
		temp.add(words.get(0));
		for (int i = 1; i < words.size(); i++) {
			if (words.get(i).equals("")) {
				break;
			}
			if (temp.get(i - 1).charAt(temp.get(i - 1).length() - 1) == words.get(i).charAt(0)) {
				temp.add(words.get(i));
			} else {
				break;
			}
		}
		return temp;
	}

}
