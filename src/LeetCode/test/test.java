package LeetCode.test;

import LeetCode.problems.*;

/**
 * Created by koujx on 2016/1/22.
 * LeetCode OJ problems test
 */

public class test {
    private static ExcelSheet sheet = new ExcelSheet();
    private static NimGame nimGame = new NimGame();
    private static RemoveElements re = new RemoveElements();
    private static MoveZeroes mz = new MoveZeroes();
    private static Anagram ana = new Anagram();
    private static ContainsDuplicate cd = new ContainsDuplicate();
    private static NumberOf1Bits numbers = new NumberOf1Bits();

    public static void main(String[] args) {
/*        ListNode head = new ListNode(1);
        ListNode r = re.removeElements(head, 1);
        String s = "aaa";
        String t = "";
        System.out.println(ana.isAnagram(s, t));*/
        System.out.println(numbers.hammingWeight(7));
//        int[] nums = {};
//        System.out.println(cd.containsDuplicate(nums));
//        while (r != null) System.out.println(r.val + "->");
//        int[] num = {0, 0, 4, 0, 2, 1, 0, 3, 12};
//        mz.moveZeroes(num);
//        for (int i = 0; i < num.length; i++) {
//            System.out.print(num[i]+" ");
//        }

//        System.out.println(nimGame.canWinNim(1348820612));
//        for (int i = 0; i < 1000; i++) {
//            System.out.println(i + ":" + sheet.convertToTitle(i));
//        }
//        System.out.println(sheet.titleToNumber("s"));

        //        //66. Plus One
//        int[] num = new int[10];
//        for (int i = 0; i < 10; i++) {
//            num[i] = (int) (Math.random() * 10);
//        }
//
//        //67. Add Binary
//        String a = "110";
//        String b = "1";
//        System.out.println(code.addBinary(a, b));
//

/*		*//*2.Add Two Numbers
         * ListNode
		 *//*
    ListNode l1 = new ListNode(0);
    ListNode l2 = new ListNode(0);
    ListNode p1 = new ListNode(0);
    ListNode p2 = new ListNode(0);
    ListNode temp1 = new ListNode(0);
    ListNode temp2 = new ListNode(0);
    int d1 = 55;
    int d2 = 45;

    l1=p1;
    l2=p2;
    while((d1/10)!=0)
    ListNode l = addTwoNumbers(l1, l2);

    p1.val=d1%10;
    while((d2/10)!=0)

    {
        p1.val = d1 % 10;
        p1.next = new ListNode(0);
        temp1.val = p1.val;
        p1 = p1.next;
        d1 /= 10;
    }

    p2.val=d2%10;

    {
        p2.val = d2 % 10;
        p2.next = new ListNode(0);
        temp2.val = p2.val;
        p2 = p2.next;
        d2 /= 10;
    }
    while(l.next!=null)

    {
        System.out.print(l.val + "->");
        l = l.next;
    }

    System.out.println(l.val);*/

//        String s = "  ";
//        System.out.println(ojtest.lengthOfLongestSubstring(s));
//
//        int[] nums = new int[10000];
//        System.out.println(ojtest.reverse(-1000000004));
//
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = -i;
//            System.out.println(-i + ":" + ojtest.reverse(-i));
//            String string = null;
//            if (ojtest.isPowerofThree(i)) {
//                string = "true";
//                System.out.println(i + ":" + string);
//            } else {
//                string = "false";
//            }
//            System.out.println(i + ":" + string);
//        }
    }
}