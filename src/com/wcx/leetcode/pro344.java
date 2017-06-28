package com.wcx.leetcode;

/**
 * Created by wcx on 16-5-15.
 * Write a function that takes a string as input and returns the string reversed.
 * <p>
 * Example:
 * Given s = "hello", return "olleh".
 * <p>
 * Subscribe to see which companies asked this question
 */
public class pro344 {
    public String reverseString(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] tmp = new char[s.length()];
        while (i <= j) {
            tmp[i] = s.charAt(j);
            tmp[j] = s.charAt(i);
            i++;
            j--;
        }

        return new String(tmp);
    }

    public static void main(String[] args) {
        String s = "hello";
        s = new pro344().reverseString(s);
        System.out.printf(s);
    }
}
