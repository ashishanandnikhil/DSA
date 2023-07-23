package Hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class ChainingImplementation {
	
	int bucket;
	ArrayList<LinkedList<Integer>> table;
	
	ChainingImplementation(int b) {
		bucket = b;
		table = new ArrayList<LinkedList<Integer>>();
		for(int i=0;i<b;i++) {
			table.add(new LinkedList<Integer>());
		}
	}
	void insert(int key) {
		int i = key%bucket;
		table.get(i).add(key);
	}
	void remove(int key) {
		int i= key%bucket;
		table.get(i).remove(key);
	}
	boolean search(int key) {
		int i = key%bucket;
		return table.get(i).contains(key);
	}
	
}
