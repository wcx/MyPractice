package com.wcx.leetcode;

/**
 * Created by wcx on 16-5-20.
 */
public class pro263 {
    public boolean isUgly(int num) {
        while (num % 2 == 0) {
            num /= 2;
            System.out.println(2);
        }
        while (num % 3 == 0) {
            System.out.println(3);
            num /= 3;
        }
        while (num % 5 == 0) {
            System.out.println(5);
            num /= 5;
        }
        System.out.println(num);
        return num == 1;
    }

    public static void main(String[] args) {
        boolean b = new pro263().isUgly(1);
        System.out.println(b);
    }
}
