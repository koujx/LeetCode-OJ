package com.kou.util;

/**
 * Created by koujx  on 2016/1/22.
 * 字符串反转
 */
public class Reverse {
    public static String stringReverse(String a) {
        if (a.length() < 2) return a;
        else return stringReverse(a.substring(1)) + a.charAt(0);
    }
}
