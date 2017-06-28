package com.wcx.leetcode;

/**
 * Created by wcx on 16-5-20.
 */
public class pro264 {
    public int nthUglyNumber(int n) {
        if(n <= 0){
            return -1;
        }
        int count = 0;
        int num=1;
        for(;count != n;num++){
            int tmp =num;
            while(tmp % 2 == 0){
                tmp /= 2;
            }
            while(tmp % 3 == 0){
                tmp /= 3;
            }
            while(tmp % 5 == 0){
                tmp /= 5;
            }
            if(tmp == 1){
                count++;
            }
        }
        return num-1;
    }

    public static void main(String[] args) {
        System.out.println(new pro264().nthUglyNumber(10));

    }
}
