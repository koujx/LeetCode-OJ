package LeetCode.test;

import java.io.IOException;
import java.util.ArrayList;

/**
 * created by koujx on 2016/2/29.
 */
public class javaTest {
    static ArrayList list;

	public static void main(String[] args) throws IOException {
		for (int i = 0; i < 20; i++) {
			abc(i);
		}
		System.out.println("list's size="+ list.size());
	}
	static void abc(int i){
		list.add(i);
	}
}
