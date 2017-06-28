package com.wcx.leetcode;

/**
 * Created by wcx on 16-5-18.
 * Number of 1 Bits
 * For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3
 */
public class pro191 {
    public static int hammingWeight(int n) {
        int val = 0 ^ n;
        int dist = 0;
        while (val !=0) {
            dist++;
            val &= val - 1;
        }
        return dist;
    }

    public static void main(String[] args) {
        int a = 2147483647;
        System.out.println(pro191.hammingWeight(a));

    }
}
