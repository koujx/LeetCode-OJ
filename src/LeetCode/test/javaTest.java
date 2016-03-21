package LeetCode.test;

/**
 * created by koujx on 2016/2/29.
 */
public class javaTest {
	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
//		Solution sol = new Solution(list);
//		sol.test();
//		for (Object aList : list) {
//			System.out.println(aList);
//		}

		System.out.println(new Integer(0) == null);
		boolean b = !true && (true == true ? false : true);
		System.out.println(b);

		String s1 = "abc";
		String s2 = new String("abc");
		String s3 = new String(s1);
		String s4 = s2;
		System.out.println(s1==s3);
	}
}
