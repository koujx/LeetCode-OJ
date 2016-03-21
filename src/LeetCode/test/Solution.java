package LeetCode.test;

import java.util.ArrayList;

/**
 * created by koujx on 2016/2/29.
 */
public class Solution {
	private ArrayList list;

	public Solution(ArrayList list) {
		this.list = list;
	}

	public void test() {
		for (int i = 0; i < 20; i++) {
			abc(i);
		}
	}

	public void add(int i) {
		abc(i);
	}

	void abc(int i) {
		this.list.add(i);
	}
}
